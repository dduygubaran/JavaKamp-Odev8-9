package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.EducationInformation;

public interface EducationInformationService {
	
	DataResult<List<EducationInformation>> getAll();
	Result add(EducationInformation educationInformation);

}
