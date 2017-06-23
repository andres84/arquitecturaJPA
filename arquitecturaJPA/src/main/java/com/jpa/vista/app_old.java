package com.jpa.vista;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class app_old {

    public static void main(String[] args) {

        /*------------ INSERCION DE OBJETOS A LA BD -------------------------*/
 /*
        EntityManagerFactory interface que se encarga de crear EntityManager
        que seran los que gestionen la persistenca de los objetos a la base de datos
         */
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");//asociamos el nombre de la unidad de persistencia
////        
////        /*
////        EntityManager interface fundamental JPA que se encarga de gestionar todas
////        las operaciones de los objetos que se desea persistir
////        Ej: insertar, borrar, actualizar, etc.
////        */
//        EntityManager em = emf.createEntityManager();
////        
////        /*
////        EntityTransaction interface que genera una abstraccion sobre el concepto en general de transaccion
////        a nivel de base de datos
////        */
//        EntityTransaction et = em.getTransaction();
////        
//        et.begin();
////        
//        Alumno andres = new Alumno("06", "Lucas", "Pedroza", 32);
////        
//        em.persist(andres);
////        
//        et.commit();
//        
        //em.close();
        /*------------ BUSQUEDA DE OBJETOS A LA BD -------------------------*/
//        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("conexion");
//
//        EntityManager em2 = emf2.createEntityManager();
//
//        //EntityTransaction tra = em2.getTransaction();
//        //tra.begin();
//        Alumno busqueda = em2.getReference(Alumno.class, "89");
//
//        System.out.println(busqueda.getNombre());

        //tra.commit();
        //em2.close();
        /*------------  BORRAR OBJETOS A LA BD -------------------------*/
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
//        
//        EntityManager em = emf.createEntityManager();
//        
//        EntityTransaction t = em.getTransaction();
//        
//        t.begin();
//        
//        Alumno alumno = em.find(Alumno.class, "06");
//        
//        em.remove(alumno);
//        
//        t.commit();
        //em.close();
        /*------------  ACTUALIZAR OBJETOS A LA BD -------------------------*/
//                EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
//                
//                EntityManager em = emf.createEntityManager();
//                
//                EntityTransaction t = em.getTransaction();
//                
//                t.begin();
//                
//                Alumno alumno = new Alumno();
//                alumno.setDni("2");
//                alumno.setNombre("Lucas");
//                alumno.setApellidos("Vasquez");
//                alumno.setEdad(30);
//                
//                Alumno nuevo = em.merge(alumno);
//                
//                nuevo.setNombre("Andres");
//                
//                t.commit();
//                
//                em.close();
//        List<Alumno> empleados = (List<Alumno>) em2.createQuery("FROM Alumno").getResultList();
//        System.out.println("En esta base de datos hay " + empleados.size() + " empleados.");
//
//        for (Alumno empleado : empleados) {
//
//            System.out.println(empleado.toString());
//
//        }

//          Alumno pedro = new Alumno("1", "pedro", "gomez", 30);
//          Alumno maria = new Alumno("2", "maria", "perez", 25);
//          
//          EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
//          
//          EntityManager em = emf.createEntityManager();
//               
//          Curso cursoJava = new Curso("JAVA2", "Introduccion java 2", "20", pedro);
//          
//          Curso cursoNET = new Curso("NET2", "Introduccion NET 2", "20", pedro);
//          
//          Curso cursoPHP = new Curso("PHP", "Introduccion PHP", "30", maria);
//          
//          em.getTransaction().begin();
//          
//          em.persist(pedro);
//          em.persist(maria);
//          em.persist(cursoJava);
//          em.persist(cursoNET);
//          em.persist(cursoPHP);
//          
//          em.getTransaction().commit();
//          em.close();
//          System.out.println("Termino");
    }

}
