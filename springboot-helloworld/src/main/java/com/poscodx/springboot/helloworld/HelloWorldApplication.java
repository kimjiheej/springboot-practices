package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/** 
  
    1. 스프링 애플리케이션의 부트스트래핑 역할을 한다 : Bootstrapping 
    2. 설정 클래스 : Configuration Class 
 */
@SpringBootApplication
@ComponentScan 
public class HelloWorldApplication {
	/*
	  SpringApplication.run 안에서 일어나는 일 : Bootstrap 
	  
	   1. 어플리케이션 컨텍스 (Application Context 생성, Spring Container) 생성  
	   2. 만약, 웹애플리케이션이면 웹애플리케이션 타입 결정 (SpringMVC, Reactive) 
	   3. 어노테이션 스캐닝을 한다. + Configuration Class 를 통해서 빈 생성/등록/와이어링 
	   4. 만약 웹 어플리케이션이고 타입이 spring MVC 이면 
	   -- 내장(embedded) 서버 인스턴스 생성 
	   --- 서버 인스턴스에 웹 애플리케이션을 배포 
	   --  서버 인스턴스 실행 
	   5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context 에서 
	   
	   
	   
	 */
	
	 public static void main(String[] args) {
	        try (ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args)) {
	            // 애플리케이션 실행 코드
	        }
	        // catch 블록이 없습니다. 예외는 상위 호출 스택으로 전파됩니다.
	    }
}
