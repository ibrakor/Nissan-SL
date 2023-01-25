package com.ibrakor.Nissan_SL.domain.models;

public class Ruedas implements Accesorios{

    private Integer codigo;
    private String modelo;
    private String marca;
    private Integer diametro;
    private Integer unidades;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    @Override
    public String getCodigo() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public Integer getUnidades() {
        return null;
    }
}
