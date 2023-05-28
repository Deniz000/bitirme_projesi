package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.JobPosting;

public interface JobPostingRepository extends JpaRepository<JobPosting,Integer>{

}
