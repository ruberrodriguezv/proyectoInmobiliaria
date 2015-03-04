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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruber
 */
@Entity
@Table(name = "informacion_principal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacionPrincipal.findAll", query = "SELECT i FROM InformacionPrincipal i"),
    @NamedQuery(name = "InformacionPrincipal.findByIdInformacionPrincipal", query = "SELECT i FROM InformacionPrincipal i WHERE i.idInformacionPrincipal = :idInformacionPrincipal"),
    @NamedQuery(name = "InformacionPrincipal.findByFechaRegistroEvento", query = "SELECT i FROM InformacionPrincipal i WHERE i.fechaRegistroEvento = :fechaRegistroEvento")})
public class InformacionPrincipal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_informacion_principal")
    private Integer idInformacionPrincipal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro_evento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroEvento;
    @JoinColumn(name = "ciudad_consecutivo_ciudad", referencedColumnName = "consecutivo_ciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudadConsecutivoCiudad;
    @JoinColumn(name = "cocina_id_cocina", referencedColumnName = "id_cocina")
    @ManyToOne(optional = false)
    private Cocina cocinaIdCocina;
    @JoinColumn(name = "condicion_id_condicion", referencedColumnName = "id_condicion")
    @ManyToOne(optional = false)
    private Condicion condicionIdCondicion;
    @JoinColumn(name = "departamento_id_departamento", referencedColumnName = "id_departamento")
    @ManyToOne(optional = false)
    private Departamento departamentoIdDepartamento;
    @JoinColumn(name = "tiempo_construido_id_tiempo_construido", referencedColumnName = "id_tiempo_construido")
    @ManyToOne(optional = false)
    private TiempoConstruido tiempoConstruidoIdTiempoConstruido;
    @JoinColumn(name = "tipo_operacion_id_tipo_operacion", referencedColumnName = "id_tipo_operacion")
    @ManyToOne(optional = false)
    private TipoOperacion tipoOperacionIdTipoOperacion;
    @JoinColumn(name = "estado_id_estado", referencedColumnName = "id_estado")
    @ManyToOne(optional = false)
    private Estado estadoIdEstado;
    @JoinColumn(name = "estrato_id_estrato", referencedColumnName = "id_estrato")
    @ManyToOne(optional = false)
    private Estrato estratoIdEstrato;
    @JoinColumn(name = "zona_id_zona", referencedColumnName = "id_zona")
    @ManyToOne(optional = false)
    private Zona zonaIdZona;
    @JoinColumn(name = "garaje_id_garaje", referencedColumnName = "id_garaje")
    @ManyToOne(optional = false)
    private Garaje garajeIdGaraje;
    @JoinColumn(name = "rango_precios_ajustado_id_rango_precios_ajustado", referencedColumnName = "id_rango_precios_ajustado")
    @ManyToOne(optional = false)
    private RangoPreciosAjustado rangoPreciosAjustadoIdRangoPreciosAjustado;
    @JoinColumn(name = "tipo_inmueble_id_tipo_inmueble", referencedColumnName = "id_tipo_inmueble")
    @ManyToOne(optional = false)
    private TipoInmueble tipoInmuebleIdTipoInmueble;
    @JoinColumn(name = "numero_alcobas_id_numero_alcobas", referencedColumnName = "id_numero_alcobas")
    @ManyToOne(optional = false)
    private NumeroAlcobas numeroAlcobasIdNumeroAlcobas;
    @JoinColumn(name = "numero_banios_id_numero_banios", referencedColumnName = "id_numero_banios")
    @ManyToOne(optional = false)
    private NumeroBanios numeroBaniosIdNumeroBanios;
    @JoinColumn(name = "numero_plantas_id_numero_plantas", referencedColumnName = "id_numero_plantas")
    @ManyToOne(optional = false)
    private NumeroPlantas numeroPlantasIdNumeroPlantas;
    @JoinColumn(name = "parqueadero_id_parqueadero", referencedColumnName = "id_parqueadero")
    @ManyToOne(optional = false)
    private Parqueadero parqueaderoIdParqueadero;
    @JoinColumn(name = "tipo_propiedad_id_tipo_propiedad", referencedColumnName = "id_tipo_propiedad")
    @ManyToOne(optional = false)
    private TipoPropiedad tipoPropiedadIdTipoPropiedad;
    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario usuarioIdUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "informacionPrincipal")
    private List<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariasList;

    public InformacionPrincipal() {
    }

    public InformacionPrincipal(Integer idInformacionPrincipal) {
        this.idInformacionPrincipal = idInformacionPrincipal;
    }

    public InformacionPrincipal(Integer idInformacionPrincipal, Date fechaRegistroEvento) {
        this.idInformacionPrincipal = idInformacionPrincipal;
        this.fechaRegistroEvento = fechaRegistroEvento;
    }

    public Integer getIdInformacionPrincipal() {
        return idInformacionPrincipal;
    }

    public void setIdInformacionPrincipal(Integer idInformacionPrincipal) {
        this.idInformacionPrincipal = idInformacionPrincipal;
    }

    public Date getFechaRegistroEvento() {
        return fechaRegistroEvento;
    }

    public void setFechaRegistroEvento(Date fechaRegistroEvento) {
        this.fechaRegistroEvento = fechaRegistroEvento;
    }

    public Ciudad getCiudadConsecutivoCiudad() {
        return ciudadConsecutivoCiudad;
    }

    public void setCiudadConsecutivoCiudad(Ciudad ciudadConsecutivoCiudad) {
        this.ciudadConsecutivoCiudad = ciudadConsecutivoCiudad;
    }

    public Cocina getCocinaIdCocina() {
        return cocinaIdCocina;
    }

    public void setCocinaIdCocina(Cocina cocinaIdCocina) {
        this.cocinaIdCocina = cocinaIdCocina;
    }

    public Condicion getCondicionIdCondicion() {
        return condicionIdCondicion;
    }

    public void setCondicionIdCondicion(Condicion condicionIdCondicion) {
        this.condicionIdCondicion = condicionIdCondicion;
    }

    public Departamento getDepartamentoIdDepartamento() {
        return departamentoIdDepartamento;
    }

    public void setDepartamentoIdDepartamento(Departamento departamentoIdDepartamento) {
        this.departamentoIdDepartamento = departamentoIdDepartamento;
    }

    public TiempoConstruido getTiempoConstruidoIdTiempoConstruido() {
        return tiempoConstruidoIdTiempoConstruido;
    }

    public void setTiempoConstruidoIdTiempoConstruido(TiempoConstruido tiempoConstruidoIdTiempoConstruido) {
        this.tiempoConstruidoIdTiempoConstruido = tiempoConstruidoIdTiempoConstruido;
    }

    public TipoOperacion getTipoOperacionIdTipoOperacion() {
        return tipoOperacionIdTipoOperacion;
    }

    public void setTipoOperacionIdTipoOperacion(TipoOperacion tipoOperacionIdTipoOperacion) {
        this.tipoOperacionIdTipoOperacion = tipoOperacionIdTipoOperacion;
    }

    public Estado getEstadoIdEstado() {
        return estadoIdEstado;
    }

    public void setEstadoIdEstado(Estado estadoIdEstado) {
        this.estadoIdEstado = estadoIdEstado;
    }

    public Estrato getEstratoIdEstrato() {
        return estratoIdEstrato;
    }

    public void setEstratoIdEstrato(Estrato estratoIdEstrato) {
        this.estratoIdEstrato = estratoIdEstrato;
    }

    public Zona getZonaIdZona() {
        return zonaIdZona;
    }

    public void setZonaIdZona(Zona zonaIdZona) {
        this.zonaIdZona = zonaIdZona;
    }

    public Garaje getGarajeIdGaraje() {
        return garajeIdGaraje;
    }

    public void setGarajeIdGaraje(Garaje garajeIdGaraje) {
        this.garajeIdGaraje = garajeIdGaraje;
    }

    public RangoPreciosAjustado getRangoPreciosAjustadoIdRangoPreciosAjustado() {
        return rangoPreciosAjustadoIdRangoPreciosAjustado;
    }

    public void setRangoPreciosAjustadoIdRangoPreciosAjustado(RangoPreciosAjustado rangoPreciosAjustadoIdRangoPreciosAjustado) {
        this.rangoPreciosAjustadoIdRangoPreciosAjustado = rangoPreciosAjustadoIdRangoPreciosAjustado;
    }

    public TipoInmueble getTipoInmuebleIdTipoInmueble() {
        return tipoInmuebleIdTipoInmueble;
    }

    public void setTipoInmuebleIdTipoInmueble(TipoInmueble tipoInmuebleIdTipoInmueble) {
        this.tipoInmuebleIdTipoInmueble = tipoInmuebleIdTipoInmueble;
    }

    public NumeroAlcobas getNumeroAlcobasIdNumeroAlcobas() {
        return numeroAlcobasIdNumeroAlcobas;
    }

    public void setNumeroAlcobasIdNumeroAlcobas(NumeroAlcobas numeroAlcobasIdNumeroAlcobas) {
        this.numeroAlcobasIdNumeroAlcobas = numeroAlcobasIdNumeroAlcobas;
    }

    public NumeroBanios getNumeroBaniosIdNumeroBanios() {
        return numeroBaniosIdNumeroBanios;
    }

    public void setNumeroBaniosIdNumeroBanios(NumeroBanios numeroBaniosIdNumeroBanios) {
        this.numeroBaniosIdNumeroBanios = numeroBaniosIdNumeroBanios;
    }

    public NumeroPlantas getNumeroPlantasIdNumeroPlantas() {
        return numeroPlantasIdNumeroPlantas;
    }

    public void setNumeroPlantasIdNumeroPlantas(NumeroPlantas numeroPlantasIdNumeroPlantas) {
        this.numeroPlantasIdNumeroPlantas = numeroPlantasIdNumeroPlantas;
    }

    public Parqueadero getParqueaderoIdParqueadero() {
        return parqueaderoIdParqueadero;
    }

    public void setParqueaderoIdParqueadero(Parqueadero parqueaderoIdParqueadero) {
        this.parqueaderoIdParqueadero = parqueaderoIdParqueadero;
    }

    public TipoPropiedad getTipoPropiedadIdTipoPropiedad() {
        return tipoPropiedadIdTipoPropiedad;
    }

    public void setTipoPropiedadIdTipoPropiedad(TipoPropiedad tipoPropiedadIdTipoPropiedad) {
        this.tipoPropiedadIdTipoPropiedad = tipoPropiedadIdTipoPropiedad;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
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
        hash += (idInformacionPrincipal != null ? idInformacionPrincipal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionPrincipal)) {
            return false;
        }
        InformacionPrincipal other = (InformacionPrincipal) object;
        if ((this.idInformacionPrincipal == null && other.idInformacionPrincipal != null) || (this.idInformacionPrincipal != null && !this.idInformacionPrincipal.equals(other.idInformacionPrincipal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inmobiliaria.entities.InformacionPrincipal[ idInformacionPrincipal=" + idInformacionPrincipal + " ]";
    }
    
}
