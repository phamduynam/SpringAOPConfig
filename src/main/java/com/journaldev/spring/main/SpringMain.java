package com.journaldev.spring.main;

import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
//
//		System.out.println(employeeService.getEmployee().getName());
//
//		employeeService.getEmployee().setName("Pankaj");
//
//		employeeService.getEmployee().throwException();
//
//		ctx.close();
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
		cxt.register(AppConfig.class);
		cxt.refresh();

		EmployeeService employeeService = cxt.getBean("employeeService",EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Pankaj");

		employeeService.getEmployee().throwException();
		cxt.close();
	}

}
