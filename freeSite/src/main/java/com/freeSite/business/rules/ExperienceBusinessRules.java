package com.freeSite.business.rules;

import org.springframework.stereotype.Service;

import com.freeSite.dataAccess.abstracts.ExperienceRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExperienceBusinessRules {
	private ExperienceRepository repository;
	
	public void checkIfExperienceExists(int experienceId) throws Exception {
		if(!this.repository.existsById(experienceId)) {
			throw new Exception("Deneyim bulunamadı");
		}
	}
}
