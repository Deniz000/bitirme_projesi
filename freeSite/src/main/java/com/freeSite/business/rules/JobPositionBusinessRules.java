package com.freeSite.business.rules;

import org.springframework.stereotype.Service;

import com.freeSite.dataAccess.abstracts.JobPositionRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobPositionBusinessRules {
	
	private JobPositionRepository jobPositionRepository;
	
	public void checkIfJobPositiionExists(int jobPositionId) throws Exception {
		if(!this.jobPositionRepository.existsById(jobPositionId)) {
			throw new Exception("Id bulunamadı!");
		}
	}

}
