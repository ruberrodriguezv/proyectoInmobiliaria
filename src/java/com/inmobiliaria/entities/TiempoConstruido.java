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
@Table(name = "tiempo_construido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiempoConstruido.findAll", query = "SELECT t FROM TiempoConstruido t"),
    @NamedQuery(name = "TiempoConstruido.findByIdTiempoConstruido", query = "SELECT t FROM TiempoConstruido t WHERE t.idTiempoConstruido = :idTiempoConstruido"),
    @NamedQuery(name = "TiempoConstruido.findByCantidadTiempoConstruido", query = "SELECT t FROM TiempoConstruido t WHERE t.cantidadTiempoConstruido = :cantidadTiempoConstruido")})
public class TiempoConstruido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tiempo_construido")
    private Integer idTiempoConstruido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "cantidad_tiempo_construido")
    private String cantidadTiempoConstruido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiempoConstruidoIdTiempoConstruido")
    private List<InformacionPrincipal> informacionPrincipalList;

    public TiempoConstruido() {
    }

    public TiempoConstruido(Integer idTiempoConstruido) {
        this.idTiempoConstruido = idTiempoConstruido;
    }

    public TiempoConstruido(Integer idTiempoConstruido, String cantidadTiempoConstruido) {
        this.idTiempoConstruido = idTiempoConstruido;
        this.cantidadTiempoConstruido = cantidadTiempoConstruido;
    }

    public Integer getIdTiempoConstruido() {
        return idTiempoConstruido;
    }

    public void setIdTiempoConstruido(Integer idTiempoConstruido) {
        this.idTiempoConstruido = idTiempoConstruido;
    }

    public String getCantidadTiempoConstruido() {
        return cantidadTiempoConstruido;
    }

    public void setCantidadTiempoConstruido(String cantidadTiempoConstruido) {
        this.cantidadTiempoConstruido = cantidadTiempoConstruido;
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
        hash += (idTiempoConstruido != null ? idTiempoConstruido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiempoConstruido)) {
            return false;
        }
        TiempoConstruido other = (TiempoConstruido) object;
        if ((this.idTiempoConstruido == null && other.idTiempoConstruido != null) || (this.idTiempoConstruido != null && !this.idTiempoConstruido.equals(other.idTiempoConstruido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.TiempoConstruido[ idTiempoConstruido=" + idTiempoConstruido + " ]";
    }
    
}
