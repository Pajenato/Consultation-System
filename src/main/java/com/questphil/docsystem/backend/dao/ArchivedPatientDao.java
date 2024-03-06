/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.questphil.docsystem.backend.dao;

import com.questphil.docsystem.backend.entity.ArchivedPatientEntity;
import com.questphil.docsystem.backend.entity.PatientEntity;
import java.util.List;
import java.util.Optional;

public interface ArchivedPatientDao {

    void save(ArchivedPatientEntity patientEntity);

    void update(ArchivedPatientEntity patientEntity);

    void delete(ArchivedPatientEntity patientEntity);

    Optional<ArchivedPatientEntity> findById(Long id);

    List<ArchivedPatientEntity> findAll();
}
