package com.ibrakor.domain.models;

public class Motor implements Accesorios{
    private Integer codigo;
    private String modelo;
    private Integer cilindrada;
    private Integer caballos;
    private Integer unidades;

    @Override
    public Integer getCodigo() {
        return null;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
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
