package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.AccesoriosDataStore;
import com.ibrakor.Nissan_SL.domain.models.Accesorios;

public class CrearAccesorioUseCase {
     private AccesoriosDataStore accesoriosDataStore = AccesoriosDataStore.getInstance();

    public void execute(Accesorios accesorio){
        this.accesoriosDataStore.save(accesorio);
    }
}
