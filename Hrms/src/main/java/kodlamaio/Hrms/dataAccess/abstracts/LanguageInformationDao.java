package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.LanguageInformation;

public interface LanguageInformationDao extends JpaRepository<LanguageInformation, Integer>{

}
