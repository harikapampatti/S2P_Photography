package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.LoginDto;
import com.app.entity.LoginResponse;
import com.app.repository.ILoginRepository;

@Service
@Transactional
public class LoginService {
	
	@Autowired
	ILoginRepository loginRepository;
	
	
	
	public LoginDto fetchUserDetails(String userName,String password) {
		
		//loginRepository.findById(userName);
		
		return null;
	}
	public LoginResponse createUser(LoginDto logindto) {
		
		LoginResponse loginResopnse = new LoginResponse();

		loginResopnse.setUserName(logindto.getUserName());
		loginResopnse.setPassword(logindto.getPassword());
		//System.out.println(loginResopnse);
		LoginResponse resp= loginRepository.save(loginResopnse);
		
		return resp;
		
	}
}
