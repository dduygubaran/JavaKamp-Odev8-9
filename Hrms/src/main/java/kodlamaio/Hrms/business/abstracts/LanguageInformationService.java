package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.LanguageInformation;

public interface LanguageInformationService {
	
	DataResult<List<LanguageInformation>> getAll();
	Result add(LanguageInformation languageInformation);


}
