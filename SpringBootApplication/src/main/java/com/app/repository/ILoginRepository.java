package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.LoginResponse;

@Repository
public interface ILoginRepository extends  CrudRepository	<LoginResponse, Long>{

	//LoginResponse findByName(String userName);
	
	
}
