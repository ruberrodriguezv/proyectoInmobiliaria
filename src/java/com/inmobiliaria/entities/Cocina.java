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
@Table(name = "cocina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocina.findAll", query = "SELECT c FROM Cocina c"),
    @NamedQuery(name = "Cocina.findByIdCocina", query = "SELECT c FROM Cocina c WHERE c.idCocina = :idCocina"),
    @NamedQuery(name = "Cocina.findByNombreCocina", query = "SELECT c FROM Cocina c WHERE c.nombreCocina = :nombreCocina")})
public class Cocina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cocina")
    private Integer idCocina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_cocina")
    private String nombreCocina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cocinaIdCocina")
    private List<InformacionPrincipal> informacionPrincipalList;

    public Cocina() {
    }

    public Cocina(Integer idCocina) {
        this.idCocina = idCocina;
    }

    public Cocina(Integer idCocina, String nombreCocina) {
        this.idCocina = idCocina;
        this.nombreCocina = nombreCocina;
    }

    public Integer getIdCocina() {
        return idCocina;
    }

    public void setIdCocina(Integer idCocina) {
        this.idCocina = idCocina;
    }

    public String getNombreCocina() {
        return nombreCocina;
    }

    public void setNombreCocina(String nombreCocina) {
        this.nombreCocina = nombreCocina;
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
        hash += (idCocina != null ? idCocina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocina)) {
            return false;
        }
        Cocina other = (Cocina) object;
        if ((this.idCocina == null && other.idCocina != null) || (this.idCocina != null && !this.idCocina.equals(other.idCocina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Cocina[ idCocina=" + idCocina + " ]";
    }
    
}
