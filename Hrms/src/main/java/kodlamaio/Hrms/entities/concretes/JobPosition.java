package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	//Bir classın hangi katmana karşılık geldiğini sorar. Bir classın çalışma anında bilgi toplamak için kullanılan anatosyon yapısır.
         //Jpa alt yapısını kullanır.

@Data      //lombok ile getter setter metotları getirilmiş oldu
		
@Table(name="job_positions") //Hangi tabloya karşılk geldiği table ile sağlanır.
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisement"})
public class JobPosition {
	
		@Id //İşlemlerini id'ye göre yapılır. Sorgular buna göre yapılır.
		
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Id alanı manuel ya da otomatik artırılır. Id'nin nasıl üretildiğini generated value
		//ile söylemek gerekir.
		
		@Column(name="id") //Veritabanında hangi alana karşılık geldiğidir.
		private int id;
		
		@Column(name="position_name")
		private String position;

}
