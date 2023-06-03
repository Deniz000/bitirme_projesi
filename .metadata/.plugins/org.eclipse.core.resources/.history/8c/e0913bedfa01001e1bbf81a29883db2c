package com.freeSite.api;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.freeSite.business.abstracts.SchoolService;
import com.freeSite.business.dtos.requests.CreateRequests.CreateSchoolRequest;
import com.freeSite.business.dtos.responses.GetAllSchoolResponse;
import com.freeSite.core.results.DataResult;
import com.freeSite.core.results.Result;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/schools")
@AllArgsConstructor
public class SchoolController {
	private SchoolService schoolService;

	@PostMapping
	public ResponseEntity<Result> add(@Valid CreateSchoolRequest schoolRequest) throws Exception{
		Result result = this.schoolService.add(schoolRequest);
		return ResponseEntity.ok(result);
	}

	@GetMapping
	public ResponseEntity<DataResult<List<GetAllSchoolResponse>>> getAll(){
		DataResult<List<GetAllSchoolResponse>> responses= this.schoolService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(responses);
	}
	
	
}
