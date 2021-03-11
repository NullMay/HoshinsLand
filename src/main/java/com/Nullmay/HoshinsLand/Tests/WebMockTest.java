package com.Nullmay.HoshinsLand.Tests;

import com.Nullmay.HoshinsLand.Controllers.RegistrationController;
import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.Nullmay.HoshinsLand.Entities.Role.USER;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(RegistrationController.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RegistrationController controller;

    @MockBean
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ObjectMapper objectMapper;
    @Test
    @Rollback(false)

    public void RegistrationContollerCheck() throws Exception {

       User user = new User("ERETest@test.com", "Testeroni","ZTest", Collections.singleton(USER));

            mockMvc
                .perform(post("/registration")
                .content(objectMapper.writeValueAsString(user)))
                .andExpect(status().is3xxRedirection());


//ToDo List: Services, Testing, Models,

    }
}

