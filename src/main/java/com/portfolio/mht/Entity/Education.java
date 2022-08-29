
package com.portfolio.mht.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=1, max=50, message="No cumple con la longitud" )
    private String nombreInst;
    
    
    @NotNull
    @Size(min=1, max=50, message="No cumple con la longitud" )
    private String periodoEdu;
    
    @NotNull
    @Size(min=1, max=50, message="No cumple con la longitud" )
    private String tituloEdu;
    
    @NotNull
    @Size(min=1, max=300, message="No cumple con la longitud" )
    private String descripcionEdu;
    
    private String logoEdu;
    
    //Constructors

    public Education() {
    }

    public Education(String nombreInst, String periodoEdu, String tituloEdu, String descripcionEdu, String logoEdu) {
        this.nombreInst = nombreInst;
        this.periodoEdu = periodoEdu;
        this.tituloEdu = tituloEdu;
        this.descripcionEdu = descripcionEdu;
        this.logoEdu = logoEdu;
    }
    
    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreInst() {
        return nombreInst;
    }

    public void setNombreInst(String nombreInst) {
        this.nombreInst = nombreInst;
    }

    public String getPeriodoEdu() {
        return periodoEdu;
    }

    public void setPeriodoEdu(String periodoEdu) {
        this.periodoEdu = periodoEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getLogoEdu() {
        return logoEdu;
    }

    public void setLogoEdu(String logoEdu) {
        this.logoEdu = logoEdu;
    }
    
}
