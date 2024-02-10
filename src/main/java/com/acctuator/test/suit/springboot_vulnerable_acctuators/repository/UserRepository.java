package com.acctuator.test.suit.springboot_vulnerable_acctuators.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acctuator.test.suit.springboot_vulnerable_acctuators.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define additional query methods if needed
}
