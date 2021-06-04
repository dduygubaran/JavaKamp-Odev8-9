package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.LanguageInformationService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LanguageInformation;

@RestController
@RequestMapping("/api/languageInformations")
public class LanguageInformationsController {

	private LanguageInformationService languageInformationService;

	@Autowired
	public LanguageInformationsController(LanguageInformationService languageInformationService) {
		super();
		this.languageInformationService = languageInformationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<LanguageInformation>> getAll() {
		return this.languageInformationService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody LanguageInformation languageInformation) {
		return this.languageInformationService.add(languageInformation);
	
	}
	
}
