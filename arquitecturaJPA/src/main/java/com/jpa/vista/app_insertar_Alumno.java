package com.jpa.vista;

import com.jpa.modelo.Alumno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_insertar_Alumno {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    
    public static void main(String[] args) {
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Alumno alumno = new Alumno(1, "Isabella", "Fragozo", 2);
        
        em.persist(alumno);
        
        em.getTransaction().commit();
        
        em.close();
        
        System.out.println("Exito!!!");
        
    }
    
}
