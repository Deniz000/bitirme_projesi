package com.freeSite.business.concretes;

import org.springframework.stereotype.Service;

import com.freeSite.business.abstracts.CandidateService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateCandidateRequest;
import com.freeSite.core.cloudinary.FileUploadService;
import com.freeSite.core.mappers.ModelMapperService;
import com.freeSite.core.results.Result;
import com.freeSite.core.results.SuccessResult;
import com.freeSite.dataAccess.abstracts.CandidateRepository;
import com.freeSite.entities.Candidate;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateManager implements CandidateService{

	private CandidateRepository candidateRepository;
	private ModelMapperService modelMapper;
	private FileUploadService fileUpload;
	
	@Override
	public Result add(CreateCandidateRequest candidateRequest) throws Exception {
		this.fileUpload.uploadFile(candidateRequest.getImage());
		
		Candidate candidate = this.modelMapper.forRequest().map(candidateRequest, Candidate.class);
		this.candidateRepository.save(candidate);
		return new SuccessResult("Data Eklendi");
	}

}
