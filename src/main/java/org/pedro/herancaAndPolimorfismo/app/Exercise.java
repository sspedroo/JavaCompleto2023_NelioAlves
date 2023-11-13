package org.pedro.herancaAndPolimorfismo.app;

import org.pedro.herancaAndPolimorfismo.entities.exercise.Employee;
import org.pedro.herancaAndPolimorfismo.entities.exercise.OutsourcedEmployee;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new LinkedList<>();

        int numberEmployee;
        System.out.print("Enter the number of employess: ");
        numberEmployee = sc.nextInt();

        for (int i = 1; i <= numberEmployee; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            String outsourced = sc.next();
            if (outsourced.equals("y")){
                OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee();
                System.out.print("Name: ");
                outsourcedEmployee.setName(sc.next());
                System.out.print("Hours: ");
                outsourcedEmployee.setHours(sc.nextInt());
                System.out.print("Value per hour: ");
                outsourcedEmployee.setValuePerHour(sc.nextDouble());
                System.out.print("Additional charge: ");
                outsourcedEmployee.setAdditionalCharge(sc.nextDouble());
                employeeList.add(outsourcedEmployee);
            } else {
                Employee employee = new Employee();
                System.out.print("Name: ");
                employee.setName(sc.next());
                System.out.print("Hours: ");
                employee.setHours(sc.nextInt());
                System.out.print("Value per hour: ");
                employee.setValuePerHour(sc.nextDouble());
                employeeList.add(employee);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee e : employeeList){
            System.out.println(e.getName() + " - $ " + e.payment());
        }

        sc.close();
    }
}
