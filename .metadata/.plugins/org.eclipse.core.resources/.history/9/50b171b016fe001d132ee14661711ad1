package com.freeSite.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_postings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @ManyToOne
    @JoinTable(name="employer_id")
    private Employer employer;
    
    @ManyToOne
    @JoinTable(name="job_position_id")
    private JobPosition jobPosition;
    
    @ManyToMany
    @JoinTable(
    		name="cities", 
    		joinColumns= @JoinColumn(name="job_posting_id"),
    		inverseJoinColumns=@JoinColumn(name="city_id"))
    private List<City> cities;
    private int maxSalary;
    private int minSalary;
    private int openPositionCount;
    private LocalDate publishDate;
    private LocalDate applicationDeadline;
    private String description;
    private boolean isActive;
    

}
