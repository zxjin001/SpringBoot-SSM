package com.mapeak.smis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapeak.smis.dao.UserMapper;
import com.mapeak.smis.domain.User;
import com.mapeak.smis.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	//注入 UserMapper 接口对象
	@Resource
	private UserMapper dao;
	
	@Override
	public void save(User user) {
		//判断是添加还是修改
		if (user.getId() != null)
			dao.update(user);  //修改
		else
		dao.save(user);  //添加
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public List<User> findAll() {
		return dao.findAll();
	} 

	@Override
	public User findById(Long id) {
		return dao.findById(id);
	}

}