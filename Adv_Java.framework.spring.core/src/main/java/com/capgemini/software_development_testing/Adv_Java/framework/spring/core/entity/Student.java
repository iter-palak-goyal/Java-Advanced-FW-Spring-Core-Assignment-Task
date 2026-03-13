package com.capgemini.software_development_testing.Adv_Java.framework.spring.core.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable{
	private Integer id;
	private String name;
	private String email;
	private Long phnNo;
	private Project project;
}
