package test.lxl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import test.lxl.interceptor.MyInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	//注册拦截器
	@Bean
	public MyInterceptor myInterceptor() {
		System.out.println("我修改了");
		return new MyInterceptor();
	}

	//添加拦截器到Spring mvc 拦截器链
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
	}
}
