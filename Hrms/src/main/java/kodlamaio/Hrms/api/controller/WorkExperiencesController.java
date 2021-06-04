package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.WorkExperienceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.WorkExperience;

@RestController
@RequestMapping("/api/workExperiences")
public class WorkExperiencesController {
	private WorkExperienceService workExperienceService;

	@Autowired
	public WorkExperiencesController(WorkExperienceService workExperienceService) {
		super();
		this.workExperienceService = workExperienceService;
	}
	
	   
	   @GetMapping("/getall")
		public DataResult<List<WorkExperience>> getAll() {
			return this.workExperienceService.getAll();
		}

		@PostMapping("/add")
		public Result add(@RequestBody WorkExperience workExperience) {
			return this.workExperienceService.add(workExperience);
		
		}
	
}
