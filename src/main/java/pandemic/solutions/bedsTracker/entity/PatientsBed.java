package pandemic.solutions.bedsTracker.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PATIENTS_BED")
public class PatientsBed implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1557779958034179694L;

	@Id
	@Column(name="PATIENTS_BED_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PATIENT_BED_ID")
	@SequenceGenerator(name = "SEQ_PATIENT_BED_ID", sequenceName = "SEQ_PATIENT_BED_ID", allocationSize = 1)
	private Integer id;
	
	@Column(name="TOTAL_BEDS")
	private Integer totalBeds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalBeds() {
		return totalBeds;
	}

	public void setTotalBeds(Integer totalBeds) {
		this.totalBeds = totalBeds;
	}
	
	

}
