package com.freeSite.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeSite.business.abstracts.JobPositionService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateJobPositionRequest;
import com.freeSite.business.dtos.requests.UpdateRequests.UpdateJobPositionRequest;
import com.freeSite.business.dtos.responses.GetAllJobPositionResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/jobpositions")
@AllArgsConstructor
public class JobPositionController {
	private final JobPositionService jobPositionService;
	
	@PostMapping
	public ResponseEntity<Result> add(@Valid CreateJobPositionRequest jobPositionRequest) throws Exception{
		Result result = this.jobPositionService.add(jobPositionRequest);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping
	public ResponseEntity<DataResult<List<GetAllJobPositionResponse>>> getAll(){
		DataResult<List<GetAllJobPositionResponse>> responses= this.jobPositionService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(responses);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Result> deleteById(@PathVariable int id) throws Exception{
		Result result = this.jobPositionService.deleteById(id);
		return ResponseEntity.ok(result);
	}

	
	@PutMapping
	public ResponseEntity<Result> update(@Valid UpdateJobPositionRequest jobPositionRequest) throws Exception{
		Result result = this.jobPositionService.update(jobPositionRequest);
		return ResponseEntity.ok(result);
	}

}
