package com.jpa.vista;

import com.jpa.modelo.Alumno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_buscar_alumno {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    private static EntityManager em;

    public static void main(String[] args) {

        em = emf.createEntityManager();
        
        crearAlumno();   

        em.getTransaction().begin();

        Alumno busqueda = em.find(Alumno.class, 1);

        System.out.println("Alumno: " + busqueda.getNombre());

        em.getTransaction().commit();

        em.close();

        System.out.println("Exito!!!");

    }

    public static void crearAlumno() {

        em.getTransaction().begin();

        Alumno alumno = new Alumno(1, "Lucia", "Fragozo", 8);

        em.persist(alumno);

        em.getTransaction().commit();

        //em.close();
    }

}
