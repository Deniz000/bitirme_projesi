package com.freeSite.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeSite.business.abstracts.CandidateService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateCandidateRequest;
import com.freeSite.core.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/candidate")
@AllArgsConstructor
public class CandidateController {
	
	private CandidateService candidateService;
	
	@PostMapping
	public ResponseEntity<Result> add(CreateCandidateRequest candidateRequest) throws Exception{
		Result result = this.candidateService.add(candidateRequest);
		return ResponseEntity.ok(result);
	}

}
