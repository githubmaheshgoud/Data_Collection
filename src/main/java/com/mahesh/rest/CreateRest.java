package com.mahesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.entity.CreateCase;
import com.mahesh.entity.EducationData;
import com.mahesh.service.CreateCaseService;
import com.mahesh.service.EducationDataService;

@RestController
public class CreateRest {
	@Autowired
	private CreateCaseService service;
	@Autowired
	private EducationDataService eService;

	@PostMapping("/CaseNumber")
	public String getCaseNumber(@RequestBody CreateCase createCase) {
		String caseNumber = service.getCaseNumber(createCase);
		return caseNumber;

	}
	@PostMapping("/Data")
	public String getEducation(@RequestBody EducationData data) {
		String dataTwo = eService.getEducationData(data);
		return dataTwo;
		
	}

}
