/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmobiliaria.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Usuario.findByApellidoUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidoUsuario = :apellidoUsuario"),
    @NamedQuery(name = "Usuario.findByFechaNacimientoUsuario", query = "SELECT u FROM Usuario u WHERE u.fechaNacimientoUsuario = :fechaNacimientoUsuario"),
    @NamedQuery(name = "Usuario.findByDireccionUsuario", query = "SELECT u FROM Usuario u WHERE u.direccionUsuario = :direccionUsuario"),
    @NamedQuery(name = "Usuario.findByBarrioUsuario", query = "SELECT u FROM Usuario u WHERE u.barrioUsuario = :barrioUsuario"),
    @NamedQuery(name = "Usuario.findByTelefonoUsuario", query = "SELECT u FROM Usuario u WHERE u.telefonoUsuario = :telefonoUsuario"),
    @NamedQuery(name = "Usuario.findByEmailUsuario", query = "SELECT u FROM Usuario u WHERE u.emailUsuario = :emailUsuario"),
    @NamedQuery(name = "Usuario.findByUserUsuario", query = "SELECT u FROM Usuario u WHERE u.userUsuario = :userUsuario"),
    @NamedQuery(name = "Usuario.findByContraseniaUsuario", query = "SELECT u FROM Usuario u WHERE u.contraseniaUsuario = :contraseniaUsuario")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido_usuario")
    private String apellidoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento_usuario")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion_usuario")
    private String direccionUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "barrio_usuario")
    private String barrioUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telefono_usuario")
    private String telefonoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email_usuario")
    private String emailUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "user_usuario")
    private String userUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "contrasenia_usuario")
    private String contraseniaUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdUsuario")
    private List<InformacionPrincipal> informacionPrincipalList;
    @JoinColumn(name = "ciudad_consecutivo_ciudad", referencedColumnName = "consecutivo_ciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudadConsecutivoCiudad;
    @JoinColumn(name = "departamento_id_departamento", referencedColumnName = "id_departamento")
    @ManyToOne(optional = false)
    private Departamento departamentoIdDepartamento;
    @JoinColumn(name = "genero_id_genero", referencedColumnName = "id_genero")
    @ManyToOne(optional = false)
    private Genero generoIdGenero;
    @JoinColumn(name = "roles_id_roles", referencedColumnName = "id_roles")
    @ManyToOne(optional = false)
    private Roles rolesIdRoles;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String nombreUsuario, String apellidoUsuario, Date fechaNacimientoUsuario, String direccionUsuario, String barrioUsuario, String telefonoUsuario, String emailUsuario, String userUsuario, String contraseniaUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.barrioUsuario = barrioUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.emailUsuario = emailUsuario;
        this.userUsuario = userUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getBarrioUsuario() {
        return barrioUsuario;
    }

    public void setBarrioUsuario(String barrioUsuario) {
        this.barrioUsuario = barrioUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getUserUsuario() {
        return userUsuario;
    }

    public void setUserUsuario(String userUsuario) {
        this.userUsuario = userUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    @XmlTransient
    public List<InformacionPrincipal> getInformacionPrincipalList() {
        return informacionPrincipalList;
    }

    public void setInformacionPrincipalList(List<InformacionPrincipal> informacionPrincipalList) {
        this.informacionPrincipalList = informacionPrincipalList;
    }

    public Ciudad getCiudadConsecutivoCiudad() {
        return ciudadConsecutivoCiudad;
    }

    public void setCiudadConsecutivoCiudad(Ciudad ciudadConsecutivoCiudad) {
        this.ciudadConsecutivoCiudad = ciudadConsecutivoCiudad;
    }

    public Departamento getDepartamentoIdDepartamento() {
        return departamentoIdDepartamento;
    }

    public void setDepartamentoIdDepartamento(Departamento departamentoIdDepartamento) {
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    public Genero getGeneroIdGenero() {
        return generoIdGenero;
    }

    public void setGeneroIdGenero(Genero generoIdGenero) {
        this.generoIdGenero = generoIdGenero;
    }

    public Roles getRolesIdRoles() {
        return rolesIdRoles;
    }

    public void setRolesIdRoles(Roles rolesIdRoles) {
        this.rolesIdRoles = rolesIdRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
