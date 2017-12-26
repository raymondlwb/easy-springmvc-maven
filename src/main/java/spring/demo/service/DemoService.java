package spring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String Verify(String username,String password){
		
		if(username.equals("admin") && password.equals("admin")){
			return "Login Success！after add webhook222";
		}else{
			return "Login Failed,Please Try Again！after add webhook222";
		}
	}
}
