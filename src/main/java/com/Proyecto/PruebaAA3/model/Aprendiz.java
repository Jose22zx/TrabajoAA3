package com.Proyecto.PruebaAA3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 Clase para crear la aplicacion 
 */

@Entity
@Data
public class Aprendiz {
  @Id
  @Column
  private long iduser;
  
  @Column
  private String nombre;
  
  @Column
  private String apellido;
  
  @Column
  private String email;
   
}
