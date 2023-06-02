package com.freeSite.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllProgrammingLanguageResponse {
	private int id;

	private String name;

	private String level; 
    
    private String technologyName;
}
