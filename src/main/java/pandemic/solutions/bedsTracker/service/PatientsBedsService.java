package pandemic.solutions.bedsTracker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pandemic.solutions.bedsTracker.entity.PatientsBed;
import pandemic.solutions.bedsTracker.model.BedsRequest;
import pandemic.solutions.bedsTracker.model.UpdateBedsRequest;
import pandemic.solutions.bedsTracker.repository.PatientsBedsRepository;

@Service
public class PatientsBedsService {

	@Autowired
	private PatientsBedsRepository patientsBedsRepository;
	
	public PatientsBed postPatientBed(BedsRequest bedsRequest) {	
		PatientsBed patientsBed=new PatientsBed();
		patientsBed.setTotalBeds(bedsRequest.getTotalBeds());
		return patientsBedsRepository.save(patientsBed);
	}
	
	public PatientsBed putPatientBed(UpdateBedsRequest bedsRequest) {
		Optional<PatientsBed> patientsBedOp=patientsBedsRepository.findById(1);
		PatientsBed patientsBed=patientsBedOp.orElse(new PatientsBed());
		
		if(bedsRequest.getOp().equalsIgnoreCase("a")) {
			patientsBed.setTotalBeds(patientsBed.getTotalBeds()+bedsRequest.getBedCount());
		}
		else {
			patientsBed.setTotalBeds(patientsBed.getTotalBeds()-bedsRequest.getBedCount());
		}
		return patientsBedsRepository.save(patientsBed);
	}
	
}
