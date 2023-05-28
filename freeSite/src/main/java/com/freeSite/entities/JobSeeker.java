package com.freeSite.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	
	@OneToOne
	@JoinTable(name = "candidate_id", 
    joinColumns = 
      { @JoinColumn(name = "job_seeker_id", referencedColumnName = "id") },
    inverseJoinColumns = 
      { @JoinColumn(name = "candidate_id", referencedColumnName = "id") })
	private Candidate candidate;
	
	private String eail;
	private String password;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate birthYear;


}