package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Project;
import entity.Student;

@Configuration
public class JavaConfigurationFile {
//	@Bean
//	public Student student1() {
//		return new Student(1,"raj","raj@gmail.com",4878743L);
//	}
//	
//	@Bean
//	public Student student2() {
//		return new Student(2,"rani","rani@gmail.com",4878743L);
//	}
	@Bean
	public Project project1() {
		return new Project(1,"EQ model","ML");
	}
	
	@Bean
	public Project project2() {
		return new Project(2,"SM model","Web based");
	}
	
	@Bean
	public Project project3() {
		return new Project(3,"DM model","Spring core");
	}
	
	@Bean
	public Student student3() {
		Student student = new Student();
		Project[] project = { project1(), project2(), project3() };
		student.setId(3);
		student.setName("reena");
		student.setEmail("reena@gmail.com");
		student.setPhnNo(754872L);
		student.setProjects(project);
		return student;
	}


}
