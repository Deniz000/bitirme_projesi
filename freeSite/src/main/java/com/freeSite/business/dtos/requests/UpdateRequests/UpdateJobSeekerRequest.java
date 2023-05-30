package com.freeSite.business.dtos.requests.UpdateRequests;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateJobSeekerRequest {
	
	@Positive
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate birthYear;
	@Email(message="Geçersiz mail adresi")
	private String email;
	@Size(min=6)
	private String password;

}
