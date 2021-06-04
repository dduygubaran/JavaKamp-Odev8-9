package kodlamaio.Hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionCheckService;
import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Hrms.entities.concretes.JobPosition;


@Service //bu class projede service görevi görecek diye springe bilgi verir.
//Business görevini görecek kısımdır demek.

public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	private JobPositionCheckService jobPositionCheckService;
	
	@Autowired //spring gidip arka planda karşılık gelebilecek jobPositionDao'nın instence'ı
	//olabilecek bir tane sınıfı üretip verir.
	public JobPositionManager(JobPositionDao jobPositionDao, JobPositionCheckService jobPositionCheckService) {
		super();
		this.jobPositionDao = jobPositionDao;
		this.jobPositionCheckService = jobPositionCheckService;
	}
	
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
			return new SuccessDataResult<List<JobPosition>>
			(this.jobPositionDao.findAll(),"Jobs were listed");			
	}
	
	@Override
	public Result add(JobPosition jobPosition) {
		if(!this.jobPositionCheckService.checkIfPositionExist(jobPosition)) {
			return new ErrorResult("This position is already exist!");

		}else {
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult(jobPosition.getPosition()+" Job was added!");
		}
}
}
