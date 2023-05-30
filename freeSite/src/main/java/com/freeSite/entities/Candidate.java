package com.freeSite.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidates")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @OneToMany(mappedBy="candidate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experience> experiences;

    @OneToMany(mappedBy="candidate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<School> schools;
    
    @OneToOne
	@JoinTable(name = "job_seekers_candidate", 
    joinColumns = 
      { @JoinColumn(name = "candidate_id", referencedColumnName = "id") },
    inverseJoinColumns = 
      { @JoinColumn(name = "job_seeker_id", referencedColumnName = "id") })
    private JobSeeker jobSeeker;
    
    private String coverLetter;
    private byte[] image;
    private String github;
    private String linkedIn;
    
}
