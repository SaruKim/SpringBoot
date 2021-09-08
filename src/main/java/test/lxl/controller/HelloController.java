package test.lxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import test.lxl.pojo.User;
import test.lxl.service.UserService;

import javax.sql.DataSource;

@RestController
public class HelloController {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private UserService userService;

	/**
	 * 根据用户id查询用户
	 * @param id 用户id
	 * @return 用户
	 */
	@GetMapping("/user/{id}")
	public User queryById(@PathVariable Long id) {
		return userService.queryById(id);
	}

	@GetMapping("hello")
	public String hello() {
		System.out.println("dataSource" + dataSource);
		return "Hello, Spring Boot";
	}
}
