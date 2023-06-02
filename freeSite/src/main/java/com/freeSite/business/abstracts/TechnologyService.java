package com.freeSite.business.abstracts;

import java.util.List;

import com.freeSite.business.dtos.requests.CreateRequests.CreateTechnologyRequest;
import com.freeSite.business.dtos.responses.GetAllTechnologyResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

public interface TechnologyService {
	public Result add(CreateTechnologyRequest technologyRequest) throws Exception;
	public DataResult<List<GetAllTechnologyResponse>> getAll();

}
