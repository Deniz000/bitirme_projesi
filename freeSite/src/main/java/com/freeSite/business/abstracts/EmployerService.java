package com.freeSite.business.abstracts;

import java.util.List;

import com.freeSite.business.dtos.requests.CreateRequests.CreateEmployerRequest;
import com.freeSite.business.dtos.requests.UpdateRequests.UpdateEmployerRequest;
import com.freeSite.business.dtos.responses.GetAllEmployerResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

public interface EmployerService {
	public Result add(CreateEmployerRequest employerRequest) throws Exception;
	public Result update(UpdateEmployerRequest employerjobRequest) throws Exception;
	public Result deleteById(int id) throws Exception;
	public DataResult<List<GetAllEmployerResponse>> getAll();
	

}
