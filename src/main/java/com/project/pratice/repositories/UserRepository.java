package com.project.pratice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pratice.entities.User;


public interface UserRepository extends JpaRepository<User, Long>  {

}
