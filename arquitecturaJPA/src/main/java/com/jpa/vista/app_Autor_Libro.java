package com.jpa.vista;

import com.jpa.modelo.Autor;
import com.jpa.modelo.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class app_Autor_Libro {
    
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");

    public static void main(String[] args) {
        
        
        crearDatos();
        imprimirDatos();
        
    }
    
    
    public static void crearDatos(){
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().commit();
        
        Autor autor1 = new Autor(1, "Pablo Perez", "Española");
        Autor autor2 = new Autor(2, "Elena Gomez", "Mexicana");
        Autor autor3 = new Autor(3, "Miguel Lopez", "Chilena");
        
        em.persist(autor1);
        em.persist(autor2);
        em.persist(autor3);
        
        Libro libro1 = new Libro(1, "Programar en JAVA es facil", autor2);
        Libro libro2 = new Libro(2, "Como vestirse con estilo", autor3);
        Libro libro3 = new Libro(3, "Como cocinar sin quemar la cocina", autor1);
        Libro libro4 = new Libro(4, "Programar en COBOL es divertido", autor2);
        Libro libro5 = new Libro(5, "Programar en COBOL no es divertido", autor2);
        
        
        em.persist(libro1);
        em.persist(libro2);
        em.persist(libro3);
        em.persist(libro4);
        em.persist(libro5);
        
        em.getTransaction().commit();
        
        em.close();
        
    }
    
    
    public static void imprimirDatos(){
        
        EntityManager em = emf.createEntityManager();
        
        Autor autor2 = em.find(Autor.class, 2);
        
        System.out.println(autor2);
        
        em.close();
    }


}
