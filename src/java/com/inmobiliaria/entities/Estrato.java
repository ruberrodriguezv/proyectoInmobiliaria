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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "estrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estrato.findAll", query = "SELECT e FROM Estrato e"),
    @NamedQuery(name = "Estrato.findByIdEstrato", query = "SELECT e FROM Estrato e WHERE e.idEstrato = :idEstrato"),
    @NamedQuery(name = "Estrato.findByEstratoSocial", query = "SELECT e FROM Estrato e WHERE e.estratoSocial = :estratoSocial")})
public class Estrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estrato")
    private Integer idEstrato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estrato_social")
    private int estratoSocial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estratoIdEstrato")
    private List<InformacionPrincipal> informacionPrincipalList;

    public Estrato() {
    }

    public Estrato(Integer idEstrato) {
        this.idEstrato = idEstrato;
    }

    public Estrato(Integer idEstrato, int estratoSocial) {
        this.idEstrato = idEstrato;
        this.estratoSocial = estratoSocial;
    }

    public Integer getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(Integer idEstrato) {
        this.idEstrato = idEstrato;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
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
        hash += (idEstrato != null ? idEstrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estrato)) {
            return false;
        }
        Estrato other = (Estrato) object;
        if ((this.idEstrato == null && other.idEstrato != null) || (this.idEstrato != null && !this.idEstrato.equals(other.idEstrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Estrato[ idEstrato=" + idEstrato + " ]";
    }
    
}
