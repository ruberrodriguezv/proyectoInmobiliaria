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
@Table(name = "numero_banios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NumeroBanios.findAll", query = "SELECT n FROM NumeroBanios n"),
    @NamedQuery(name = "NumeroBanios.findByIdNumeroBanios", query = "SELECT n FROM NumeroBanios n WHERE n.idNumeroBanios = :idNumeroBanios"),
    @NamedQuery(name = "NumeroBanios.findByCantidadBanios", query = "SELECT n FROM NumeroBanios n WHERE n.cantidadBanios = :cantidadBanios")})
public class NumeroBanios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_numero_banios")
    private Integer idNumeroBanios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "cantidad_banios")
    private String cantidadBanios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroBaniosIdNumeroBanios")
    private List<InformacionPrincipal> informacionPrincipalList;

    public NumeroBanios() {
    }

    public NumeroBanios(Integer idNumeroBanios) {
        this.idNumeroBanios = idNumeroBanios;
    }

    public NumeroBanios(Integer idNumeroBanios, String cantidadBanios) {
        this.idNumeroBanios = idNumeroBanios;
        this.cantidadBanios = cantidadBanios;
    }

    public Integer getIdNumeroBanios() {
        return idNumeroBanios;
    }

    public void setIdNumeroBanios(Integer idNumeroBanios) {
        this.idNumeroBanios = idNumeroBanios;
    }

    public String getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(String cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
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
        hash += (idNumeroBanios != null ? idNumeroBanios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NumeroBanios)) {
            return false;
        }
        NumeroBanios other = (NumeroBanios) object;
        if ((this.idNumeroBanios == null && other.idNumeroBanios != null) || (this.idNumeroBanios != null && !this.idNumeroBanios.equals(other.idNumeroBanios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.NumeroBanios[ idNumeroBanios=" + idNumeroBanios + " ]";
    }
    
}
