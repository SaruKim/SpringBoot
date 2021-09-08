package test.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * spring boot 工程都有一个启动引导类，这是工程的入口类
 * 只加载Application.java所在包及其子包下的内容
 * @author Administrator
 */
@SpringBootApplication
//扫描mybatis所有的业务mapper接口
//@MapperScan("test.lxl.mapper")
@MapperScan("test.lxl.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}
