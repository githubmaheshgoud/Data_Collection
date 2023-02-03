
package com.mahesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor

@NoArgsConstructor

@Data

@Entity

@Table(name = "EducationData")
public class EducationData {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer edId;
	private String highstDegree;
	private Integer graduationYear;
	private String universityName;

	@OneToOne

	@JoinColumn(name = "Case Number")
	private CreateCase create;

}
