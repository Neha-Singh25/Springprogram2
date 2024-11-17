package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
//	@Bean("stdObj")
//	public Student createStdBeanObj()
//	phir main mein bs stdObj name dekr krna okji.
	@Bean
	public Student stdId1() {
		Student std = new Student();
		std.setName("Neha");
		std.setRollno(103);
		std.setEmail("abbajsb@xghgvds");
		return std;
	}
}
