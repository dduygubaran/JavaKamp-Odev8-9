package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.LanguageInformationService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.LanguageInformationDao;
import kodlamaio.Hrms.entities.concretes.LanguageInformation;
@Service
public class LanguageInformationManager implements LanguageInformationService{
	
	private LanguageInformationDao languageInformationDao;
	
	@Autowired
	public LanguageInformationManager(LanguageInformationDao languageInformationDao) {
		super();
		this.languageInformationDao = languageInformationDao;
	}

	@Override
	public DataResult<List<LanguageInformation>> getAll() {
		return new SuccessDataResult<List<LanguageInformation>>
		(this.languageInformationDao.findAll(),"Language Informations were listed");
	}

	@Override
	public Result add(LanguageInformation languageInformation) {
		this.languageInformationDao.save(languageInformation);
		return new SuccessResult("Language information was added");
	}

}
