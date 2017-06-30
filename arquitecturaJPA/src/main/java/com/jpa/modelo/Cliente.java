package com.jpa.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

    @Id
    private int id_cliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "telefono")
    private int telefono;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    List<Factura> facturas = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String apellidos, int telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    
    public void agregar(Factura f){
        
        facturas.add(f);
        f.setCliente(this);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id_cliente;
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
        final Cliente other = (Cliente) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", facturas=" + facturas + '}';
    }

    

}
