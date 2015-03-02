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
@Table(name = "numero_plantas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NumeroPlantas.findAll", query = "SELECT n FROM NumeroPlantas n"),
    @NamedQuery(name = "NumeroPlantas.findByIdNumeroPlantas", query = "SELECT n FROM NumeroPlantas n WHERE n.idNumeroPlantas = :idNumeroPlantas"),
    @NamedQuery(name = "NumeroPlantas.findByCantidadPlantas", query = "SELECT n FROM NumeroPlantas n WHERE n.cantidadPlantas = :cantidadPlantas")})
public class NumeroPlantas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_numero_plantas")
    private Integer idNumeroPlantas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cantidad_plantas")
    private String cantidadPlantas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroPlantasIdNumeroPlantas")
    private List<InformacionPrincipal> informacionPrincipalList;

    public NumeroPlantas() {
    }

    public NumeroPlantas(Integer idNumeroPlantas) {
        this.idNumeroPlantas = idNumeroPlantas;
    }

    public NumeroPlantas(Integer idNumeroPlantas, String cantidadPlantas) {
        this.idNumeroPlantas = idNumeroPlantas;
        this.cantidadPlantas = cantidadPlantas;
    }

    public Integer getIdNumeroPlantas() {
        return idNumeroPlantas;
    }

    public void setIdNumeroPlantas(Integer idNumeroPlantas) {
        this.idNumeroPlantas = idNumeroPlantas;
    }

    public String getCantidadPlantas() {
        return cantidadPlantas;
    }

    public void setCantidadPlantas(String cantidadPlantas) {
        this.cantidadPlantas = cantidadPlantas;
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
        hash += (idNumeroPlantas != null ? idNumeroPlantas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NumeroPlantas)) {
            return false;
        }
        NumeroPlantas other = (NumeroPlantas) object;
        if ((this.idNumeroPlantas == null && other.idNumeroPlantas != null) || (this.idNumeroPlantas != null && !this.idNumeroPlantas.equals(other.idNumeroPlantas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.NumeroPlantas[ idNumeroPlantas=" + idNumeroPlantas + " ]";
    }
    
}
