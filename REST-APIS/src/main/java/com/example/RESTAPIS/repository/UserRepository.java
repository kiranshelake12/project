package com.example.RESTAPIS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RESTAPIS.entity.User;

public interface UserRepository extends JpaRepository <User , Integer> {

	

	

}
