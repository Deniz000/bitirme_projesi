package com.freeSite.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployerResponse {
	private int id;
	private String email;
	private String password;
	private String companyName;
	private String webSiteAddress;
	private String phoneNumber;
}
