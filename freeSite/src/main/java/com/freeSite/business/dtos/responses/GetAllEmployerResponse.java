package com.freeSite.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllEmployerResponse {
	private int id;
	private String email;
	private String password;
	private String companyName;
	private String webSiteAddress;
	private String phoneNumber;
}
