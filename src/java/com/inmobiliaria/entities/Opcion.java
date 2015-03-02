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
@Table(name = "opcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Opcion.findAll", query = "SELECT o FROM Opcion o"),
    @NamedQuery(name = "Opcion.findByIdOpcion", query = "SELECT o FROM Opcion o WHERE o.idOpcion = :idOpcion"),
    @NamedQuery(name = "Opcion.findByNombreOpcion", query = "SELECT o FROM Opcion o WHERE o.nombreOpcion = :nombreOpcion")})
public class Opcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_opcion")
    private Integer idOpcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "nombre_opcion")
    private String nombreOpcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opcionIdOpcion")
    private List<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariasList;

    public Opcion() {
    }

    public Opcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public Opcion(Integer idOpcion, String nombreOpcion) {
        this.idOpcion = idOpcion;
        this.nombreOpcion = nombreOpcion;
    }

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getNombreOpcion() {
        return nombreOpcion;
    }

    public void setNombreOpcion(String nombreOpcion) {
        this.nombreOpcion = nombreOpcion;
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
        hash += (idOpcion != null ? idOpcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opcion)) {
            return false;
        }
        Opcion other = (Opcion) object;
        if ((this.idOpcion == null && other.idOpcion != null) || (this.idOpcion != null && !this.idOpcion.equals(other.idOpcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Opcion[ idOpcion=" + idOpcion + " ]";
    }
    
}
