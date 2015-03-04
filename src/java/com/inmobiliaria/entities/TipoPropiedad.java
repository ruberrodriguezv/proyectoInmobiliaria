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
@Table(name = "tipo_propiedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPropiedad.findAll", query = "SELECT t FROM TipoPropiedad t"),
    @NamedQuery(name = "TipoPropiedad.findByIdTipoPropiedad", query = "SELECT t FROM TipoPropiedad t WHERE t.idTipoPropiedad = :idTipoPropiedad"),
    @NamedQuery(name = "TipoPropiedad.findByNombreTipoPropiedad", query = "SELECT t FROM TipoPropiedad t WHERE t.nombreTipoPropiedad = :nombreTipoPropiedad")})
public class TipoPropiedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_propiedad")
    private Integer idTipoPropiedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_tipo_propiedad")
    private String nombreTipoPropiedad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoPropiedadIdTipoPropiedad")
    private List<InformacionPrincipal> informacionPrincipalList;

    public TipoPropiedad() {
    }

    public TipoPropiedad(Integer idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public TipoPropiedad(Integer idTipoPropiedad, String nombreTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
        this.nombreTipoPropiedad = nombreTipoPropiedad;
    }

    public Integer getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(Integer idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public String getNombreTipoPropiedad() {
        return nombreTipoPropiedad;
    }

    public void setNombreTipoPropiedad(String nombreTipoPropiedad) {
        this.nombreTipoPropiedad = nombreTipoPropiedad;
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
        hash += (idTipoPropiedad != null ? idTipoPropiedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPropiedad)) {
            return false;
        }
        TipoPropiedad other = (TipoPropiedad) object;
        if ((this.idTipoPropiedad == null && other.idTipoPropiedad != null) || (this.idTipoPropiedad != null && !this.idTipoPropiedad.equals(other.idTipoPropiedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.TipoPropiedad[ idTipoPropiedad=" + idTipoPropiedad + " ]";
    }
    
}
