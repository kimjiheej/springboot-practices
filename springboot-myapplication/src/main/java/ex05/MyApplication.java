package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ex05.component.MyComponent;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
      
    	ApplicationContext ac = SpringApplication.run(MyApplication.class, args);
      MyComponent myComponent =  ac.getBean(MyComponent.class);
      myComponent.printHello();
        }
    }
