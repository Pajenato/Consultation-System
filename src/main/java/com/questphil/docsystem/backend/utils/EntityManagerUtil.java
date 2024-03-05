/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.backend.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author russe
 */
public class EntityManagerUtil {
    private static final EntityManagerFactory entityManagerFactory;
    private static final EntityManager entityManager;

    static {
        // Entity Maanger is used for data persistence into the database
        entityManagerFactory = Persistence.createEntityManagerFactory("JakartaPersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void closeEntityManagerFactory() {
        // Closing the entity manager is important
        entityManagerFactory.close();
    }
}
