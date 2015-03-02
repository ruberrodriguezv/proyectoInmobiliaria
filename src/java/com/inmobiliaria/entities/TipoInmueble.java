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
@Table(name = "tipo_inmueble")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInmueble.findAll", query = "SELECT t FROM TipoInmueble t"),
    @NamedQuery(name = "TipoInmueble.findByIdTipoInmueble", query = "SELECT t FROM TipoInmueble t WHERE t.idTipoInmueble = :idTipoInmueble"),
    @NamedQuery(name = "TipoInmueble.findByNombreTipoInmueble", query = "SELECT t FROM TipoInmueble t WHERE t.nombreTipoInmueble = :nombreTipoInmueble")})
public class TipoInmueble implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_inmueble")
    private Integer idTipoInmueble;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_tipo_inmueble")
    private String nombreTipoInmueble;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoInmuebleIdTipoInmueble")
    private List<InformacionPrincipal> informacionPrincipalList;

    public TipoInmueble() {
    }

    public TipoInmueble(Integer idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public TipoInmueble(Integer idTipoInmueble, String nombreTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
        this.nombreTipoInmueble = nombreTipoInmueble;
    }

    public Integer getIdTipoInmueble() {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(Integer idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public String getNombreTipoInmueble() {
        return nombreTipoInmueble;
    }

    public void setNombreTipoInmueble(String nombreTipoInmueble) {
        this.nombreTipoInmueble = nombreTipoInmueble;
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
        hash += (idTipoInmueble != null ? idTipoInmueble.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoInmueble)) {
            return false;
        }
        TipoInmueble other = (TipoInmueble) object;
        if ((this.idTipoInmueble == null && other.idTipoInmueble != null) || (this.idTipoInmueble != null && !this.idTipoInmueble.equals(other.idTipoInmueble))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.TipoInmueble[ idTipoInmueble=" + idTipoInmueble + " ]";
    }
    
}
