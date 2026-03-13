package xml_annotations.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Student {
	@Value("1")
	private Integer id;
	@Value("tira")
	private String name;
	@Value("tira@gmail.com")
	private String email;
	@Value("87483786")
	private Long phnNo;
	@Autowired
	private Project[] projects;
	

}
