package org.pedro.herancaAndPolimorfismo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public final class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance+= balance * interestRate;
    }

    @Override
    public final void withdraw(Double amount) {
        balance -= amount;
    }
}
