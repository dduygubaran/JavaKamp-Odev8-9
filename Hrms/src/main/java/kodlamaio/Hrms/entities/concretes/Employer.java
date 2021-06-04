package kodlamaio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisement"})
public class Employer extends User{
	
	@Column(name="company_name")
	private String companyname;
	
	@Column(name="web_adress")
	private String webadress;
	
	@Column(name="phone")
	private String phone;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisement;
}
