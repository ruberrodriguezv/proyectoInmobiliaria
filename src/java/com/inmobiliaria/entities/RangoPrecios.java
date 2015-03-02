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
@Table(name = "rango_precios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RangoPrecios.findAll", query = "SELECT r FROM RangoPrecios r"),
    @NamedQuery(name = "RangoPrecios.findByIdRangoPrecios", query = "SELECT r FROM RangoPrecios r WHERE r.idRangoPrecios = :idRangoPrecios"),
    @NamedQuery(name = "RangoPrecios.findByCantidadPrecio", query = "SELECT r FROM RangoPrecios r WHERE r.cantidadPrecio = :cantidadPrecio")})
public class RangoPrecios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rango_precios")
    private Integer idRangoPrecios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cantidad_precio")
    private String cantidadPrecio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rangoPreciosIdRangoPrecios")
    private List<RangoPreciosAjustado> rangoPreciosAjustadoList;

    public RangoPrecios() {
    }

    public RangoPrecios(Integer idRangoPrecios) {
        this.idRangoPrecios = idRangoPrecios;
    }

    public RangoPrecios(Integer idRangoPrecios, String cantidadPrecio) {
        this.idRangoPrecios = idRangoPrecios;
        this.cantidadPrecio = cantidadPrecio;
    }

    public Integer getIdRangoPrecios() {
        return idRangoPrecios;
    }

    public void setIdRangoPrecios(Integer idRangoPrecios) {
        this.idRangoPrecios = idRangoPrecios;
    }

    public String getCantidadPrecio() {
        return cantidadPrecio;
    }

    public void setCantidadPrecio(String cantidadPrecio) {
        this.cantidadPrecio = cantidadPrecio;
    }

    @XmlTransient
    public List<RangoPreciosAjustado> getRangoPreciosAjustadoList() {
        return rangoPreciosAjustadoList;
    }

    public void setRangoPreciosAjustadoList(List<RangoPreciosAjustado> rangoPreciosAjustadoList) {
        this.rangoPreciosAjustadoList = rangoPreciosAjustadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRangoPrecios != null ? idRangoPrecios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangoPrecios)) {
            return false;
        }
        RangoPrecios other = (RangoPrecios) object;
        if ((this.idRangoPrecios == null && other.idRangoPrecios != null) || (this.idRangoPrecios != null && !this.idRangoPrecios.equals(other.idRangoPrecios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.RangoPrecios[ idRangoPrecios=" + idRangoPrecios + " ]";
    }
    
}
