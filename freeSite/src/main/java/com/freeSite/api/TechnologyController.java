package com.freeSite.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeSite.business.abstracts.TechnologyService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateTechnologyRequest;
import com.freeSite.business.dtos.responses.GetAllTechnologyResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/technology")
@AllArgsConstructor
public class TechnologyController {
	private TechnologyService technologyService;
	

	@PostMapping
	public ResponseEntity<Result> add(CreateTechnologyRequest technologyRequest) throws Exception {
		Result result = this.technologyService.add(technologyRequest);
		return ResponseEntity.ok(result);
	}

	@GetMapping
	public ResponseEntity<DataResult<List<GetAllTechnologyResponse>>> getAll() {
		DataResult<List<GetAllTechnologyResponse>> responses = this.technologyService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(responses);
	}

//	@DeleteMapping("/{id}")
//	public ResponseEntity<Result> deleteById(@PathVariable int id) throws Exception {
//		//Result result = this.technologyService.deleteById(id);
//		return ResponseEntity.ok(result);
//	}

}
