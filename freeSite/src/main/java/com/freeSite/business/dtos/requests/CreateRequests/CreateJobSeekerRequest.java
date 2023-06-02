package com.freeSite.business.dtos.requests.CreateRequests;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateJobSeekerRequest {

	@NotNull(message="İsminizi yazınız")
	@NotBlank
	@Size(min=3)
	private String firstName;

	@NotNull(message="Soyisminizi yazınız")
	@NotBlank
	@Size(min=2)
	private String lastName;
	
	@NotNull(message="Tc kimlik numaranızı boş bırakmayınız. ")
	@NotBlank
	@Size(min=11, max=11)
	private String nationalIdentity;

	@NotNull(message="Doğum yılınızı boş bırakmayınız. ")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate birthYear;

	@NotNull
	@NotBlank
	@Email(message="Geçersiz mail adresi")
	private String email;

	@NotNull
	@NotBlank 
	@Size(min=6)
	private String password;

//	@NotNull(message="Şfreyi tekrar giriniz")
//	@NotBlank
//	@Size(min=6)
//	private String confirmPassword;
//	
}
