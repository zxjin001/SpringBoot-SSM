package com.mapeak.smis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
import com.mapeak.smis.domain.User;
import com.mapeak.smis.service.UserService;
import com.sun.tools.doclets.internal.toolkit.util.DocFinder.Input;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService service;
	
	//根据 id 查询
	@RequestMapping("/findById")
	public String findById(Long id, Model model){
		
		User user = this.service.findById(id);
		model.addAttribute("user", user);
		return "edit";
	}
	
	
	//补充方法，用于跳转到 input.html 页面
	@RequestMapping("/input")
	public String Input(){
		return "input";
	}
	
	//保存用户
	@RequestMapping("/save")
	public String save(User user) {
		this.service.save(user);
		return "success";
	}
	
	//用户列表展示
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> list = this.service.findAll();
		model.addAttribute("list", list);
		return "list";
	}
	
	//删除用户
	@RequestMapping("/delete")
	public String delete(Long id) {
		this.service.delete(id);
		
		//从定向到 list 
		return "redirect:/user/list";
	}
	
	
	
}
