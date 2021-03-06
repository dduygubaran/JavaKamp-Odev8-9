package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CvService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CvDao;
import kodlamaio.Hrms.entities.concretes.Cv;

@Service
public class CvManager implements CvService {
	
	private CvDao cvDao;
	
	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll(),"Cv viewed");
	}

	@Override
	public DataResult<List<Cv>> getByCandidate_CandidateId(int candidateId) {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll(),"All Resumes Listed By Candidate");
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv was added");
	}

}
