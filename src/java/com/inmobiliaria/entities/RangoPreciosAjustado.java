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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "rango_precios_ajustado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RangoPreciosAjustado.findAll", query = "SELECT r FROM RangoPreciosAjustado r"),
    @NamedQuery(name = "RangoPreciosAjustado.findByIdRangoPreciosAjustado", query = "SELECT r FROM RangoPreciosAjustado r WHERE r.idRangoPreciosAjustado = :idRangoPreciosAjustado")})
public class RangoPreciosAjustado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rango_precios_ajustado")
    private Integer idRangoPreciosAjustado;
    @JoinColumn(name = "tipo_operacion_id_tipo_operacion", referencedColumnName = "id_tipo_operacion")
    @ManyToOne(optional = false)
    private TipoOperacion tipoOperacionIdTipoOperacion;
    @JoinColumn(name = "rango_precios_id_rango_precios", referencedColumnName = "id_rango_precios")
    @ManyToOne(optional = false)
    private RangoPrecios rangoPreciosIdRangoPrecios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rangoPreciosAjustadoIdRangoPreciosAjustado")
    private List<InformacionPrincipal> informacionPrincipalList;

    public RangoPreciosAjustado() {
    }

    public RangoPreciosAjustado(Integer idRangoPreciosAjustado) {
        this.idRangoPreciosAjustado = idRangoPreciosAjustado;
    }

    public Integer getIdRangoPreciosAjustado() {
        return idRangoPreciosAjustado;
    }

    public void setIdRangoPreciosAjustado(Integer idRangoPreciosAjustado) {
        this.idRangoPreciosAjustado = idRangoPreciosAjustado;
    }

    public TipoOperacion getTipoOperacionIdTipoOperacion() {
        return tipoOperacionIdTipoOperacion;
    }

    public void setTipoOperacionIdTipoOperacion(TipoOperacion tipoOperacionIdTipoOperacion) {
        this.tipoOperacionIdTipoOperacion = tipoOperacionIdTipoOperacion;
    }

    public RangoPrecios getRangoPreciosIdRangoPrecios() {
        return rangoPreciosIdRangoPrecios;
    }

    public void setRangoPreciosIdRangoPrecios(RangoPrecios rangoPreciosIdRangoPrecios) {
        this.rangoPreciosIdRangoPrecios = rangoPreciosIdRangoPrecios;
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
        hash += (idRangoPreciosAjustado != null ? idRangoPreciosAjustado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangoPreciosAjustado)) {
            return false;
        }
        RangoPreciosAjustado other = (RangoPreciosAjustado) object;
        if ((this.idRangoPreciosAjustado == null && other.idRangoPreciosAjustado != null) || (this.idRangoPreciosAjustado != null && !this.idRangoPreciosAjustado.equals(other.idRangoPreciosAjustado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.RangoPreciosAjustado[ idRangoPreciosAjustado=" + idRangoPreciosAjustado + " ]";
    }
    
}
