package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.Technology;

public interface TechnologyRepository extends JpaRepository<Technology,Integer>{

}
