package com.jpa.vista;

import com.jpa.modelo.Empleado;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class app_insertar {

    public static void main(String[] args) {

        /*------------ INSERCION DE OBJETOS A LA BD -------------------------*/
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
        Empleado empleado = new Empleado(1, "andres", "fragozo", new GregorianCalendar(1984, 06, 29).getTime());

        em.getTransaction().begin();

        em.persist(empleado);

        em.getTransaction().commit();

        List<Empleado> empleados = (List<Empleado>) em.createQuery("FROM Empleado").getResultList();

        System.out.println("En la base de datos hay " + empleados.size() + " empleados.");
        
        em.close();

    }

}
