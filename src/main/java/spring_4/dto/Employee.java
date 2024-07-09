package spring_4.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int id;
	@Value("arvind")
	private String name;
	@Value("23")
	private int age;
	@Value("a@gmail.com")
	private String email;
	@Autowired
	private Company comp;
//	@Autowired
//	private Manager m;  //UnsatisfiedDependencyException
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", comp=" + comp + "]";
	}
}
