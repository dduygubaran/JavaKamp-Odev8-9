package kodlamaio.Hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateCheckService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.entities.concretes.Candidate;

@Service
public class CandidateCheckManager implements CandidateCheckService {
	
	private CandidateDao candidateDao;
	@Autowired
	public CandidateCheckManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public boolean checkIfMailExist(Candidate candidate) {
		if(this.findByEmailIs(candidate.getEmail()).getData().size()!=0) {
			
			return false;
		}
		else {
			return true;
		}
			}
	
	@Override
	public boolean checkIfIdentityExist(Candidate candidate) {

		if(this.findByIdentityNumberIs(candidate.getIdentityNumber()).getData().size()!=0) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkMailActivation() {
		return true;
	}

	@Override
	public DataResult<List<Candidate>> findByEmailIs(String email) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findByEmailIs(email));
	}

	@Override
	public DataResult<List<Candidate>> findByIdentityNumberIs(String identityNumber) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findByIdentityNumberIs(identityNumber));
	}

	

}
