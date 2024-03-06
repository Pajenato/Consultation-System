/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.backend.dao.impl;

import com.questphil.docsystem.backend.dao.AbstractDao;
import com.questphil.docsystem.backend.dao.ArchivedPatientDao;
import com.questphil.docsystem.backend.entity.ArchivedPatientEntity;
import jakarta.persistence.EntityManager;
import java.util.Optional;

/**
 *
 * @author russe
 */
public class ArchivedPatientDaoImpl extends AbstractDao<ArchivedPatientEntity, Long> implements ArchivedPatientDao {

    public ArchivedPatientDaoImpl(EntityManager entityManager, Class<ArchivedPatientEntity> entityClass) {
        super(entityManager, entityClass);
    }
}
