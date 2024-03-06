/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.backend.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author russe
 */
public class EntityManagerProvider {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        // Database credentials hidden in .env file
        // If project have no .env file, create one in
        // src/main/resources/.env
        Dotenv dotenv = Dotenv.load();
        String url = dotenv.get("MYSQL_URL") == null
                ? "jdbc:mysql://localhost:3306/dbdoc"
                : dotenv.get("MYSQL_URL");

        String user = dotenv.get("MYSQL_USERNAME") == null
                ? "root"
                : dotenv.get("MYSQL_USERNAME");

        String password = dotenv.get("MYSQL_PASSWORD") == null
                ? ""
                : dotenv.get("MYSQL_PASSWORD");

        Map<String, String> properties = new HashMap<>();
        properties.put("jakarta.persistence.jdbc.url", url);
        properties.put("jakarta.persistence.jdbc.user", user);
        properties.put("jakarta.persistence.jdbc.password", password);

        // Entity Maanger is used for data persistence into the database
        entityManagerFactory = Persistence.createEntityManagerFactory("JakartaPersistenceUnit", properties);
    }

    public static EntityManager getEntityManager() {
        // Use this to initialize an entity manager
        // to be used for Data Access Objects for
        // Data Persistence
        return entityManagerFactory.createEntityManager();
    }

    public static void closeEntityManagerFactory() {
        // Closing the entity manager is important
        entityManagerFactory.close();
    }
}
