package org.pedro.herancaAndPolimorfismo.app;

import org.pedro.herancaAndPolimorfismo.entities.Account;
import org.pedro.herancaAndPolimorfismo.entities.BusinessAccount;
import org.pedro.herancaAndPolimorfismo.entities.SavingAccount;

public class App {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 1000.0, 500.0);
        bacc.withdraw(200.0);
        System.out.println(bacc.getBalance());

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "BOB", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 1000.0, 0.01);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        // Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;

        //Testando se a variavel é um objeto que é uma instancia de businesse account, se for executa ação
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        Account x = new Account(1020, "Alex", 100.0);
        Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
