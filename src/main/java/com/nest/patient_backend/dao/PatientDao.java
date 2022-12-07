package com.nest.patient_backend.dao;

import com.nest.patient_backend.model.Patients;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patients,Integer> {
}
