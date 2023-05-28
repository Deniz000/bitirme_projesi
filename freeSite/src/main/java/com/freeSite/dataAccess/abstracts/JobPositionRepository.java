package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.JobPosition;

public interface JobPositionRepository extends JpaRepository<JobPosition,Integer>{


}
