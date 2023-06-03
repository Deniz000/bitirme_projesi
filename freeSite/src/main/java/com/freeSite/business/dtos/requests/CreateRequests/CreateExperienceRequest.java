package com.freeSite.business.dtos.requests.CreateRequests;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateExperienceRequest {
	@NotNull
	private int candidateId;

	@NotNull
	private int employerId;

	@NotNull
	private int jobPositionId;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@NotNull
	private LocalDate startDay;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate endDay;
}
