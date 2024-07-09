package spring_4.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_4.config.EmployeeConfig;
import spring_4.dao.CompanyDao;
import spring_4.dao.EmploeeDao;
import spring_4.dto.Company;
import spring_4.dto.Employee;
import spring_4.dto.Manager;
import spring_42.dto.Workers;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Company company=context.getBean(Company.class);
		System.out.println(company);
		
		Employee employee=context.getBean(Employee.class);
		System.out.println(employee);
		
//		CompanyDao cd=context.getBean(CompanyDao.class);
//		System.out.println(cd);
//		
//		EmploeeDao ed=context.getBean(EmploeeDao.class);
//		System.out.println(ed);
		
//		Manager m=context.getBean(Manager.class);
//		System.out.println(m);
		
//		Workers w=context.getBean(Workers.class);
//		System.out.println(w);
	}
}
