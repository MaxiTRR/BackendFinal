
package com.portfolio.mht.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size (min=1, max=50, message = "No cumple con la longitud")
    private String lugar;
    
    @NotNull
    @Size (min=1, max=50, message = "No cumple con la longitud")
    private String periodo;
    
    @NotNull
    @Size (min=1, max=50, message = "No cumple con la longitud")
    private String area;
    
    @NotNull
    @Size (min=1, max=50, message = "No cumple con la longitud")
    private String rol;
    
    private String logo;
    
    //Constructors
    public Experience() {
    }

    public Experience(String lugar, String periodo, String area, String rol, String logo) {
        this.lugar = lugar;
        this.periodo = periodo;
        this.area = area;
        this.rol = rol;
        this.logo = logo;
    }
    
    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
}
