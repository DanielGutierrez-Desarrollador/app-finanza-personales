package com.danielgutierrez.api_finanza_personales.MedioFinancieros.CuentaBancaria.Model;

import com.danielgutierrez.api_finanza_personales.Usuario.Model.Usuario;
import lombok.Data;

public class CuentaBancaria {

    public Integer idCuentaBan;
    public Usuario usuario;
    //public Banco banco;
    //public String aliasUsuario;
    public String tipoCuenta;
    public String numeroReferencia;
    public String moneda;
    public String estado;
    public Data fechaCreacion;

}
