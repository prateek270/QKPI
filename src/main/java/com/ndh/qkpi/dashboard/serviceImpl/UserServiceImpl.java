package com.ndh.qkpi.dashboard.serviceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndh.qkpi.dashboard.entity.Users;
import com.ndh.qkpi.dashboard.repository.UserRepository;
import com.ndh.qkpi.dashboard.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public HashMap<String, Object> verifyUser(Users user) {
		
		HashMap<String , Object> hashMap = new HashMap<String, Object>();

		if(userRepository.findById(user.getUsername()).isPresent())
		{
			if(user.getPassword().equals(userRepository.findById(user.getUsername()).get().getPassword()))
			{
				hashMap.put("Status", "1");
				hashMap.put("Message", "Success");
			}
			else
			{
				hashMap.put("Status", "0");
				hashMap.put("Message", "Username or Password is Incorrect");
			}
		}
		else
		{
			hashMap.put("Status", "0");
			hashMap.put("Message", "You are not Authorized to use the App");
		}
		
		return hashMap;
		
	}
}
