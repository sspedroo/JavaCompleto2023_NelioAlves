package org.pedro.enums.entities;

import lombok.*;
import org.pedro.enums.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Departament departament) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        for(HourContract contract : contracts){
            if(contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year){
                sum+= contract.totalValue();
            }
        }
        return sum;
    }
}
