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
@Table(name = "pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findBySiglasPais", query = "SELECT p FROM Pais p WHERE p.siglasPais = :siglasPais"),
    @NamedQuery(name = "Pais.findByNombrePais", query = "SELECT p FROM Pais p WHERE p.nombrePais = :nombrePais")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "siglas_pais")
    private String siglasPais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_pais")
    private String nombrePais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paisSiglasPais")
    private List<Departamento> departamentoList;

    public Pais() {
    }

    public Pais(String siglasPais) {
        this.siglasPais = siglasPais;
    }

    public Pais(String siglasPais, String nombrePais) {
        this.siglasPais = siglasPais;
        this.nombrePais = nombrePais;
    }

    public String getSiglasPais() {
        return siglasPais;
    }

    public void setSiglasPais(String siglasPais) {
        this.siglasPais = siglasPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @XmlTransient
    public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }

    public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siglasPais != null ? siglasPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.siglasPais == null && other.siglasPais != null) || (this.siglasPais != null && !this.siglasPais.equals(other.siglasPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Pais[ siglasPais=" + siglasPais + " ]";
    }
    
}
