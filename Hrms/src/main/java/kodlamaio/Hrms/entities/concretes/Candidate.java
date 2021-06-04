package kodlamaio.Hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisement"})
@AllArgsConstructor
@NoArgsConstructor

public class Candidate extends User{
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//@Column(name="id")
	//private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birtdate")
	private String birtdate;
	
	@OneToMany(mappedBy="candidate")
	private List<Cv> cv;
	

}
