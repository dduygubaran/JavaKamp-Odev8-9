package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
