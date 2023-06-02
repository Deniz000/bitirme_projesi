package com.freeSite.business.dtos.responses;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllJobSeekerResponse {
	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate birthYear;

}
