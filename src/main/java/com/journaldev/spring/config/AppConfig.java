package com.journaldev.spring.config;

import com.journaldev.spring.aspect.*;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.EmployeeService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setName("Danny John");
        return employee;
    }
    @Bean
    public EmployeeService employeeService(Employee employee){
        EmployeeService employeeService = new EmployeeService();
        employeeService.setEmployee(employee);
        return employeeService;
    }

    @Bean
    public EmployeeAfterAspect employeeAfterAspect(){
        return new EmployeeAfterAspect();
    }

    @Bean
    public EmployeeAnnotationAspect employeeAnnotationAspect(){
        return new EmployeeAnnotationAspect();
    }

    @Bean
    public EmployeeAroundAspect employeeAroundAspect(){
        return new EmployeeAroundAspect();
    }

    @Bean
    public EmployeeAspect employeeAspect(){
        return new EmployeeAspect();
    }

    @Bean
    public EmployeeAspectJoinPoint employeeAspectJoinPoint(){
        return new EmployeeAspectJoinPoint();
    }

    @Bean
    public EmployeeAspectPointcut employeeAspectPointcut(){
        return  new EmployeeAspectPointcut();
    }
}
