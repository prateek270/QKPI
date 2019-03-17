package com.ndh.qkpi.dashboard.service;

import java.util.HashMap;

import com.ndh.qkpi.dashboard.entity.Users;

public interface UserService {


	public HashMap<String, Object> verifyUser(Users user);
}
