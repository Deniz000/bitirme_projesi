package com.freeSite.business.dtos.requests.CreateRequests;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSchoolRequest {
	
	@NotNull
	private int candidateId;
	
	@NotNull
	private int cityId;
	
	@NotNull
	@NotBlank
	private String name;
	
	@NotNull
	@NotBlank
	private String department;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@NotNull
	private LocalDate startDay;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate endDay;

	@NotNull
	private Float grade_avarage;

	@NotNull
	@NotBlank
	private String type;

}
