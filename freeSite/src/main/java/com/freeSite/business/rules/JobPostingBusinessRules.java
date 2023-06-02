package com.freeSite.business.rules;

import org.springframework.stereotype.Service;

import com.freeSite.dataAccess.abstracts.JobPostingRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobPostingBusinessRules {
	private JobPostingRepository jobPostingRepository;
	
	public void checkIfJobPostingExists(int jobPostingId) throws Exception {
		if(!this.jobPostingRepository.existsById(jobPostingId)) {
			throw new Exception("İş ilanı bulunamadı!");
		}
	}
 }
