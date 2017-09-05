package com.weiyi.springboot;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @类描述:springboot 的启动类
 *
 * @创建人:Dengjk
 * @日期:2017年9月5日上午9:23:14
 * 
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		SpringApplication appliction =new SpringApplication(Application.class);
		
		appliction.setBannerMode(Mode.OFF);
		
		appliction.run(args);
		
	}
	
}
