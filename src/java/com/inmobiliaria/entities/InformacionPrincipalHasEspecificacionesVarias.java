/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "informacion_principal_has_especificaciones_varias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacionPrincipalHasEspecificacionesVarias.findAll", query = "SELECT i FROM InformacionPrincipalHasEspecificacionesVarias i"),
    @NamedQuery(name = "InformacionPrincipalHasEspecificacionesVarias.findByInformacionPrincipalIdInformacionPrincipal", query = "SELECT i FROM InformacionPrincipalHasEspecificacionesVarias i WHERE i.informacionPrincipalHasEspecificacionesVariasPK.informacionPrincipalIdInformacionPrincipal = :informacionPrincipalIdInformacionPrincipal"),
    @NamedQuery(name = "InformacionPrincipalHasEspecificacionesVarias.findByEspecificacionesVariasIdEspecificacionesVarias", query = "SELECT i FROM InformacionPrincipalHasEspecificacionesVarias i WHERE i.informacionPrincipalHasEspecificacionesVariasPK.especificacionesVariasIdEspecificacionesVarias = :especificacionesVariasIdEspecificacionesVarias")})
public class InformacionPrincipalHasEspecificacionesVarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InformacionPrincipalHasEspecificacionesVariasPK informacionPrincipalHasEspecificacionesVariasPK;
    @JoinColumn(name = "opcion_id_opcion", referencedColumnName = "id_opcion")
    @ManyToOne(optional = false)
    private Opcion opcionIdOpcion;
    @JoinColumn(name = "especificaciones_varias_id_especificaciones_varias", referencedColumnName = "id_especificaciones_varias", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EspecificacionesVarias especificacionesVarias;
    @JoinColumn(name = "informacion_principal_id_informacion_principal", referencedColumnName = "id_informacion_principal", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InformacionPrincipal informacionPrincipal;

    public InformacionPrincipalHasEspecificacionesVarias() {
    }

    public InformacionPrincipalHasEspecificacionesVarias(InformacionPrincipalHasEspecificacionesVariasPK informacionPrincipalHasEspecificacionesVariasPK) {
        this.informacionPrincipalHasEspecificacionesVariasPK = informacionPrincipalHasEspecificacionesVariasPK;
    }

    public InformacionPrincipalHasEspecificacionesVarias(int informacionPrincipalIdInformacionPrincipal, int especificacionesVariasIdEspecificacionesVarias) {
        this.informacionPrincipalHasEspecificacionesVariasPK = new InformacionPrincipalHasEspecificacionesVariasPK(informacionPrincipalIdInformacionPrincipal, especificacionesVariasIdEspecificacionesVarias);
    }

    public InformacionPrincipalHasEspecificacionesVariasPK getInformacionPrincipalHasEspecificacionesVariasPK() {
        return informacionPrincipalHasEspecificacionesVariasPK;
    }

    public void setInformacionPrincipalHasEspecificacionesVariasPK(InformacionPrincipalHasEspecificacionesVariasPK informacionPrincipalHasEspecificacionesVariasPK) {
        this.informacionPrincipalHasEspecificacionesVariasPK = informacionPrincipalHasEspecificacionesVariasPK;
    }

    public Opcion getOpcionIdOpcion() {
        return opcionIdOpcion;
    }

    public void setOpcionIdOpcion(Opcion opcionIdOpcion) {
        this.opcionIdOpcion = opcionIdOpcion;
    }

    public EspecificacionesVarias getEspecificacionesVarias() {
        return especificacionesVarias;
    }

    public void setEspecificacionesVarias(EspecificacionesVarias especificacionesVarias) {
        this.especificacionesVarias = especificacionesVarias;
    }

    public InformacionPrincipal getInformacionPrincipal() {
        return informacionPrincipal;
    }

    public void setInformacionPrincipal(InformacionPrincipal informacionPrincipal) {
        this.informacionPrincipal = informacionPrincipal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (informacionPrincipalHasEspecificacionesVariasPK != null ? informacionPrincipalHasEspecificacionesVariasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionPrincipalHasEspecificacionesVarias)) {
            return false;
        }
        InformacionPrincipalHasEspecificacionesVarias other = (InformacionPrincipalHasEspecificacionesVarias) object;
        if ((this.informacionPrincipalHasEspecificacionesVariasPK == null && other.informacionPrincipalHasEspecificacionesVariasPK != null) || (this.informacionPrincipalHasEspecificacionesVariasPK != null && !this.informacionPrincipalHasEspecificacionesVariasPK.equals(other.informacionPrincipalHasEspecificacionesVariasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.InformacionPrincipalHasEspecificacionesVarias[ informacionPrincipalHasEspecificacionesVariasPK=" + informacionPrincipalHasEspecificacionesVariasPK + " ]";
    }
    
}
