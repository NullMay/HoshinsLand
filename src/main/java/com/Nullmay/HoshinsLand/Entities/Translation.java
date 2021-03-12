package com.Nullmay.HoshinsLand.Entities;

import javax.persistence.*;

@Entity
@Table(name = "translation")
public class Translation {

    public Translation(Long id) {
        this.id = id;
    }

    @Id
    private Long id;
}
