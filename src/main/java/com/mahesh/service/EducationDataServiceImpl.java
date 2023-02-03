package com.mahesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.entity.EducationData;
import com.mahesh.repository.EducationDataRepo;

@Service
public class EducationDataServiceImpl implements EducationDataService {
	@Autowired
	private EducationDataRepo rep;

	public String getEducationData(EducationData data) {
	
	
		EducationData dataOne = rep.save(data);
		if (dataOne != null) {
			return "EducationDetails added in DB";
		} else {
			return "Education Details Not stored";
		}
	}
}
