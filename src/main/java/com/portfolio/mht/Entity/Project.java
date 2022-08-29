
package com.portfolio.mht.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=1, max=50, message="No cumple con la longitud")
    private String tituloPro;
    
    @NotNull
    @Size(min=1, max=50, message="No cumple con la longitud")
    private String tipoPro;
    
    @NotNull
    @Size(min=1, max=50, message="No cumple con la longitud")
    private String periodoPro;
    
    @NotNull
    @Size(min=1, max=150, message="No cumple con la longitud")
    private String descripcionPro;
    
    private String imgProject;
    
    //Constructor

    public Project() {
    }

    public Project(String tituloPro, String tipoPro, String periodoPro, String descripcionPro, String imgProject) {
        this.tituloPro = tituloPro;
        this.tipoPro = tipoPro;
        this.periodoPro = periodoPro;
        this.descripcionPro = descripcionPro;
        this.imgProject = imgProject;
    }
    
    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloPro() {
        return tituloPro;
    }

    public void setTituloPro(String tituloPro) {
        this.tituloPro = tituloPro;
    }

    public String getTipoPro() {
        return tipoPro;
    }

    public void setTipoPro(String tipoPro) {
        this.tipoPro = tipoPro;
    }

    public String getPeriodoPro() {
        return periodoPro;
    }

    public void setPeriodoPro(String periodoPro) {
        this.periodoPro = periodoPro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getImgProject() {
        return imgProject;
    }

    public void setImgProject(String imgProject) {
        this.imgProject = imgProject;
    }
    
              
}
