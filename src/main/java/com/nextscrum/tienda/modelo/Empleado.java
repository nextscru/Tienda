package com.nextscrum.tienda.modelo;

import com.nextscrum.tienda.enums.Enum_RoleName;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    //Genera una clave principal automatica
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Asigna en la tabla empleado el id como llave primaria, unica y no nula
    @Column(name = "id",nullable = false,unique = true)
    private Long id;

    @Column(name = "correo", nullable = false,unique = true,length = 50)
    private String correo;

    @OneToOne
    //Establece la relacion uno a uno con la tabla perfil mediante la llave primaria id
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;


    //String: permite persistir la enumeración por su nombre, lo que significa que será una columna alfanumérica.
    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Enum_RoleName rol;

    @ManyToOne
    @JoinColumn(name= "empresa_id")
    private Empresa empresa;

    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<MovimientoDinero> transacciones = new ArrayList<>();

    @Column(name= "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

    public Empleado(){

    }

    public Empleado(Long id, String correo, Perfil perfil, Enum_RoleName rol, Empresa empresa, List<MovimientoDinero> transacciones, Date createdAt, Date updatedAt) {
        this.id = id;
        this.correo = correo;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transacciones = transacciones;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public List<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
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

    public Enum_RoleName getRol() {
        return rol;
    }

    public void setRol(Enum_RoleName rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", perfil=" + perfil +
                ", empresa=" + empresa +
                ", transacciones=" + transacciones +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
