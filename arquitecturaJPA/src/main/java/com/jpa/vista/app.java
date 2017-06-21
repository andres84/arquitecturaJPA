package com.jpa.vista;

import com.jpa.modelo.Alumno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;




public class app {
    
    
    public static void main(String[] args) {
        
       /*
        EntityManagerFactory interface que se encarga de crear EntityManager
        que seran los que gestionen la persistenca de los objetos a la base de datos
        */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");//asociamos el nombre de la unidad de persistencia
        
        /*
        EntityManager interface fundamental JPA que se encarga de gestionar todas
        las operaciones de los objetos que se desea persistir
        Ej: insertar, borrar, actualizar, etc.
        */
        EntityManager em = emf.createEntityManager();
        
        /*
        EntityTransaction interface que genera una abstraccion sobre el concepto en general de transaccion
        a nivel de base de datos
        */
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        
        Alumno andres = new Alumno("02", "Andres", "Fragozo", 32);
        
        em.persist(andres);
        
        et.commit();
        
        em.close();
        
       
    }

    
}
