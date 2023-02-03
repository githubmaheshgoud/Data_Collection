package com.mahesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.entity.EducationData;

public interface EducationDataRepo extends JpaRepository<EducationData, Integer> {

}
