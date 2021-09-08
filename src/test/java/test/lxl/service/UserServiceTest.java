package test.lxl.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test.lxl.pojo.User;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void queryById() {
		User user = userService.queryById(8L);
		System.out.println(user);
	}

	@Test
	public void saveUser() {
		User user = new User();
		user.setUserName("test");
		user.setName("test");
		user.setAge(13);
		user.setPassword("123456");
		user.setSex(1);
		user.setCreated(LocalDateTime.now());
		userService.saveUser(user);
	}
}