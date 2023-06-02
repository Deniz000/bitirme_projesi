package com.freeSite.business.dtos.requests.CreateRequests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCandidateRequest {
	
	@NotNull
	private int jobSeekerId;
	
	@NotNull
	@NotBlank
	@Size(min=50)
	private String coverLetter;

	@NotNull
	@NotBlank
	private MultipartFile image; // şimdilk boş geçilebilecek.
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "(https?://)?(www\\.)?github\\.com/.+")
	private String github;

	@NotNull
	@NotBlank
	@Pattern(regexp = "(https?://)?(www\\.)?linkedin\\.com/.+")
	private String linkedIn;
}
