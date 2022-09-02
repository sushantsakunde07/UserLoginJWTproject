package com.bridgelabz.userloginjwtproject.repository;

import com.bridgelabz.userloginjwtproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
