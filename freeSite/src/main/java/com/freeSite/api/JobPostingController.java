package com.freeSite.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeSite.business.abstracts.JobPostingService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateJobPostingRequest;
import com.freeSite.business.dtos.responses.GetAllJobPostingResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/jobposting")
@AllArgsConstructor
public class JobPostingController {
	private JobPostingService jobPostingService;

	@PostMapping
	public ResponseEntity<Result> add(@Valid CreateJobPostingRequest jobPostingRequest) throws Exception {
		Result result = this.jobPostingService.add(jobPostingRequest);
		return ResponseEntity.ok(result);
	}

	@GetMapping
	public ResponseEntity<DataResult<List<GetAllJobPostingResponse>>> getAll() {
		DataResult<List<GetAllJobPostingResponse>> responses = this.jobPostingService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(responses);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Result> deleteById(@PathVariable int id) throws Exception {
		Result result = this.jobPostingService.deleteById(id);
		return ResponseEntity.ok(result);
	}

}
