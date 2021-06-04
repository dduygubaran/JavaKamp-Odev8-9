package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.Candidate;

public interface CandidateCheckService {
	
	boolean checkIfMailExist(Candidate candidate);
	boolean checkIfIdentityExist(Candidate candidate);
	boolean checkMailActivation();
	DataResult<List<Candidate>> findByEmailIs(String email);
	DataResult<List<Candidate>> findByIdentityNumberIs(String identityNumber);

}
