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
@Table(name = "numero_alcobas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NumeroAlcobas.findAll", query = "SELECT n FROM NumeroAlcobas n"),
    @NamedQuery(name = "NumeroAlcobas.findByIdNumeroAlcobas", query = "SELECT n FROM NumeroAlcobas n WHERE n.idNumeroAlcobas = :idNumeroAlcobas"),
    @NamedQuery(name = "NumeroAlcobas.findByCantidadAlcobas", query = "SELECT n FROM NumeroAlcobas n WHERE n.cantidadAlcobas = :cantidadAlcobas")})
public class NumeroAlcobas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_numero_alcobas")
    private Integer idNumeroAlcobas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cantidad_alcobas")
    private String cantidadAlcobas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroAlcobasIdNumeroAlcobas")
    private List<InformacionPrincipal> informacionPrincipalList;

    public NumeroAlcobas() {
    }

    public NumeroAlcobas(Integer idNumeroAlcobas) {
        this.idNumeroAlcobas = idNumeroAlcobas;
    }

    public NumeroAlcobas(Integer idNumeroAlcobas, String cantidadAlcobas) {
        this.idNumeroAlcobas = idNumeroAlcobas;
        this.cantidadAlcobas = cantidadAlcobas;
    }

    public Integer getIdNumeroAlcobas() {
        return idNumeroAlcobas;
    }

    public void setIdNumeroAlcobas(Integer idNumeroAlcobas) {
        this.idNumeroAlcobas = idNumeroAlcobas;
    }

    public String getCantidadAlcobas() {
        return cantidadAlcobas;
    }

    public void setCantidadAlcobas(String cantidadAlcobas) {
        this.cantidadAlcobas = cantidadAlcobas;
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
        hash += (idNumeroAlcobas != null ? idNumeroAlcobas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NumeroAlcobas)) {
            return false;
        }
        NumeroAlcobas other = (NumeroAlcobas) object;
        if ((this.idNumeroAlcobas == null && other.idNumeroAlcobas != null) || (this.idNumeroAlcobas != null && !this.idNumeroAlcobas.equals(other.idNumeroAlcobas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.NumeroAlcobas[ idNumeroAlcobas=" + idNumeroAlcobas + " ]";
    }
    
}
