package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer>{

}
