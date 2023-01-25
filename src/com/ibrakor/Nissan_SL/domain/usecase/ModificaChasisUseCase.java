package com.ibrakor.Nissan_SL.domain.usecase;

import com.ibrakor.Nissan_SL.data.ChasisDataStore;
import com.ibrakor.Nissan_SL.domain.models.Chasis;

public class ModificaChasisUseCase {
    private ChasisDataStore chasisDataStore = new ChasisDataStore();

    public void execute(Chasis chasis){
        this.chasisDataStore.update(chasis);
    }
}
