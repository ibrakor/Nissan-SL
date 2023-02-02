package com.ibrakor.Nissan_SL.domain.models;

public class Ruedas implements Accesorios {

    private String codigo;
    private String modelo;
    private String marca;
    private Integer diametro;
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
    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public void restarUnaUnidad(Ruedas ruedas) {
        ruedas.setUnidades(ruedas.getUnidades() - 1);
    }
}
