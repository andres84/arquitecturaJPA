package com.jpa.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro implements Serializable {

    @Id
    private int id_autor;
    @Column
    private String titulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id_autor")
    private Autor autor;

    public Libro() {
    }

    public Libro(int id_autor, String titulo, Autor autor) {
        this.id_autor = id_autor;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id_autor;
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
        final Libro other = (Libro) obj;
        if (this.id_autor != other.id_autor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "id_autor=" + id_autor + ", titulo=" + titulo + ", autor=" + autor + '}';
    }

}
