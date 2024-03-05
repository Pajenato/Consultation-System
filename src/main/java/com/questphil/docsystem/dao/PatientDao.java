/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.questphil.docsystem.dao;

import com.questphil.docsystem.entity.PatientEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author russe
 */
public interface PatientDao {
    void save(PatientEntity patientEntity);
    void update(PatientEntity patientEntity);
    void delete(PatientEntity patientEntity);
    
    Optional<PatientEntity> findById(Long id);
    List<PatientEntity> findAll();
    
    Optional<PatientEntity> findExistingPatient(String firstName, String lastName, String middleInitial);
}
