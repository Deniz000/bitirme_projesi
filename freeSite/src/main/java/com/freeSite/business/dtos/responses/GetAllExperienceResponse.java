package com.freeSite.business.dtos.responses;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllExperienceResponse {
	private String companyName;
	private String positionName;
	private String startDay;
	private String endDay;
}
