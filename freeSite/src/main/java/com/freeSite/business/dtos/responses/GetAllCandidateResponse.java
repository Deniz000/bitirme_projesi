package com.freeSite.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCandidateResponse {
	private int id;
	private int jobSeekerId;
	private String imageUrl;
	private String coverLetter;
	private String github;
	private String linkedIn;
}
