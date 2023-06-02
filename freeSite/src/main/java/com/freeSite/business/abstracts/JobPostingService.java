package com.freeSite.business.abstracts;

import java.util.List;

import com.freeSite.business.dtos.requests.CreateRequests.CreateJobPostingRequest;
import com.freeSite.business.dtos.requests.UpdateRequests.UpdateJobPostingRequest;
import com.freeSite.business.dtos.responses.GetAllJobPostingResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

public interface JobPostingService {
	public Result add(CreateJobPostingRequest jobPostingRequest) throws Exception;
	public DataResult<List<GetAllJobPostingResponse>> getAll();
	public Result update(UpdateJobPostingRequest jobPostingRequest) throws Exception;
	public Result deleteById(int id) throws Exception;
}
