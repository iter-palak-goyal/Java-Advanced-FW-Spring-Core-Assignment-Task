package xml_annotations.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Project {
//	@Value("1")
	private Integer id;
//	@Value("EQ model")
	private String name;
//	@Value("ML based")
	private String description;
	
	

}
