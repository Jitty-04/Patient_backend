package com.nest.patient_backend.controller;

import com.nest.patient_backend.dao.PatientDao;
import com.nest.patient_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
@CrossOrigin(origins = "*")
    @PostMapping(path ="/add",consumes ="application/json",produces = "application/json")
    public Map<String,String> AddPatient(@RequestBody Patients p){
    System.out.println(p.getName().toString());
    System.out.println(p.getGender().toString());
    System.out.println(p.getAddress().toString());
    System.out.println(p.getMb().toString());
    System.out.println(p.getDate().toString());
    System.out.println(p.getDoctorname().toString());
    dao.save(p);
  HashMap<String,String> map=new HashMap<>();
  map.put("status","success");
  return map;

}
@CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Patients> viewAllPatients(){
    return (List<Patients>) dao.findAll();
}
}
