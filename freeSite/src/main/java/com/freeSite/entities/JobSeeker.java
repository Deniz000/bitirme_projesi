package com.freeSite.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_seekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="jobSeeker", cascade = CascadeType.ALL, orphanRemoval=true)
	@JsonIgnore
	private Candidate candidate;
	
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate birthYear;


}
