package com.jpa.vista;

import com.jpa.modelo.Direccion;
import com.jpa.modelo.Empleado;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_One_To_One {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    
    public static void main(String[] args) {
        
        
        EntityManager em = emf.createEntityManager();
        
        Empleado empleado = new Empleado(1, "sara", "fragozo", new GregorianCalendar(2013, 06, 20).getTime());
        empleado.setDireccion(new Direccion(12, "calle 1", "pescaito", "santamarta", "colombia"));
        em.getTransaction().begin();
        em.persist(empleado);
        em.getTransaction().commit();
        em.close();
        
        contador();
    }
    
    
    private static void contador(){
        
        EntityManager em = emf.createEntityManager();
        
        List<Empleado> empleados = (List<Empleado>) em.createQuery("FROM Empleado").getResultList();

        System.out.println("En la base de datos hay " + empleados.size() + " empleados.");
        
        for (Empleado empleado : empleados) {

           System.out.println(empleado.toString());

        }
        
    }

    
}
