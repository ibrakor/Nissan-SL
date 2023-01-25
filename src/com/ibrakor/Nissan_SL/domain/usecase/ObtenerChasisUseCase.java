package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.ChasisDataStore;
import com.ibrakor.Nissan_SL.domain.models.Chasis;

public class ObtenerChasisUseCase {
    private ChasisDataStore chasisDataStore = new ChasisDataStore();

    public Chasis execute(String codigo){
       return this.chasisDataStore.search(codigo);
    }
}
