package com.freeSite.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSchoolResponse {
	private String name;
	private String type;
	private String department;
	private String startDay;
	private String endDay;
	private float grade_avarage;
	private String cityName; 


}
