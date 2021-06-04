package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.JobPosition;

public interface JobPositionCheckService {
	
	boolean checkIfPositionExist(JobPosition jobPosition);
	DataResult<List<JobPosition>> findByPositionIs(String position);

}
