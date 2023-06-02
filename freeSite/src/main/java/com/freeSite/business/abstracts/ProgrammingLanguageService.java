package com.freeSite.business.abstracts;

import java.util.List;

import com.freeSite.business.dtos.requests.CreateRequests.CreateProgrammingLanguageRequest;
import com.freeSite.business.dtos.responses.GetAllProgrammingLanguageResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

public interface ProgrammingLanguageService {
	public Result add(CreateProgrammingLanguageRequest programmingLanguageRequest) throws Exception;
	public DataResult<List<GetAllProgrammingLanguageResponse>> getAll();
	public Result deleteById(int id) throws Exception;

}
