package com.jpa.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {

    @Id
    private int id_vehiculo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "color")
    private String color;
    @Column(name = "placa")
    private String placa;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cedula_persona")
    private Persona persona;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, String marca, String color, String placa, Persona persona) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.persona = persona;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id_vehiculo;
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.id_vehiculo != other.id_vehiculo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id_vehiculo=" + id_vehiculo + ", marca=" + marca + ", color=" + color + ", placa=" + placa + ", persona=" + persona + '}';
    }

}
