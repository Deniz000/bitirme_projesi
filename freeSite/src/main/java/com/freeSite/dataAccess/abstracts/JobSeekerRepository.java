package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.JobSeeker;

public interface JobSeekerRepository extends JpaRepository<JobSeeker,Integer>{


}
