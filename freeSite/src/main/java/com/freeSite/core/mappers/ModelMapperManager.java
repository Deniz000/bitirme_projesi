package com.freeSite.core.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService{

	private ModelMapper modelMapper;
	
//	@Override
//	public ModelMapper forRequest() {
//		this.modelMapper.getConfiguration()
//		.setAmbiguityIgnored(true)
//		.setPropertyCondition(Conditions.isNotNull())
//		.setMatchingStrategy(MatchingStrategies.STRICT)
//	    .setFieldMatchingEnabled(true);
//	   // .setMethodAccessLevel(AccessLevel.PRIVATE);
//		return this.modelMapper;
//	}
	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setSkipNullEnabled(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
	}

	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		
		return this.modelMapper;
	}
}
