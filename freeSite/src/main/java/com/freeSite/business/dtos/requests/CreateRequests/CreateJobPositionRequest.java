package com.freeSite.business.dtos.requests.CreateRequests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateJobPositionRequest {

	@NotNull
	@NotBlank
	private String positionName;

}