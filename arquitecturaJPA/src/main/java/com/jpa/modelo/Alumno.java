package com.jpa.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alumno implements Serializable{

    @Id
    private int dni;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private int edad;
    @OneToMany(mappedBy = "alumno", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<Curso> cursos = new ArrayList<>();

    public Alumno() {
    }

   
    public void add(Curso c){
        
        cursos.add(c);
        c.setAlumno(this);
    }
    
    
    public void remover(Curso c){
        
        cursos.remove(c);
        c.setAlumno(null);
    }
    
    public Alumno(int dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

}
