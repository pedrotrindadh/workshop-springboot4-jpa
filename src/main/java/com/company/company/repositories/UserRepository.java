package com.company.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.company.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
