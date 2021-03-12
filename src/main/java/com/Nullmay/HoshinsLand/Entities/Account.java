package com.Nullmay.HoshinsLand.Entities;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    public Account(){ }

    public Account(Long id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float balance;
}
