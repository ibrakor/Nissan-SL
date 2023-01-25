package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.ChasisDataStore;
import com.ibrakor.Nissan_SL.domain.models.Chasis;

public class EliminarChasisUseCase {
    private ChasisDataStore chasisDataStore = new ChasisDataStore();

    public void execute(String codigo){
        this.chasisDataStore.delete(codigo);
    }
}
