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
public class Product {
	@Value("1")
	private Integer id;
	@Value("pencil")
	private String name;
	@Value("Aspara")
	private String brand;
	@Value("34.33")
	private Double price;
	

}
