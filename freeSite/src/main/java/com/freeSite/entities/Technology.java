package com.freeSite.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    private String name;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="experience_id")
    @OnDelete(action=OnDeleteAction.CASCADE)
    @JsonIgnore
    private Experience experience;
    

}
