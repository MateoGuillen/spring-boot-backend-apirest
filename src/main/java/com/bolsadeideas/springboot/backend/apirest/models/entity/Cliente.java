package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="clientes") //nombre de la tabla en la bd
public class Cliente implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //como se genera la id en la bd **auto, identity(autoincremental),sequence
    private Long id;
    private String nombre;
    private String apellido;
    private String email;

    @Column(name="create_at") //la colummna en la bd tiene este nombre en vez de createAT
    @Temporal(TemporalType.DATE) //la transformacion de la fecha en la bd, como se guarda la fecha en la bd
    private Date createAT;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreateAT() {
        return createAT;
    }
    public void setCreateAT(Date createAT) {
        this.createAT = createAT;
    }
    
    
}

