package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.TechnologyInformationService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.TechnologyInformationDao;
import kodlamaio.Hrms.entities.concretes.TechnologyInformation;

@Service
public class TechnologyInformationManager implements TechnologyInformationService {
	
	private TechnologyInformationDao technologyInformationDao;
	
	@Autowired
	public TechnologyInformationManager(TechnologyInformationDao technologyInformationDao) {
		super();
		this.technologyInformationDao = technologyInformationDao;
	}

	@Override
	public DataResult<List<TechnologyInformation>> getAll() {
		return new SuccessDataResult<List<TechnologyInformation>>
		(this.technologyInformationDao.findAll(),"Technology Informations were listed");
	}

	@Override
	public Result add(TechnologyInformation technologyInformation) {
		this.technologyInformationDao.save(technologyInformation);
		return new SuccessResult("Technology Informations were added");
	}

}
