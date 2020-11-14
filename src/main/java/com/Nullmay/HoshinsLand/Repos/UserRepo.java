package com.Nullmay.HoshinsLand.Repos;

import com.Nullmay.HoshinsLand.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {

}
