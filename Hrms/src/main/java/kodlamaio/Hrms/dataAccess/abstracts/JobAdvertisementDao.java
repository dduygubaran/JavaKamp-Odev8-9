package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository <JobAdvertisement, Integer> {
	List<JobAdvertisement> findByEmployer_IdIs(int employerId);
	
}
