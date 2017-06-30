package com.jpa.vista;

import com.jpa.modelo.Cliente;
import com.jpa.modelo.Factura;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_agregar_cliente_factura {


    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    
    public static void main(String[] args) {
        
        
        EntityManager em = emf.createEntityManager();
        
        
        Cliente lucia = new Cliente(1, "Lucia", "fragozo", 8);
        Cliente liliana = new Cliente(2, "Liliana", "Cantor", 28);
        
        Factura fac1 = new Factura(1, "Portatil", 200, new GregorianCalendar(2017, 1, 20).getTime(), "sin observacion", liliana);
        Factura fac2 = new Factura(2, "Televisor", 500, new GregorianCalendar(2017, 3, 15).getTime(), "sin observacion", liliana);
        Factura fac3 = new Factura(3, "USB 32Gb", 20, new GregorianCalendar(2017, 2, 18).getTime(), "sin observacion", lucia);
        
        
        lucia.agregar(fac3);
        liliana.agregar(fac2);
        liliana.agregar(fac1);
        
        em.getTransaction().begin();
        
        em.persist(lucia);
        em.persist(liliana);
        
        em.getTransaction().commit();
        em.close();
        
    }

    
}
