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
@Table(name = "tipo_operacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoOperacion.findAll", query = "SELECT t FROM TipoOperacion t"),
    @NamedQuery(name = "TipoOperacion.findByIdTipoOperacion", query = "SELECT t FROM TipoOperacion t WHERE t.idTipoOperacion = :idTipoOperacion"),
    @NamedQuery(name = "TipoOperacion.findByNombreTipoOperacion", query = "SELECT t FROM TipoOperacion t WHERE t.nombreTipoOperacion = :nombreTipoOperacion")})
public class TipoOperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_operacion")
    private Integer idTipoOperacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_tipo_operacion")
    private String nombreTipoOperacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOperacionIdTipoOperacion")
    private List<RangoPreciosAjustado> rangoPreciosAjustadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOperacionIdTipoOperacion")
    private List<InformacionPrincipal> informacionPrincipalList;

    public TipoOperacion() {
    }

    public TipoOperacion(Integer idTipoOperacion) {
        this.idTipoOperacion = idTipoOperacion;
    }

    public TipoOperacion(Integer idTipoOperacion, String nombreTipoOperacion) {
        this.idTipoOperacion = idTipoOperacion;
        this.nombreTipoOperacion = nombreTipoOperacion;
    }

    public Integer getIdTipoOperacion() {
        return idTipoOperacion;
    }

    public void setIdTipoOperacion(Integer idTipoOperacion) {
        this.idTipoOperacion = idTipoOperacion;
    }

    public String getNombreTipoOperacion() {
        return nombreTipoOperacion;
    }

    public void setNombreTipoOperacion(String nombreTipoOperacion) {
        this.nombreTipoOperacion = nombreTipoOperacion;
    }

    @XmlTransient
    public List<RangoPreciosAjustado> getRangoPreciosAjustadoList() {
        return rangoPreciosAjustadoList;
    }

    public void setRangoPreciosAjustadoList(List<RangoPreciosAjustado> rangoPreciosAjustadoList) {
        this.rangoPreciosAjustadoList = rangoPreciosAjustadoList;
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
        hash += (idTipoOperacion != null ? idTipoOperacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoOperacion)) {
            return false;
        }
        TipoOperacion other = (TipoOperacion) object;
        if ((this.idTipoOperacion == null && other.idTipoOperacion != null) || (this.idTipoOperacion != null && !this.idTipoOperacion.equals(other.idTipoOperacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.TipoOperacion[ idTipoOperacion=" + idTipoOperacion + " ]";
    }
    
}
