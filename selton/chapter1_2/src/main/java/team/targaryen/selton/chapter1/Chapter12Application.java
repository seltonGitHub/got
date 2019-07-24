package team.targaryen.selton.chapter1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("team.targaryen.selton.chapter1.dao")
public class Chapter12Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter12Application.class, args);
	}

}
