package com.freeSite.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.freeSite.business.abstracts.TechnologyService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateTechnologyRequest;
import com.freeSite.business.dtos.responses.GetAllTechnologyResponse;
import com.freeSite.core.mappers.ModelMapperService;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;
import com.freeSite.core.results.SuccessDataResult;
import com.freeSite.core.results.SuccessResult;
import com.freeSite.dataAccess.abstracts.TechnologyRepository;
import com.freeSite.entities.Technology;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService{

	private TechnologyRepository technologyRepository;
	private final ModelMapperService modelMapper;
	
	@Override
	public Result add(CreateTechnologyRequest technologyRequest) throws Exception {
		Technology technology = this.modelMapper.forRequest().map(technologyRequest, Technology.class);
		this.technologyRepository.save(technology);
		return new SuccessResult("Data güncellendi!");
	}

	@Override
	public DataResult<List<GetAllTechnologyResponse>> getAll() {
		List<Technology> technologies = this.technologyRepository.findAll();
		List<GetAllTechnologyResponse> responses = technologies.stream()
				.map(technology -> this.modelMapper.forResponse().map(technology, GetAllTechnologyResponse.class))
				.collect(Collectors.toList());

		return new SuccessDataResult<List<GetAllTechnologyResponse>>(responses, "Data Listelendi");
	}
}
