package com.chen.reponsitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.chen.entity.UserEntity;


public interface UserRepository  extends JpaRepository<UserEntity, Long> {

//    User findByName(String name);

}