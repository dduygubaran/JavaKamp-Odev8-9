package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.EducationInformation;

public interface EducationInformationDao extends JpaRepository <EducationInformation, Integer>{

}
