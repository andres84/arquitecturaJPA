package com.jpa.vista;

import com.jpa.modelo.Alumno;
import com.jpa.modelo.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class app_consultas_JPQL {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {

        //LISTA A LOS ALUMNOS GUARDADOS EN LA BASE DE DATOS
        /*crearSoloAlumno();
        
        TypedQuery<Alumno> consulta = em.createQuery("FROM Alumno", Alumno.class);
        

        for (Alumno a : consulta.getResultList()) {

            System.out.println(a.getNombre());

        }
        
        em.close();
         */
        /*crearAlumnosyCursos();

        TypedQuery<Alumno> a = em.createQuery("FROM Alumno", Alumno.class);

        TypedQuery<Curso> c = em.createQuery("FROM Curso", Curso.class);

        for (Alumno al : a.getResultList()) {

            System.out.println(al.getNombre());

        }
        
        for (Curso cu : c.getResultList()) {

            System.out.println(cu.getTitulo());

        }
        
        em.close();
        */
        
        //CLAUSULA WHERE
        
        crearSoloAlumno();
        
        TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a WHERE a.nombre =:nombre", Alumno.class);
        
        System.out.println(query.setParameter("nombre", "Liliana"));
        
        

        System.out.println("Exito!!!");

    }

    private static void crearSoloAlumno() {

        em.getTransaction().begin();

        Alumno alumno = new Alumno(1, "Liliana", "Cantor", 28);
        em.persist(alumno);

        em.getTransaction().commit();

    }

    private static void crearAlumnosyCursos() {

        em.getTransaction().begin();

        Alumno alumno1 = new Alumno(1, "Sara", "Fragozo", 4);
        Alumno alumno2 = new Alumno(2, "Isabella", "Fragozo", 2);

        Curso curso1 = new Curso(1, "Intrtoduccion a JAVA", "30", alumno1);
        Curso curso2 = new Curso(2, "Introduccion a SqlServer 2012", "40", alumno2);

        em.persist(alumno1);
        em.persist(alumno2);
        em.persist(curso1);
        em.persist(curso2);

        em.getTransaction().commit();

    }

}
