package com.freeSite.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.freeSite.business.abstracts.EmployerService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateEmployerRequest;
import com.freeSite.business.dtos.requests.UpdateRequests.UpdateEmployerRequest;
import com.freeSite.business.dtos.responses.GetAllEmployerResponse;
import com.freeSite.business.rules.EmployerBusinessRules;
import com.freeSite.core.mappers.ModelMapperService;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;
import com.freeSite.core.results.SuccessDataResult;
import com.freeSite.core.results.SuccessResult;
import com.freeSite.dataAccess.abstracts.EmployerRepository;
import com.freeSite.entities.Employer;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerManager implements EmployerService {

	private final EmployerRepository employerRepository;
	private final ModelMapperService modelMapper;
	private final EmployerBusinessRules businessRules;

	@Override
	public Result add(CreateEmployerRequest employerRequest) throws Exception {

		this.businessRules.checkIfEMailExist(employerRequest.getEmail());
		this.businessRules.checkIfEmailMatchAndWebSite(employerRequest.getEmail(), employerRequest.getWebSiteAddress());

		Employer employer = this.modelMapper.forRequest().map(employerRequest, Employer.class);
		this.employerRepository.save(employer);
		return new SuccessResult("Data eklendi");
	}

	@Override
	public Result update(UpdateEmployerRequest employerRequest) throws Exception {
		this.businessRules.checkIfEmployerExists(employerRequest.getId());

		//maiiil adresi eklenmedi this.businessRules.checkIfEMailExist(employerRequest());

		Employer employer = this.modelMapper.forRequest().map(employerRequest, Employer.class);

		this.employerRepository.save(employer);

		return new SuccessResult("Data güncellendi!");
	}

	@Override
	public Result deleteById(int id) throws Exception {
		this.businessRules.checkIfEmployerExists(id);
		this.employerRepository.deleteById(id);	
		return new SuccessResult("Data Silindi");
	}

	@Override
	public DataResult<List<GetAllEmployerResponse>> getAll() {
		List<Employer> employers = this.employerRepository.findAll();
		List<GetAllEmployerResponse> responses = employers.stream()
				.map(employer -> this.modelMapper.forResponse().map(employer, GetAllEmployerResponse.class))
				.collect(Collectors.toList());

		return new SuccessDataResult<List<GetAllEmployerResponse>>(responses, "Data Listelendi");
	}

}
