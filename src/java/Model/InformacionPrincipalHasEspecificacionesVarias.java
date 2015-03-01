package Model;
// Generated 1/03/2015 06:26:57 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * InformacionPrincipalHasEspecificacionesVarias generated by hbm2java
 */
@Entity
@Table(name="informacion_principal_has_especificaciones_varias"
    ,catalog="inmobiliaria"
)
public class InformacionPrincipalHasEspecificacionesVarias  implements java.io.Serializable {


     private InformacionPrincipalHasEspecificacionesVariasId id;
     private EspecificacionesVarias especificacionesVarias;
     private InformacionPrincipal informacionPrincipal;
     private Opcion opcion;

    public InformacionPrincipalHasEspecificacionesVarias() {
    }

    public InformacionPrincipalHasEspecificacionesVarias(InformacionPrincipalHasEspecificacionesVariasId id, EspecificacionesVarias especificacionesVarias, InformacionPrincipal informacionPrincipal, Opcion opcion) {
       this.id = id;
       this.especificacionesVarias = especificacionesVarias;
       this.informacionPrincipal = informacionPrincipal;
       this.opcion = opcion;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="informacionPrincipalIdInformacionPrincipal", column=@Column(name="informacion_principal_id_informacion_principal", nullable=false) ), 
        @AttributeOverride(name="especificacionesVariasIdEspecificacionesVarias", column=@Column(name="especificaciones_varias_id_especificaciones_varias", nullable=false) ) } )
    public InformacionPrincipalHasEspecificacionesVariasId getId() {
        return this.id;
    }
    
    public void setId(InformacionPrincipalHasEspecificacionesVariasId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="especificaciones_varias_id_especificaciones_varias", nullable=false, insertable=false, updatable=false)
    public EspecificacionesVarias getEspecificacionesVarias() {
        return this.especificacionesVarias;
    }
    
    public void setEspecificacionesVarias(EspecificacionesVarias especificacionesVarias) {
        this.especificacionesVarias = especificacionesVarias;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="informacion_principal_id_informacion_principal", nullable=false, insertable=false, updatable=false)
    public InformacionPrincipal getInformacionPrincipal() {
        return this.informacionPrincipal;
    }
    
    public void setInformacionPrincipal(InformacionPrincipal informacionPrincipal) {
        this.informacionPrincipal = informacionPrincipal;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="opcion_id_opcion", nullable=false)
    public Opcion getOpcion() {
        return this.opcion;
    }
    
    public void setOpcion(Opcion opcion) {
        this.opcion = opcion;
    }




}


