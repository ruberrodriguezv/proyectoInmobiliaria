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
@Table(name = "parqueadero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueadero.findAll", query = "SELECT p FROM Parqueadero p"),
    @NamedQuery(name = "Parqueadero.findByIdParqueadero", query = "SELECT p FROM Parqueadero p WHERE p.idParqueadero = :idParqueadero"),
    @NamedQuery(name = "Parqueadero.findByCantidadParqueaderos", query = "SELECT p FROM Parqueadero p WHERE p.cantidadParqueaderos = :cantidadParqueaderos")})
public class Parqueadero implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parqueadero")
    private Integer idParqueadero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cantidad_parqueaderos")
    private String cantidadParqueaderos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parqueaderoIdParqueadero")
    private List<InformacionPrincipal> informacionPrincipalList;

    public Parqueadero() {
    }

    public Parqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public Parqueadero(Integer idParqueadero, String cantidadParqueaderos) {
        this.idParqueadero = idParqueadero;
        this.cantidadParqueaderos = cantidadParqueaderos;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getCantidadParqueaderos() {
        return cantidadParqueaderos;
    }

    public void setCantidadParqueaderos(String cantidadParqueaderos) {
        this.cantidadParqueaderos = cantidadParqueaderos;
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
        hash += (idParqueadero != null ? idParqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueadero)) {
            return false;
        }
        Parqueadero other = (Parqueadero) object;
        if ((this.idParqueadero == null && other.idParqueadero != null) || (this.idParqueadero != null && !this.idParqueadero.equals(other.idParqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Parqueadero[ idParqueadero=" + idParqueadero + " ]";
    }
    
}
