package com.freeSite.business.abstracts;

import java.util.List;

import com.freeSite.business.dtos.requests.CreateRequests.CreateSchoolRequest;
import com.freeSite.business.dtos.responses.GetAllSchoolResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

public interface SchoolService {
	public Result add(CreateSchoolRequest schoolRequest) throws Exception;
	public DataResult<List<GetAllSchoolResponse>> getAll();
	public DataResult<List<GetAllSchoolResponse>> getAllSorted();

}
