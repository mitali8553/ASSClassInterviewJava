package com.example.Assignment.Assign.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.Assign.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
