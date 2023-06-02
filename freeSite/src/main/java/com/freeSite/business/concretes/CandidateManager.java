package com.freeSite.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.freeSite.business.abstracts.CandidateService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateCandidateRequest;
import com.freeSite.business.dtos.responses.GetAllCandidateResponse;
import com.freeSite.core.cloudinary.FileUploadService;
import com.freeSite.core.mappers.ModelMapperService;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;
import com.freeSite.core.results.SuccessDataResult;
import com.freeSite.core.results.SuccessResult;
import com.freeSite.dataAccess.abstracts.CandidateRepository;
import com.freeSite.entities.Candidate;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateManager implements CandidateService {

	private CandidateRepository candidateRepository;
	private ModelMapperService modelMapperService;
	private FileUploadService fileUpload;

	@Override
	public Result add(CreateCandidateRequest candidateRequest) throws Exception {
		this.fileUpload.uploadFile(candidateRequest.getImage());

		Candidate candidate = this.modelMapperService.forRequest().map(candidateRequest, Candidate.class);
		this.candidateRepository.save(candidate);
		return new SuccessResult("Data Eklendi");
	}

	@Override
	public DataResult<List<GetAllCandidateResponse>> getAll() {
		List<Candidate> candidates = this.candidateRepository.findAll();
		List<GetAllCandidateResponse> responses = candidates.stream()
				.map(candidate -> this.modelMapperService.forResponse().map(candidates, GetAllCandidateResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllCandidateResponse>>(responses, "Data Listelendi!");
	}

}
