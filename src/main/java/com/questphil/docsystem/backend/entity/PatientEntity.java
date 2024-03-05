/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.questphil.docsystem.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author russe
 */
@Data
@Entity
@Table(name = "qpd_doc")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fullname1;

    @Column
    private String fullname2;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "MI")
    private String middleInitial;

    @Column
    private String address;

    @Column
    private String age;

    @Column(name = "date_of_birth")
    private Date birthDate;

    @Column
    private String gender;

    @Column
    private String contact;

    @Column(name = "famhis", nullable = true)
    private String familyHistory;

    @Column(name = "pastmedhis", nullable = true)
    private String pastMedicalHistory;

    @Column(nullable = true)
    private String allergies;

    @Column(nullable = true)
    private String meds;

    @Column(name = "added", nullable = false)
    private String addedBy;

    @Column(name = "edited")
    private String editedBy;

//    @Column(name = "date_added")
//    private Date dateAdded;
//
//    @Column(name = "date_edited")
//    private Date dateEdited;
}
