package xml_annotations.execution;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import configuration.JavaConfigurationFile;
import xml_annotations.entity.Project;
import xml_annotations.entity.Student;

public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
		Student student = configurableApplicationContext.getBean(Student.class);
		System.out.println(student);
		Project project = student.getProject();
		System.out.println(project);
//		Project[] projects = student.getProjects();
//		for(Project p : projects)
//		{
//			System.out.println(p);
//		}
//		configurableApplicationContext.close();
	}
}
