package com.freeSite.business.rules;

import org.springframework.stereotype.Service;

import com.freeSite.dataAccess.abstracts.EmployerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerBusinessRules {
	
	private EmployerRepository employerRepository;
	

	public void checkIfEMailExist(String email) throws Exception {
		if (this.employerRepository.existsByEmail(email)) {
			throw new Exception("Bu mail adresi sistemde zaten kayıtlı");
		}
	}
	

	public void checkIfEmployerExists(int employerId) throws Exception {
		if(!this.employerRepository.existsById(employerId)) {
			throw new Exception("Kullanıcı bulunamadı");
		}
	}

	private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	// domainin email domaini ile aynı mı farklı mı olduğunu kontrol eder.
	public void checkIfEmailMatchAndWebSite(String email, String webSite) throws Exception {

		String domain = webSite.replaceFirst("^(http://|https://)?(www\\.)?", "").split("/")[0];
		String emailDomain = email.split("@")[1];

		if (!email.matches(EMAIL_REGEX)) {
			throw new Exception("Invalid email address.");
		}
		if (!domain.equals(emailDomain)) {
			throw new Exception("Website and email domains do not match.");
		}
	}


}
