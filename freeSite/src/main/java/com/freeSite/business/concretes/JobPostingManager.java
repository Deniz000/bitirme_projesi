package com.freeSite.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.freeSite.business.abstracts.JobPostingService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateJobPostingRequest;
import com.freeSite.business.dtos.requests.UpdateRequests.UpdateJobPostingRequest;
import com.freeSite.business.dtos.responses.GetAllJobPostingResponse;
import com.freeSite.business.rules.JobPostingBusinessRules;
import com.freeSite.core.mappers.ModelMapperService;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;
import com.freeSite.core.results.SuccessDataResult;
import com.freeSite.core.results.SuccessResult;
import com.freeSite.dataAccess.abstracts.JobPostingRepository;
import com.freeSite.entities.JobPosting;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor
public class JobPostingManager implements JobPostingService{
	private JobPostingRepository jobPostingRepository;
	private ModelMapperService modelMapperService;
	private final JobPostingBusinessRules businessRules;
	
	@Override
	public Result add(CreateJobPostingRequest jobPostingRequest) throws Exception {
		JobPosting jobPosting = this.modelMapperService.forRequest().map(jobPostingRequest, JobPosting.class);
		System.out.print("------------------"+jobPosting.getEmployer());

		this.jobPostingRepository.save(jobPosting);
		return new SuccessResult("Data Kaydedildi");
	}


	@Override
	public DataResult<List<GetAllJobPostingResponse>> getAll() {
		List<JobPosting> jobPostings = this.jobPostingRepository.findAll();
		List<GetAllJobPostingResponse> responses = jobPostings.stream()
				.map(jobPosting -> this.modelMapperService.forResponse().map(jobPosting, GetAllJobPostingResponse.class)).collect(Collectors.toList());
		return new SuccessDataResult<List<GetAllJobPostingResponse>>(responses, "Data Listelendi");
	}


	@Override
	public Result update(UpdateJobPostingRequest jobPostingRequest) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result deleteById(int id) throws Exception {
		this.businessRules.checkIfJobPostingExists(id);
		this.jobPostingRepository.deleteById(id);
		return new SuccessResult("Data Silindi");
	}

}
