package com.fundamentospring.springboot.fundamentospringboot.component;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class ComponentTwoImplement implements ComponentDependency {

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo Desde Mi componente");
	}

}
