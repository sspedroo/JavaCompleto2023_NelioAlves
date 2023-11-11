package org.pedro.herancaAndPolimorfismo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusinessAccount  extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
