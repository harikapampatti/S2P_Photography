package com.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginDto;
import com.app.entity.LoginResponse;
import com.app.repository.ILoginRepository;
import com.app.service.LoginService;
//import com.app.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController  
public class LoginController {
	
	@Autowired
	LoginService loginService;
	

	
	@Autowired
	ILoginRepository loginRepository;
	
	@RequestMapping(value="/login")/*, method=RequestMethod.POST)*/
	  public LoginDto login(
			  @RequestParam("userName") String userName,
			  @RequestParam("password") String password){
				//loginService.fetchUserDetails(userName,password);
				LoginResponse loginResopnse = new LoginResponse() ;
				loginResopnse.setPassword(password);
				loginResopnse.setUserName(userName);
				System.out.println(loginResopnse);
				loginRepository.save(loginResopnse);
				System.out.println("saved successfully");
				return new LoginDto(userName);
		  
	  }
	@GetMapping(value="/doSignup")
	public LoginResponse doSignup(LoginDto loginDto ) {
		System.out.println(loginDto.getUserName());
		LoginResponse resp = loginService.createUser(loginDto);
		return resp;
	}
}
