package org.example.persistencia;


import jakarta.persistence.EntityManager;
import org.example.modelo.Persona;

import java.util.List;

public class PersonaDAO {
    private EntityManager em;

    public PersonaDAO(EntityManager em){
      this.em = em;
    }

    public void guardar(Persona p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public void actualizar(Long id, String nuevoNombre){
        em.getTransaction().begin();
        Persona p = em.find(Persona.class, id);

        if (p!=null){
            System.out.println("Nombre correctamente actualizado");
            p.setNombre(nuevoNombre);
            em.getTransaction().commit();
        }else {
            System.out.println("No existe la persona");
            em.getTransaction().rollback();
        }
    }

    public void eliminar(Long id){
        em.getTransaction().begin();
        Persona p = em.find(Persona.class, id);

        if (p!=null){
            em.remove(p);
            em.getTransaction().commit();
            System.out.println("Persona actualizada correctamente");
        }else {
            System.out.println("Persona no encontrada");
            em.getTransaction().rollback();
        }
    }
    public List<Persona> listar(){
        return em.createQuery("SELECT p FROM Persona p", Persona.class)
                .getResultList();
    }











}
