package com.jpa.vista;

import com.jpa.modelo.Persona;
import com.jpa.modelo.Vehiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class app_persona_vehiculo {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
    
    public static void main(String[] args) {
        
        EntityManager em = emf.createEntityManager();
        
        Persona andres = new Persona(1, "andres", "fragozo rios", "calle 1", 555, "andres.fragozo@hotmail.com");
        Persona isabella = new Persona(2, "isabella", "fragozo cantor", "calle 2", 444, "isabellagmail.com");
        
        Vehiculo ford = new Vehiculo(1, "Ford Explorer", "plateado", "ZXC567", andres);
        Vehiculo chevrolet = new Vehiculo(2, "Tahoe", "negra", "BVM321", isabella);
        
        andres.adicionar(ford);
        isabella.adicionar(chevrolet);

        em.getTransaction().begin();
        
        em.persist(andres);
        em.persist(isabella);
        
        em.getTransaction().commit();
        em.close();
        
        
        
    }

    
}
