package kodlamaio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate","coverletter","educationinformation","languageinformation",
"socialmedia", "technologyinformation","workexperience"})
@Table(name="cvs")

public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@OneToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cv")
	private List<WorkExperience> workExperience;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cv")
	private List<LanguageInformation> languageInformation;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cv")
	private List<TechnologyInformation> technologyInformation;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetter;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cv")
	private List<SocialMedia> socialMedia;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cv")
	private List<EducationInformation> educationInformation;
}

