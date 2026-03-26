package org.example;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.modelo.Persona;
import org.example.persistencia.PersonaDAO;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       EntityManagerFactory emf =
               Persistence.createEntityManagerFactory("JPA_Practica2PU");
       EntityManager em = emf.createEntityManager();
       PersonaDAO dao = new PersonaDAO(em);


















    }
}