package com.consumeAPI.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.consumeAPI.main.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
