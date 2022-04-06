package me.bouzri.spring1.repositories;

import me.bouzri.spring1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
