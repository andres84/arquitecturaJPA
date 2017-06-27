package com.jpa.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Curso implements Serializable{

    @Id
    private int id_curso;
    @Column
    private String titulo;
    @Column
    private String duracion;

    @ManyToOne
    @JoinColumn
    private Alumno alumno;

    public Curso() {
    }

    public Curso(int id_curso, String titulo, String duracion, Alumno alumno) {
        this.id_curso = id_curso;
        this.titulo = titulo;
        this.duracion = duracion;
        this.alumno = alumno;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id_curso;
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
        final Curso other = (Curso) obj;
        if (this.id_curso != other.id_curso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "id_curso=" + id_curso + ", titulo=" + titulo + ", duracion=" + duracion + ", alumno=" + alumno + '}';
    }

}
