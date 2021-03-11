package com.Nullmay.HoshinsLand.Tests;

import static com.Nullmay.HoshinsLand.Entities.Role.USER;
import static org.assertj.core.api.Assertions.assertThat;

import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.Collections;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DB_Test {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepo repository;

    @Test
    @Rollback(false)
    public void testFindNewUser() {

        User savedUser = repository.save(new User("Tests@ml.com", "Tests","Tests", Collections.singleton(USER)));assertThat(savedUser.getId()).isGreaterThan(0);

        assertThat(savedUser.getUsername().equals("Tests"));
        
        }

    }

