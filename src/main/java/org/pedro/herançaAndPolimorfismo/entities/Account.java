package org.pedro.herançaAndPolimorfismo.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    protected Integer number;
    protected String holder;
    @Setter(AccessLevel.NONE)
    protected Double balance;

    public void withdraw (Double amount){
        balance -= amount;
    }

    public void deposit (Double amount){
        balance += amount;
    }

}
