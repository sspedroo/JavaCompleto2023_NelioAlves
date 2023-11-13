package org.pedro.herancaAndPolimorfismo.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Account {
    protected Integer number;
    protected String holder;
    @Setter(AccessLevel.NONE)
    protected Double balance;

    public void withdraw (Double amount){
        balance -= amount + 5.0;
    }

    public void deposit (Double amount){
        balance += amount;
    }

}
