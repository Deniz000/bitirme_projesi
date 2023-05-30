package com.freeSite.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeSite.business.abstracts.JobSeekerService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateJobSeekerRequest;
import com.freeSite.business.dtos.requests.UpdateRequests.UpdateJobSeekerRequest;
import com.freeSite.business.dtos.responses.GetAllJobSeekerResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/jobseeker")
@AllArgsConstructor
public class JobSeekerController {
	private final JobSeekerService jobSeekerService;

	@PostMapping
	public ResponseEntity<Result> add(@Valid CreateJobSeekerRequest jobSeekerRequest) throws Exception{
		Result result = this.jobSeekerService.add(jobSeekerRequest);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping
	public ResponseEntity<DataResult<List<GetAllJobSeekerResponse>>> getAll(){
		DataResult<List<GetAllJobSeekerResponse>> responses= this.jobSeekerService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(responses);
	}
	
	@DeleteMapping
	public ResponseEntity<Result> deleteById(int id) throws Exception{
		Result result = this.jobSeekerService.deleteById(id);
		return ResponseEntity.ok(result);
	}

	
	@PutMapping
	public ResponseEntity<Result> update(@Valid UpdateJobSeekerRequest jobSeekerRequest) throws Exception{
		Result result = this.jobSeekerService.update(jobSeekerRequest);
		return ResponseEntity.ok(result);
	}

}
