package com.freeSite.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freeSite.business.abstracts.ProgrammingLanguageService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateProgrammingLanguageRequest;
import com.freeSite.business.dtos.responses.GetAllProgrammingLanguageResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/programmingLanguage")
@AllArgsConstructor
public class ProgrammingLanguageController {
	ProgrammingLanguageService programmingLanguageService;

	@PostMapping
	public ResponseEntity<Result> add(@Valid CreateProgrammingLanguageRequest pLanguageRequest) throws Exception{
		Result result = this.programmingLanguageService.add(pLanguageRequest);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping
	public ResponseEntity<DataResult<List<GetAllProgrammingLanguageResponse>>> getAll(){
		DataResult<List<GetAllProgrammingLanguageResponse>> responses= this.programmingLanguageService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(responses);
	}
	
	@DeleteMapping
	public ResponseEntity<Result> deleteById(int id) throws Exception{
		Result result = this.programmingLanguageService.deleteById(id);
		return ResponseEntity.ok(result);
	}

}
