package com.jpa.vista;

import com.jpa.modelo.Empleado;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_buscar {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("conexion");

        em = emf.createEntityManager();

        insercion();
        
        em.getTransaction().begin();
        Empleado busqueda = em.find(Empleado.class, 1);
        System.out.println("El empleado encontrado es " + busqueda.getNombre() + " " + busqueda.getApellido());
        em.getTransaction().commit();
        
        em.close();
    }

    private static void insercion() {

        Empleado empleado = new Empleado(1, "andres", "fragozo", new GregorianCalendar(1984, 06, 29).getTime());

        em.getTransaction().begin();

        em.persist(empleado);

        em.getTransaction().commit();

    }

}
