package com.jpa.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Direccion implements Serializable{

    @Id
    private int id_direccion;
    @Column
    private String direccion;
    @Column
    private String localidad;
    @Column
    private String provincia;
    @Column
    private String pais;
    
    @OneToOne(mappedBy = "direccion", fetch = FetchType.LAZY)
    private Empleado empleado;

    public Direccion() {
    }

    public Direccion(int id_direccion, String direccion, String localidad, String provincia, String pais) {
        this.id_direccion = id_direccion;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id_direccion;
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
        final Direccion other = (Direccion) obj;
        if (this.id_direccion != other.id_direccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id_direccion=" + id_direccion + ", direccion=" + direccion + ", localidad=" + localidad + ", provincia=" + provincia + ", pais=" + pais + ", empleado=" + empleado.getCodigo() + '}';
    }

  

}
