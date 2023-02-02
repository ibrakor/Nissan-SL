package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.ChasisDataStore;
import com.ibrakor.Nissan_SL.domain.models.Chasis;

public class CrearChasisUseCase {
    private ChasisDataStore chasisDataStore = ChasisDataStore.getInstance();

    public void execute(Chasis chasis){
        this.chasisDataStore.save(chasis);
    }
}
