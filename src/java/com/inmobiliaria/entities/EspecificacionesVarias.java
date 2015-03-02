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
@Table(name = "especificaciones_varias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EspecificacionesVarias.findAll", query = "SELECT e FROM EspecificacionesVarias e"),
    @NamedQuery(name = "EspecificacionesVarias.findByIdEspecificacionesVarias", query = "SELECT e FROM EspecificacionesVarias e WHERE e.idEspecificacionesVarias = :idEspecificacionesVarias"),
    @NamedQuery(name = "EspecificacionesVarias.findByNombreEspecificiacionesVarias", query = "SELECT e FROM EspecificacionesVarias e WHERE e.nombreEspecificiacionesVarias = :nombreEspecificiacionesVarias")})
public class EspecificacionesVarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_especificaciones_varias")
    private Integer idEspecificacionesVarias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_especificiaciones_varias")
    private String nombreEspecificiacionesVarias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "especificacionesVarias")
    private List<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariasList;

    public EspecificacionesVarias() {
    }

    public EspecificacionesVarias(Integer idEspecificacionesVarias) {
        this.idEspecificacionesVarias = idEspecificacionesVarias;
    }

    public EspecificacionesVarias(Integer idEspecificacionesVarias, String nombreEspecificiacionesVarias) {
        this.idEspecificacionesVarias = idEspecificacionesVarias;
        this.nombreEspecificiacionesVarias = nombreEspecificiacionesVarias;
    }

    public Integer getIdEspecificacionesVarias() {
        return idEspecificacionesVarias;
    }

    public void setIdEspecificacionesVarias(Integer idEspecificacionesVarias) {
        this.idEspecificacionesVarias = idEspecificacionesVarias;
    }

    public String getNombreEspecificiacionesVarias() {
        return nombreEspecificiacionesVarias;
    }

    public void setNombreEspecificiacionesVarias(String nombreEspecificiacionesVarias) {
        this.nombreEspecificiacionesVarias = nombreEspecificiacionesVarias;
    }

    @XmlTransient
    public List<InformacionPrincipalHasEspecificacionesVarias> getInformacionPrincipalHasEspecificacionesVariasList() {
        return informacionPrincipalHasEspecificacionesVariasList;
    }

    public void setInformacionPrincipalHasEspecificacionesVariasList(List<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariasList) {
        this.informacionPrincipalHasEspecificacionesVariasList = informacionPrincipalHasEspecificacionesVariasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEspecificacionesVarias != null ? idEspecificacionesVarias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecificacionesVarias)) {
            return false;
        }
        EspecificacionesVarias other = (EspecificacionesVarias) object;
        if ((this.idEspecificacionesVarias == null && other.idEspecificacionesVarias != null) || (this.idEspecificacionesVarias != null && !this.idEspecificacionesVarias.equals(other.idEspecificacionesVarias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.EspecificacionesVarias[ idEspecificacionesVarias=" + idEspecificacionesVarias + " ]";
    }
    
}
