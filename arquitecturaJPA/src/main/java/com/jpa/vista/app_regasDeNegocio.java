package com.jpa.vista;

import com.jpa.modelo.Alumno;
import com.jpa.modelo.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_regasDeNegocio {
    
    /*
    *teniendo en cuenta la regla de negocio Cascade.PERSIST implementada en la clase Alumno
    */
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    
    public static void main(String[] args) {
        
        EntityManager em = emf.createEntityManager();
        
        Alumno sara = new Alumno(1, "sara", "fragozo", 4);
        Alumno isa = new Alumno(2, "isabella", "fragozo", 2);
        
        Curso cursoJava = new Curso(1, "Introduccion a JAVA", "30", sara);
        Curso cursoNET = new Curso(2, "Introduccion a .NET", "30", isa);
        Curso cursoJava2 = new Curso(3, "Introduccion a JAVA", "30", sara);
        
        sara.add(cursoJava);
        sara.remover(cursoJava2);
        isa.add(cursoNET);
        
        
        em.getTransaction().begin();
        
        em.persist(sara);
        em.persist(isa);
        
        em.getTransaction().commit();
        em.close();
        
        
        
    }

    
}
