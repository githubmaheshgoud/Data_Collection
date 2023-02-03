package com.mahesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.entity.CreateCase;

public interface CreateCaseRepo extends JpaRepository<CreateCase, Integer> {

}
