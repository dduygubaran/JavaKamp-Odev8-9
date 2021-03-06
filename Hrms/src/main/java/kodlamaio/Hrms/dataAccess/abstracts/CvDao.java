package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	
	List<Cv> getByCandidate_Id(int candidate_id);


}
