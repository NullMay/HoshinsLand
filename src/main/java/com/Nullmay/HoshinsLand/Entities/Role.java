package com.Nullmay.HoshinsLand.Entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    READRER,TRANSLATOR,ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
