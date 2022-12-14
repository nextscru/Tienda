package com.nextscrum.tienda.modelo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="movimientoDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false,unique = true)
    private Long id;

    @Column(name= "concepto",nullable = false, length = 250)
    private String concepto;

    @Column(name= "cantidad",nullable = false)
    private float cantidad;

    @ManyToOne
    @JoinColumn(name= "empleado_id")
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;

    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "updatedAt")
    private Date updatedAt;

    public MovimientoDinero(){

    }

    public MovimientoDinero(Long id, String concepto, float cantidad, Perfil perfil, Empresa empresa, Date createdAt, Date updatedAt) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.perfil = perfil;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", cantidad=" + cantidad +
                ", perfil=" + perfil +
                ", empresa=" + empresa +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
