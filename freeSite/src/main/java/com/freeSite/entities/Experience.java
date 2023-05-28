package com.freeSite.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "experiences")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @ManyToOne
    @JoinTable(name="candidate_id")
    private Candidate candidate;
    
    @ManyToOne
    @JoinTable(name="employer_id")
    private Employer employer;
    
    @ManyToOne
    @JoinTable(name="job_position_id")
    private JobPosition jobPosition;
    
    @OneToMany(mappedBy="experience")
    private List<Technology> technologies;

    private LocalDate startDay;
    private LocalDate endDay;
}
