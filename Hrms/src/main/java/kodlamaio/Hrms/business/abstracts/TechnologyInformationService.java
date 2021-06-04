package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.TechnologyInformation;

public interface TechnologyInformationService {
	
	DataResult<List<TechnologyInformation>> getAll();
	Result add(TechnologyInformation technologyInformation);

}
