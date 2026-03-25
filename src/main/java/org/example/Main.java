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

       try{
           System.out.println("====INSERT====");
           Persona p1 = new Persona("43787765", "Olivia", "Corzo",
                   LocalDate.of(2000,9,23),
                   "Oli21@gmail.com", "1189887000");

           Persona p2 = new Persona("43787765", "Olivia", "Corzo",
                   LocalDate.of(2000,9,23),
                   "Oli21@gmail.com", "1189887000");
           dao.guardar(p1);
           dao.guardar(p2);

           System.out.println("====LISTADO INICIAL====");
           dao.listar().forEach(System.out::println);

           System.out.println("====UPDATE====");
           dao.actualizar(16L, "Martina");

           System.out.println("====DELETE====");
           dao.eliminar(5L);

           System.out.println("====READ====");
           List<Persona> lista = dao.listar();
           dao.listar().forEach(System.out::println);

       }catch (Exception e){
           e.printStackTrace();
       }finally {
           em.close();
           emf.close();
       }

















    }
}