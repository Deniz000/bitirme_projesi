package com.freeSite.business.dtos.requests.CreateRequests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProgrammingLanguageRequest {

	private String name;

	private String level; 
    
    private int technologyId;
}
