package com.ibrakor.data;

import com.ibrakor.domain.models.Accesorios;

import java.util.Map;
import java.util.TreeMap;

public class AccesoriosDataStore {
    private static AccesoriosDataStore instance = null;
    private Map<String, Accesorios> dataStore = new TreeMap<>();
    //Guardar
    public void save(Accesorios accesorios){
        dataStore.put(accesorios.getCodigo(), accesorios);
    }
    //Modificar
    public void update (Accesorios accesorios) {dataStore.put(accesorios.getCodigo(),accesorios);}
    //Buscar / Obtener
    public  Accesorios search (String codigo) {
        return dataStore.get(codigo);
    }
    //Borrar
    public void delete(String codigo){dataStore.remove(codigo);}
}
