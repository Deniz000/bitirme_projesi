package com.freeSite.business.abstracts;

import java.util.List;

import com.freeSite.business.dtos.requests.CreateRequests.CreateCandidateRequest;
import com.freeSite.business.dtos.responses.GetAllCandidateResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

public interface CandidateService {
	public Result add(CreateCandidateRequest candidateRequest) throws Exception;
	public DataResult<List<GetAllCandidateResponse>> getAll();

}
