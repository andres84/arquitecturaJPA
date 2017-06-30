package com.jpa.vista;

import com.jpa.modelo.Alumno;
import com.jpa.modelo.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_alumno_curso {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    
    public static void main(String[] args) {
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Alumno alumno1 = new Alumno(1, "andres", "fragozo", 32);
        Alumno alumno2 = new Alumno(2, "sara", "fragozo", 4);
        
        Curso cursoJAVA = new Curso(1, "Introduccion a JAVA2", "20", alumno1);
        Curso cursoNET = new Curso(2, "Introduccion a .NET", "30", alumno2);
        Curso cursoJAVA2 = new Curso(3, "Introduccion a JAVA2 Collection", "40", alumno2);
        
        em.persist(alumno1);
        em.persist(alumno2);
        em.persist(cursoJAVA);
        em.persist(cursoNET);
        em.persist(cursoJAVA2);
        
        em.getTransaction().commit();
        
        System.out.println("Exito!!!");
        
        em.close();
        
    }

    
}
