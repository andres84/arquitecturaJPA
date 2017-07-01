package com.jpa.vista;

import com.jpa.modelo.Alumno2;
import com.jpa.modelo.Curso2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_manyTomany_alumnoCurso {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");

    public static void main(String[] args) {
        
        
        EntityManager em = emf.createEntityManager();
        
        Alumno2 pedro = new Alumno2(1, "pedro", "gonzales", 30);
        Alumno2 nelia = new Alumno2(2, "nelia", "rios", 59);
        
        Curso2 cocina = new Curso2(1, "aprenda a cocinar", "40");
        Curso2 reposteria = new Curso2(2, "aprenda a crear pasteles", "40");
        
        pedro.getCurso().add(cocina);
        cocina.getAlumno().add(pedro);
        
        nelia.getCurso().add(reposteria);
        reposteria.getAlumno().add(nelia);
        
        em.getTransaction().begin();
        
        em.persist(pedro);
        em.persist(nelia);
        em.persist(cocina);
        em.persist(reposteria);
        
        em.getTransaction().commit();
        em.close();
        
        System.out.println("Exito");
        
    }
    
}
