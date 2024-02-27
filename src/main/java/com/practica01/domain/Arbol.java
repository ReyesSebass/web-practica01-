package com.practica01.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;
    private String rutaImagen ;
    private String nombreComun;
    private String nombreCientifico;
    private String tipoFlor;
    private String durezaMadera;
    private String otrosDatos;
    private boolean activo;

    public Arbol() {
       
    }


    public Arbol(String rutaImagen, String nombreComun, String nombreCientifico, String tipoFlor, String durezaMadera, String otrosDatos, boolean activo) {
        this.rutaImagen = rutaImagen;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipoFlor = tipoFlor;
        this.durezaMadera = durezaMadera;
        this.otrosDatos = otrosDatos;
         this.activo = activo;
    }
    
    

    
}