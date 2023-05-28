package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer>{

}
