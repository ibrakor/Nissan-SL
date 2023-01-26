package com.ibrakor.Nissan_SL.domain.models;

public class Motor implements Accesorios{
    private String codigo;
    private String modelo;
    private Double cilindrada;
    private Integer caballos;
    private Integer unidades;

    @Override
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
    }

    @Override
    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
    public void restarUnaUnidad(Motor motor) {
        motor.setUnidades(motor.getUnidades() - 1);
    }

}
