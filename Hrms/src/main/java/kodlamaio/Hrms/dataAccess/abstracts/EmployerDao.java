package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Hrms.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository <Employer, Integer> {
	List<Employer> findByEmailIs(String email);
	}

