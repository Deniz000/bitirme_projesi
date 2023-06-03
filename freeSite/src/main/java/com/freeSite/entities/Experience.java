package com.freeSite.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="candidate_id")
    private Candidate candidate;
    
    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer;
    
    @ManyToOne
    @JoinColumn(name="job_position_id")
    private JobPosition jobPosition;
    
    @OneToMany(mappedBy="experience")
    private List<Technology> technologies;
    

    @OneToMany(mappedBy="experience")
    private List<ProgrammingLanguage> languages;

    private String startDay;
    private String endDay;
    

}
