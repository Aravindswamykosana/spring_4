package spring_4.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("Deloitee")
	private String name;
	@Value("manoj reddy")
	private String ceo;
	@Value("hyd")
	private String loc;
	@Override
	public String toString() {
		return "\nCompany [name=" + name + ", ceo=" + ceo + ", loc=" + loc + "]";
	}
	
	
}
