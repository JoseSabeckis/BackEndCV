package com.floresjose.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floresjose.app.entity.persona;

@Repository
public interface IPersonaRepository extends JpaRepository<persona, Long>{

}
