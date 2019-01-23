package com.mapeak.smis.dao;

import java.util.List;

import com.mapeak.smis.domain.User;

public interface UserMapper {
	
	//添加用户
	public void save(User user);
	
	
	//查找所有用户
	public List<User> findAll();
	
	
	//根据 ID 查找用户
	public User findById(Long id);
	
	
	//更新用户
	public void update(User user);
	
	
	//根据 ID 删除用户
	public void delete(Long id);
	
}
