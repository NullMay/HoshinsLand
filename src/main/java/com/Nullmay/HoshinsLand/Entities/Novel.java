package com.Nullmay.HoshinsLand.Entities;

import javax.persistence.*;

@Entity
@Table(name = "novels")
public class Novel {

    public Novel(Long id) {
        this.id = id;
    }

    @Id
    private Long id;
    
}
