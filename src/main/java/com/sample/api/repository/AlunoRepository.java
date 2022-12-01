package com.sample.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.api.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>   {
	


}
