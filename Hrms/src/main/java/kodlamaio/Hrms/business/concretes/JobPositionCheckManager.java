package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionCheckService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionCheckManager implements JobPositionCheckService {
	
private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionCheckManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public boolean checkIfPositionExist(JobPosition jobPosition) {
		if(this.findByPositionIs(jobPosition.getPosition()).getData().size()!=0) {
			return false;

		}else {
			return true;
		}
	}

	@Override
	public DataResult<List<JobPosition>> findByPositionIs(String position) {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findByPositionIs(position));	
	}

}
