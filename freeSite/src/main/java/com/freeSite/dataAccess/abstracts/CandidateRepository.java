package com.freeSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freeSite.entities.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Integer>{

	//buna gerek yok aslında q
	
//	@Query("SELECT c, e, s FROM Candidate c " +
//		       "LEFT JOIN c.experiences e " +
//		       "LEFT JOIN c.schools s " +
//		       "WHERE c.id = :candidateId")
//		List<CandidateWithDetailsResponse> getCandidateWithDetails(int candidateId);

//    "LEFT JOIN e.technologies t " +

}
