package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.AccesoriosDataStore;
import com.ibrakor.Nissan_SL.domain.models.Accesorios;

public class ObtenerAccesorioUseCase {
    private AccesoriosDataStore accesoriosDataStore = new AccesoriosDataStore();

    public Accesorios execute(String codigo){
       return this.accesoriosDataStore.search(codigo);
    }
}
