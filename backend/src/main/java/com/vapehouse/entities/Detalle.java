package com.vapehouse.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetalle")
    private Integer idDetalle;

    @Column(name = "infoDetalle", length = 1024)
    private String infoDetalle;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;


    public Detalle() {
    }

    public Detalle(Integer idDetalle, String infoDetalle, Producto producto) {
        this.idDetalle = idDetalle;
        this.infoDetalle = infoDetalle;
        this.producto = producto;
    }

    public Integer getIdDetalle() {
        return this.idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getInfoDetalle() {
        return this.infoDetalle;
    }

    public void setInfoDetalle(String infoDetalle) {
        this.infoDetalle = infoDetalle;
    }

    // public Producto getProducto() {
    //     return this.producto;
    // }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "{" +
            " idDetalle='" + getIdDetalle() + "'" +
            ", infoDetalle='" + getInfoDetalle() + "'" +
            "}";
    }
    

}