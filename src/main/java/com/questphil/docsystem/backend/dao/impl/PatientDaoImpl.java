/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.backend.dao.impl;

import com.questphil.docsystem.backend.dao.AbstractDao;
import com.questphil.docsystem.backend.dao.PatientDao;
import com.questphil.docsystem.backend.entity.PatientEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    private final EntityManager entityManager;

    public PatientDaoImpl(EntityManager entityManager, Class<PatientEntity> entityClass) {
        super(entityManager, entityClass);
        this.entityManager = entityManager;
    }

    @Override
    public Optional<PatientEntity> findExistingPatient(String firstName, String lastName, String middleInitial) {
        try {
            TypedQuery<PatientEntity> query = entityManager.createQuery(
                    "SELECT p FROM PatientEntity p WHERE p.firstName = :firstName "
                    + "AND p.lastName = :lastName AND p.middleInitial = :middleInitial",
                    PatientEntity.class
            );
            query.setParameter("firstName", firstName);
            query.setParameter("lastName", lastName);
            query.setParameter("middleInitial", middleInitial);
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }
}
