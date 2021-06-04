package kodlamaio.Hrms.business.abstracts;

import java.util.List;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Cv;


public interface CvService {
	DataResult<List<Cv>> getAll();
	DataResult<List<Cv>> getByCandidate_CandidateId(int candidateId);
	Result add(Cv cv);
	
}
