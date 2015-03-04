/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ruber
 */
@Embeddable
public class InformacionPrincipalHasEspecificacionesVariasPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "informacion_principal_id_informacion_principal")
    private int informacionPrincipalIdInformacionPrincipal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "especificaciones_varias_id_especificaciones_varias")
    private int especificacionesVariasIdEspecificacionesVarias;

    public InformacionPrincipalHasEspecificacionesVariasPK() {
    }

    public InformacionPrincipalHasEspecificacionesVariasPK(int informacionPrincipalIdInformacionPrincipal, int especificacionesVariasIdEspecificacionesVarias) {
        this.informacionPrincipalIdInformacionPrincipal = informacionPrincipalIdInformacionPrincipal;
        this.especificacionesVariasIdEspecificacionesVarias = especificacionesVariasIdEspecificacionesVarias;
    }

    public int getInformacionPrincipalIdInformacionPrincipal() {
        return informacionPrincipalIdInformacionPrincipal;
    }

    public void setInformacionPrincipalIdInformacionPrincipal(int informacionPrincipalIdInformacionPrincipal) {
        this.informacionPrincipalIdInformacionPrincipal = informacionPrincipalIdInformacionPrincipal;
    }

    public int getEspecificacionesVariasIdEspecificacionesVarias() {
        return especificacionesVariasIdEspecificacionesVarias;
    }

    public void setEspecificacionesVariasIdEspecificacionesVarias(int especificacionesVariasIdEspecificacionesVarias) {
        this.especificacionesVariasIdEspecificacionesVarias = especificacionesVariasIdEspecificacionesVarias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) informacionPrincipalIdInformacionPrincipal;
        hash += (int) especificacionesVariasIdEspecificacionesVarias;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionPrincipalHasEspecificacionesVariasPK)) {
            return false;
        }
        InformacionPrincipalHasEspecificacionesVariasPK other = (InformacionPrincipalHasEspecificacionesVariasPK) object;
        if (this.informacionPrincipalIdInformacionPrincipal != other.informacionPrincipalIdInformacionPrincipal) {
            return false;
        }
        if (this.especificacionesVariasIdEspecificacionesVarias != other.especificacionesVariasIdEspecificacionesVarias) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.InformacionPrincipalHasEspecificacionesVariasPK[ informacionPrincipalIdInformacionPrincipal=" + informacionPrincipalIdInformacionPrincipal + ", especificacionesVariasIdEspecificacionesVarias=" + especificacionesVariasIdEspecificacionesVarias + " ]";
    }
    
}
