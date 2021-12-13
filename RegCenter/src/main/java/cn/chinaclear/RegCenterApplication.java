package cn.chinaclear;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "cn.chinaclear")
public class RegCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegCenterApplication.class,args);
    }
}
