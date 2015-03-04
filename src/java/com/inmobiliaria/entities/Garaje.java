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
@Table(name = "garaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Garaje.findAll", query = "SELECT g FROM Garaje g"),
    @NamedQuery(name = "Garaje.findByIdGaraje", query = "SELECT g FROM Garaje g WHERE g.idGaraje = :idGaraje"),
    @NamedQuery(name = "Garaje.findByCantidadGaraje", query = "SELECT g FROM Garaje g WHERE g.cantidadGaraje = :cantidadGaraje")})
public class Garaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_garaje")
    private Integer idGaraje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cantidad_garaje")
    private String cantidadGaraje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garajeIdGaraje")
    private List<InformacionPrincipal> informacionPrincipalList;

    public Garaje() {
    }

    public Garaje(Integer idGaraje) {
        this.idGaraje = idGaraje;
    }

    public Garaje(Integer idGaraje, String cantidadGaraje) {
        this.idGaraje = idGaraje;
        this.cantidadGaraje = cantidadGaraje;
    }

    public Integer getIdGaraje() {
        return idGaraje;
    }

    public void setIdGaraje(Integer idGaraje) {
        this.idGaraje = idGaraje;
    }

    public String getCantidadGaraje() {
        return cantidadGaraje;
    }

    public void setCantidadGaraje(String cantidadGaraje) {
        this.cantidadGaraje = cantidadGaraje;
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
        hash += (idGaraje != null ? idGaraje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garaje)) {
            return false;
        }
        Garaje other = (Garaje) object;
        if ((this.idGaraje == null && other.idGaraje != null) || (this.idGaraje != null && !this.idGaraje.equals(other.idGaraje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Garaje[ idGaraje=" + idGaraje + " ]";
    }
    
}
