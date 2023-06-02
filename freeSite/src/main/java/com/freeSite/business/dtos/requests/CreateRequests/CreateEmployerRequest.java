package com.freeSite.business.dtos.requests.CreateRequests;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateEmployerRequest {

	@NotNull
	@NotBlank
	private String companyName;

	@NotNull
	@NotBlank
	@URL(message="Geçersiz web adresi")
	private String webSiteAddress;

	@NotNull
	@NotBlank
	@Size(min=10,max=11)
    private String phoneNumber;
	//@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "Geçersiz telefon numarası")

	@NotNull
	@NotBlank
	@Email(message= "Geçersiz eposta adresi")
	private String email;

	@NotNull
	@NotBlank
	@Size(min = 6, message = "Minimum 6 karakter girmelisiniz")
	private String password;

//	@NotNull()
//	@NotBlank
//	@Size(min = 6, message = "Minimum 6 karakter girmelisiniz")
//	private String confirmPassword;
}
