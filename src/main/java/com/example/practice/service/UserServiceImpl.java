package com.example.practice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.practice.dto.UserDto;
import com.example.practice.repositry.UserRepositry;

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepositry userRepositry;

	@Override
	public void addUser(UserDto userDto) {
       if(userDto==null) {
    	   
       }
	}
}
