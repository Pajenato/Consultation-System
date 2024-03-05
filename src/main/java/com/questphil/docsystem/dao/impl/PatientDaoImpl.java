/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.dao.impl;

import com.questphil.docsystem.dao.PatientDao;
import com.questphil.docsystem.entity.PatientEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author russe
 */
@RequiredArgsConstructor
public class PatientDaoImpl implements PatientDao {
    private final EntityManager entityManager;
    

    @Override
    public void save(PatientEntity patientEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            // Atomic transaction
            // If an operation fail, throw an error and cancel transaction
            transaction.begin();
            entityManager.persist(patientEntity);
            transaction.commit();
        } catch(RuntimeException ex) {
            // Cancel the transaction to prevent error in database
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void update(PatientEntity patientEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            // Atomic transaction
            // If an operation fail, throw an error and cancel transaction
            transaction.begin();
            entityManager.merge(patientEntity);
            transaction.commit();
        } catch(RuntimeException ex) {
            // Cancel the transaction to prevent error in database
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void delete(PatientEntity patientEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            // Atomic transaction
            // If an operation fail, throw an error and cancel transaction
            transaction.begin();
            entityManager.remove(entityManager.contains(patientEntity) ? patientEntity : entityManager.merge(patientEntity));
            transaction.commit();
        } catch(RuntimeException ex) {
            // Cancel the transaction to prevent error in database
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Optional<PatientEntity> findById(Long id) {
        return Optional.of(entityManager.find(PatientEntity.class, id));
    }

    @Override
    public List<PatientEntity> findAll() {
        TypedQuery<PatientEntity> query = entityManager.createQuery("SELECT p FROM PatientEntity p", PatientEntity.class);
        return query.getResultList();
    }
    
    @Override
    public Optional<PatientEntity> findExistingPatient(String firstName, String lastName, String middleInitial) {
        try {
            TypedQuery<PatientEntity> query = entityManager.createQuery(
                "SELECT p FROM PatientEntity p WHERE p.firstName = :firstName " +
                "AND p.lastName = :lastName AND p.middleInitial = :middleInitial",
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
