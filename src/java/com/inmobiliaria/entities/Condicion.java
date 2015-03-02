/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "condicion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condicion.findAll", query = "SELECT c FROM Condicion c"),
    @NamedQuery(name = "Condicion.findByIdCondicion", query = "SELECT c FROM Condicion c WHERE c.idCondicion = :idCondicion"),
    @NamedQuery(name = "Condicion.findByNombreCondicion", query = "SELECT c FROM Condicion c WHERE c.nombreCondicion = :nombreCondicion")})
public class Condicion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_condicion")
    private Integer idCondicion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nombre_condicion")
    private String nombreCondicion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condicionIdCondicion")
    private List<InformacionPrincipal> informacionPrincipalList;

    public Condicion() {
    }

    public Condicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public Condicion(Integer idCondicion, String nombreCondicion) {
        this.idCondicion = idCondicion;
        this.nombreCondicion = nombreCondicion;
    }

    public Integer getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public String getNombreCondicion() {
        return nombreCondicion;
    }

    public void setNombreCondicion(String nombreCondicion) {
        this.nombreCondicion = nombreCondicion;
    }

    @XmlTransient
    public List<InformacionPrincipal> getInformacionPrincipalList() {
        return informacionPrincipalList;
    }

    public void setInformacionPrincipalList(List<InformacionPrincipal> informacionPrincipalList) {
        this.informacionPrincipalList = informacionPrincipalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCondicion != null ? idCondicion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condicion)) {
            return false;
        }
        Condicion other = (Condicion) object;
        if ((this.idCondicion == null && other.idCondicion != null) || (this.idCondicion != null && !this.idCondicion.equals(other.idCondicion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Condicion[ idCondicion=" + idCondicion + " ]";
    }
    
}
