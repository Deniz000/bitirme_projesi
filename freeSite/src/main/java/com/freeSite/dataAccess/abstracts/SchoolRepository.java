package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.School;

public interface SchoolRepository extends JpaRepository<School,Integer>{

}
