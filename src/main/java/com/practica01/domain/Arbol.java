package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idArbol;
    private String nombre;
    private String rutaImagen;
    private boolean sano;
    private String Descripcion;
}

/* 

create table techshop.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30) NOT NULL,
  ruta_imagen varchar(1024),
  sano bool,
  PRIMARY KEY (id_arbol))

*/
