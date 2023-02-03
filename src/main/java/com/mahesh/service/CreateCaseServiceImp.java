package com.mahesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.entity.CreateCase;
import com.mahesh.repository.CreateCaseRepo;

@Service
public class CreateCaseServiceImp implements CreateCaseService {
	@Autowired
	private CreateCaseRepo repo;

	public String getCaseNumber(CreateCase createCase) {
		CreateCase number = repo.save(createCase);

		if (number != null) {
			return "number added";
		} else

			return "not added yet";
	}

}
