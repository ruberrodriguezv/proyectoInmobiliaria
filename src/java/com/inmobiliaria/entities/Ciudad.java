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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "ciudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudad.findAll", query = "SELECT c FROM Ciudad c"),
    @NamedQuery(name = "Ciudad.findByConsecutivoCiudad", query = "SELECT c FROM Ciudad c WHERE c.consecutivoCiudad = :consecutivoCiudad"),
    @NamedQuery(name = "Ciudad.findByIdCiudad", query = "SELECT c FROM Ciudad c WHERE c.idCiudad = :idCiudad"),
    @NamedQuery(name = "Ciudad.findByNombreCiudad", query = "SELECT c FROM Ciudad c WHERE c.nombreCiudad = :nombreCiudad")})
public class Ciudad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "consecutivo_ciudad")
    private Integer consecutivoCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ciudad")
    private int idCiudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudadConsecutivoCiudad")
    private List<InformacionPrincipal> informacionPrincipalList;
    @JoinColumn(name = "departamento_id_departamento", referencedColumnName = "id_departamento")
    @ManyToOne(optional = false)
    private Departamento departamentoIdDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudadConsecutivoCiudad")
    private List<Usuario> usuarioList;

    public Ciudad() {
    }

    public Ciudad(Integer consecutivoCiudad) {
        this.consecutivoCiudad = consecutivoCiudad;
    }

    public Ciudad(Integer consecutivoCiudad, int idCiudad, String nombreCiudad) {
        this.consecutivoCiudad = consecutivoCiudad;
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
    }

    public Integer getConsecutivoCiudad() {
        return consecutivoCiudad;
    }

    public void setConsecutivoCiudad(Integer consecutivoCiudad) {
        this.consecutivoCiudad = consecutivoCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @XmlTransient
    public List<InformacionPrincipal> getInformacionPrincipalList() {
        return informacionPrincipalList;
    }

    public void setInformacionPrincipalList(List<InformacionPrincipal> informacionPrincipalList) {
        this.informacionPrincipalList = informacionPrincipalList;
    }

    public Departamento getDepartamentoIdDepartamento() {
        return departamentoIdDepartamento;
    }

    public void setDepartamentoIdDepartamento(Departamento departamentoIdDepartamento) {
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consecutivoCiudad != null ? consecutivoCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.consecutivoCiudad == null && other.consecutivoCiudad != null) || (this.consecutivoCiudad != null && !this.consecutivoCiudad.equals(other.consecutivoCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Ciudad[ consecutivoCiudad=" + consecutivoCiudad + " ]";
    }
    
}
