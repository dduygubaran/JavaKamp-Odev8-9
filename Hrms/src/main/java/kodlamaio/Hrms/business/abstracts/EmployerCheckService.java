package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.Employer;


public interface EmployerCheckService {
	
	boolean checkIfMailExist (Employer employer);
	boolean checkMailActivation();
	boolean checkRegisterActivationByEmployee();
	DataResult<List<Employer>> findByEmailIs(String email);
	boolean checkIfMailDomain(Employer employer);
}
