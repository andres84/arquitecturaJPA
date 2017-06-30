package com.jpa.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    @Id
    private int id_factura;
    @Column(name = "articulo")
    private String articulo;
    @Column(name = "precio")
    private int precio;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "observacion")
    private String observacion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cliente_factura")
    private Cliente cliente;

    public Factura() {
    }

    public Factura(int id_factura, String articulo, int precio, Date fecha, String observacion, Cliente cliente) {
        this.id_factura = id_factura;
        this.articulo = articulo;
        this.precio = precio;
        this.fecha = fecha;
        this.observacion = observacion;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id_factura;
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
        final Factura other = (Factura) obj;
        if (this.id_factura != other.id_factura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "id_factura=" + id_factura + ", articulo=" + articulo + ", precio=" + precio + ", fecha=" + fecha + ", observacion=" + observacion + ", cliente=" + cliente + '}';
    }

}
