
package com.portfolio.mht.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class InfoPersonal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=1, max=50, message = "No cumple con la longitud")
    private String nombreInfo;
    
    @NotNull
    @Size(min=1, max=100, message = "No cumple con la longitud")
    private String titulo;
    
    private String descripcion;
    
    @NotNull
    @Size(min=1, max=100, message = "No cumple con la longitud")
    private String ciudad;
    
    @NotNull
    @Size(min=1, max=100, message = "No cumple con la longitud")
    private String fechaNac;
    
    private String imgProfile;
    
    //Constructor

    public InfoPersonal() {
    }

    public InfoPersonal(String nombreInfo, String titulo, String descripcion, String ciudad, String fechaNac, String imgProfile) {
        this.nombreInfo = nombreInfo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.fechaNac = fechaNac;
        this.imgProfile = imgProfile;
    }
    
    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreInfo() {
        return nombreInfo;
    }

    public void setNombreInfo(String nombreInfo) {
        this.nombreInfo = nombreInfo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }
    
    
    
}
