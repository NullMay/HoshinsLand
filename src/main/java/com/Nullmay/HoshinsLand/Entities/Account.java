package com.Nullmay.HoshinsLand.Entities;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @CollectionTable(name = "account_id", joinColumns = @JoinColumn(name = "user_id"))
    private int id;

    private int balance;
}
