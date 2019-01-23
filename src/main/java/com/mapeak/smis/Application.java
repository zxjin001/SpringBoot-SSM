package com.mapeak.smis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//SpringBoot 的启动器
//加上这个注解，才能作为启动器
//这个 SpringBoot 的启动器必须要放在
//所有 Controller 控制器的外面（看包名）
@SpringBootApplication

//@MapperScan 作用是扫描  Mybatis 的 Mapper 接口的包
@MapperScan("com.mapeak.smis.dao")
public class Application {

	 public static void main(String[] args)
     {
         SpringApplication.run(Application.class,
        		 args);
     }
}
 