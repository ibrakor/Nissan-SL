package com.ibrakor.data;

import com.ibrakor.domain.models.Accesorios;
import com.ibrakor.domain.models.Chasis;

import java.util.Map;
import java.util.TreeMap;

public class ChasisDataStore {
    private static ChasisDataStore instance = null;
    private Map<String, Chasis> dataStore = new TreeMap<>();

    public void save(Chasis chasis){
        dataStore.put(chasis.getCodBastidor(), chasis);
    }

    public void update (Chasis chasis) {dataStore.put(chasis.getCodBastidor(),chasis);}

    public  Chasis search (String codigo) {
        return dataStore.get(codigo);
    }

    public void delete(String codigo){dataStore.remove(codigo);}


    public static ChasisDataStore getInstance(){
        if (instance == null){
            instance = new ChasisDataStore();
        }
        return instance;
    }

}
