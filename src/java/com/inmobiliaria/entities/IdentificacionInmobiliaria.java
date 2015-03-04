/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "identificacion_inmobiliaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IdentificacionInmobiliaria.findAll", query = "SELECT i FROM IdentificacionInmobiliaria i"),
    @NamedQuery(name = "IdentificacionInmobiliaria.findByIdIdentificacionInmobiliaria", query = "SELECT i FROM IdentificacionInmobiliaria i WHERE i.idIdentificacionInmobiliaria = :idIdentificacionInmobiliaria"),
    @NamedQuery(name = "IdentificacionInmobiliaria.findByNombreInmobiliaria", query = "SELECT i FROM IdentificacionInmobiliaria i WHERE i.nombreInmobiliaria = :nombreInmobiliaria")})
public class IdentificacionInmobiliaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_identificacion_inmobiliaria")
    private Integer idIdentificacionInmobiliaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_inmobiliaria")
    private String nombreInmobiliaria;

    public IdentificacionInmobiliaria() {
    }

    public IdentificacionInmobiliaria(Integer idIdentificacionInmobiliaria) {
        this.idIdentificacionInmobiliaria = idIdentificacionInmobiliaria;
    }

    public IdentificacionInmobiliaria(Integer idIdentificacionInmobiliaria, String nombreInmobiliaria) {
        this.idIdentificacionInmobiliaria = idIdentificacionInmobiliaria;
        this.nombreInmobiliaria = nombreInmobiliaria;
    }

    public Integer getIdIdentificacionInmobiliaria() {
        return idIdentificacionInmobiliaria;
    }

    public void setIdIdentificacionInmobiliaria(Integer idIdentificacionInmobiliaria) {
        this.idIdentificacionInmobiliaria = idIdentificacionInmobiliaria;
    }

    public String getNombreInmobiliaria() {
        return nombreInmobiliaria;
    }

    public void setNombreInmobiliaria(String nombreInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIdentificacionInmobiliaria != null ? idIdentificacionInmobiliaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IdentificacionInmobiliaria)) {
            return false;
        }
        IdentificacionInmobiliaria other = (IdentificacionInmobiliaria) object;
        if ((this.idIdentificacionInmobiliaria == null && other.idIdentificacionInmobiliaria != null) || (this.idIdentificacionInmobiliaria != null && !this.idIdentificacionInmobiliaria.equals(other.idIdentificacionInmobiliaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.IdentificacionInmobiliaria[ idIdentificacionInmobiliaria=" + idIdentificacionInmobiliaria + " ]";
    }
    
}
