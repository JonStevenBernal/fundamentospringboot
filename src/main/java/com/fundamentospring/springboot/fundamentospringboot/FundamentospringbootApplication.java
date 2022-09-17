package com.fundamentospring.springboot.fundamentospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentospring.springboot.fundamentospringboot.component.ComponentDependency;

@SpringBootApplication
//@RequiredArgsConstructor
public class FundamentospringbootApplication implements CommandLineRunner {
	
//	Inyectar Dependencia
	private final ComponentDependency componentDependency;
	
//	Constructor - @Qualifier - indica que dependencia quiero implementar
	@Autowired
	public FundamentospringbootApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(FundamentospringbootApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		componentDependency.saludar();
		
	}

}
