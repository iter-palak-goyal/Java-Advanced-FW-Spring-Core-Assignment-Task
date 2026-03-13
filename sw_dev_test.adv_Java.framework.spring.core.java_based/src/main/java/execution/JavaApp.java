package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Project;
import entity.Student;

public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
//		Student student1  = configurableApplicationContext.getBean("student1",Student.class);
//		System.out.println(student1);
//		Student student2  = configurableApplicationContext.getBean("student2",Student.class);
//		System.out.println(student2);
		Student student3  = configurableApplicationContext.getBean("student3",Student.class);
		System.out.println(student3);
		Project[] projects = student3.getProjects();

		for(Project project : projects) {
			System.out.println(project);
		}
		configurableApplicationContext.close();
	}
}
