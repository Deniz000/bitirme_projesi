package com.freeSite.business.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandidateRequest {
	private int jobSeekerId;
	private String coverLetter;
	private byte[] image;
	private String github;
	private String linkedIn;
}
