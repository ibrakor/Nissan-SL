package com.ibrakor.domain.models;

public class Chasis {
    private String codBastidor;
    private String modeloChasis;
    private String marcaChasis;
    private Accesorios accesorios;

    public String getCodBastidor() {
        return codBastidor;
    }

    public void setCodBastidor(String codBastidor) {
        this.codBastidor = codBastidor;
    }

    public String getModeloChasis() {
        return modeloChasis;
    }

    public void setModeloChasis(String modeloChasis) {
        this.modeloChasis = modeloChasis;
    }

    public String getMarcaChasis() {
        return marcaChasis;
    }

    public void setMarcaChasis(String marcaChasis) {
        this.marcaChasis = marcaChasis;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }
}
