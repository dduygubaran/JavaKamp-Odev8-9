package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.TechnologyInformation;

public interface TechnologyInformationDao extends JpaRepository<TechnologyInformation, Integer> {

}
