package pandemic.solutions.bedsTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pandemic.solutions.bedsTracker.entity.PatientsBed;

@Repository
public interface PatientsBedsRepository extends JpaRepository<PatientsBed, Integer>{

}
