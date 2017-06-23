package com.jpa.vista;

import com.jpa.modelo.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_accediendo_a_BD {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
        
        EntityManager em = emf.createEntityManager();
        
        List<Empleado> empleados = (List<Empleado>)em.createQuery("FROM Empleado").getResultList();
        
        System.out.println("En la base de datos hay " + empleados.size() + " empleados.");
        
    }

    
}
