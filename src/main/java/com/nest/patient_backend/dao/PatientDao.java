package com.nest.patient_backend.dao;

import com.nest.patient_backend.model.Patients;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients,Integer> {
    @Query(value = "SELECT `id`, `address`, `date`, `doctorname`, `gender`, `mb`, `name` FROM `patients` WHERE `name`=:name",nativeQuery = true)
    List<Patients> SearchPatient(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id`=:id",nativeQuery = true)
    void DeletePatient(@Param("id") Integer id);
}
