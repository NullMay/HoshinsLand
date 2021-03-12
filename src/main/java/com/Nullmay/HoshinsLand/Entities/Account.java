package com.Nullmay.HoshinsLand.Entities;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    @Id
    private long id;

    private float balance;
}
