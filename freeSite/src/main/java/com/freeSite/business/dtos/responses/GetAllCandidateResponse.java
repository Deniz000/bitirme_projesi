package com.freeSite.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCandidateResponse {
	private int jobSeekerId;
	private String coverLetter;
	private byte[] image; // şimdilk boş geçilebilecek.
	private String github;
	private String linkedIn;
}
