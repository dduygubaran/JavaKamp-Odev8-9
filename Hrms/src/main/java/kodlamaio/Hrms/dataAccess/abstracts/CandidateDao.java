package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Hrms.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository <Candidate, Integer> {
	List<Candidate> findByEmailIs(String email);
	List<Candidate> findByIdentityNumberIs(String identityNumber);
}
