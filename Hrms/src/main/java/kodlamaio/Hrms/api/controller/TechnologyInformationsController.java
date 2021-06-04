package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.TechnologyInformationService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.TechnologyInformation;

@RestController
@RequestMapping("/api/technologyInformations")
public class TechnologyInformationsController {

   private TechnologyInformationService technologyInformationService;

   @Autowired
   public TechnologyInformationsController(TechnologyInformationService technologyInformationService) {
	super();
	this.technologyInformationService = technologyInformationService;
}
   
   @GetMapping("/getall")
	public DataResult<List<TechnologyInformation>> getAll() {
		return this.technologyInformationService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody TechnologyInformation technologyInformation) {
		return this.technologyInformationService.add(technologyInformation);
	
	}
	
   
   
}
