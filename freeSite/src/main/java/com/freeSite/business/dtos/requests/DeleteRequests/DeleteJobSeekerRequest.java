package com.freeSite.business.dtos.requests.DeleteRequests;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteJobSeekerRequest {

	@NotNull
	@Positive
	private int jobSeekerId;
}
