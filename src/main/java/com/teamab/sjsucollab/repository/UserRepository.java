package com.teamab.sjsucollab.repository;

import com.teamab.sjsucollab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
