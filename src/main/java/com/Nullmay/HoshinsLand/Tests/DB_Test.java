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
import java.util.List;


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

        User savedUser =repository.save(new User("Tests@ml.com", "Tests","Tests", Collections.singleton(USER)));
        User user2 = repository.save(new User("Naik@gmail.com", "ZDE","12333333", Collections.singleton(USER)));
        User user3 = repository.save(new User("Naisdfsdk@gmail.com", "FREEE","12werwe", Collections.singleton(USER)));

        List<User>users = repository.findAll();
        users.toString();
      //  assertThat(savedUser.getUsername().equals("Tests"));
        
        }

    }

