package com.danielgutierrez.api_finanza_personales.Movimiento.Model;

import com.danielgutierrez.api_finanza_personales.Usuario.Model.Usuario;
import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

@Entity
public class Movimiento {

    public Integer idMovimiento;
    public BigDecimal monto;
    public Data fecha;
    public String descripicion;
    public String tipo;
    //public Categoria categoria;
    public Usuario usuario;

}
