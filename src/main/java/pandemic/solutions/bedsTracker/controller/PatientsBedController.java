package pandemic.solutions.bedsTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pandemic.solutions.bedsTracker.entity.PatientsBed;
import pandemic.solutions.bedsTracker.model.BedsRequest;
import pandemic.solutions.bedsTracker.model.UpdateBedsRequest;
import pandemic.solutions.bedsTracker.service.PatientsBedsService;

@RestController
public class PatientsBedController {

	@Autowired
	private PatientsBedsService patientsBedsService;
	
	@PostMapping(value="/patientsBed")
	public PatientsBed postBeds(@RequestBody(required=true) BedsRequest bedsRequest) {
		
		return patientsBedsService.postPatientBed(bedsRequest);
	}
	
	@PutMapping(value="/patientsBed")
	public PatientsBed putBeds(@RequestBody(required=true) UpdateBedsRequest updateBedsRequest) {
		
		return patientsBedsService.putPatientBed(updateBedsRequest);
	}
}
