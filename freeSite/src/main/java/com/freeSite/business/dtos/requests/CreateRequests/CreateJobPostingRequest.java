package com.freeSite.business.dtos.requests.CreateRequests;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CreateJobPostingRequest {

	@NotNull(message = "Pozisyon alanı boş bırakılmamalı!")
	private int jobPositionId;

	@NotNull(message = "Şirket alanı boş bırakılmamalı!")
	private int employerId;

	@NotNull
	private int cityId;
	
	@NotNull
	private int minSalary;

	@NotNull
	private int maxSalary;

	@NotNull
	private int openPositionCount;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@NotNull(message = "Yayın tarihini boş bırakamazsınız")
	private LocalDate publishDate;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@NotNull(message = "Deadline tarihini boş bırakamazsınız")
	private LocalDate applicationDeadline;

	@NotNull
	@Size(min = 10)
	private String description;

	@NotNull
	private boolean isActive;


}
