package com.jpa.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso2")
public class Curso2 implements Serializable {

    @Id
    private int id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "duracion")
    private String duracion;

    @ManyToMany
    @JoinTable(name = "alumnocurso2", joinColumns = @JoinColumn(name = "curso_id"), inverseJoinColumns = @JoinColumn(name = "alumno_dni"))
    private List<Alumno2> alumno = new ArrayList<>();

    public Curso2() {
    }

    public Curso2(int id, String titulo, String duracion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Alumno2> getAlumno() {
        return alumno;
    }

    public void setAlumno(List<Alumno2> alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
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
        final Curso2 other = (Curso2) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso2{" + "id=" + id + ", titulo=" + titulo + ", duracion=" + duracion + ", alumno=" + alumno + '}';
    }

}
