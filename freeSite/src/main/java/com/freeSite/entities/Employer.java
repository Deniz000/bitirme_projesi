package com.freeSite.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy="employer")
	private List<JobPosting> jobPosting;

	@OneToMany(mappedBy="employer")
	private List<Experience> experiences;

	@OneToMany(mappedBy="employer")
	private List<School> schools;
	
	private String email;
	private String password;
	private String companyName;
	private String webSiteAddress;
	private String phoneNumber;
	
	
}