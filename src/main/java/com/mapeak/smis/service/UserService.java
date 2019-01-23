package com.mapeak.smis.service;

import java.util.List;

import com.mapeak.smis.domain.User;

public interface UserService {

	//保存用户
	public void save(User user);
	
	//查找所有用户
	public List<User> findAll();
	
	//根据 ID 查找用户
	public User findById(Long id);
	
	//根据 ID 删除哟用户
	public void delete(Long id);
	
}
