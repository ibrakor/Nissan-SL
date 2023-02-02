package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.AccesoriosDataStore;
import com.ibrakor.Nissan_SL.domain.models.Accesorios;

public class EliminarAccesorioUseCase {
    private AccesoriosDataStore accesoriosDataStore = AccesoriosDataStore.getInstance();

    public void execute(String codigo){
         this.accesoriosDataStore.delete(codigo);
    }
}
