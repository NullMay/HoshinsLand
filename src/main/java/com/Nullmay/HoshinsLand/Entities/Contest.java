package com.Nullmay.HoshinsLand.Entities;

import javax.persistence.*;

@Entity
@Table(name = "contests")
public class Contest {

    public Contest(Long id) {
        this.id = id;
    }

    @Id
    private Long id;

}
