package com.ibrakor.Nissan_SL.presentation;

import com.ibrakor.Nissan_SL.domain.models.Accesorios;
import com.ibrakor.Nissan_SL.domain.models.Chasis;

import java.util.List;

public class ChasisPrint {


    public void print(Chasis chasis ){
        System.out.println("-------------------------");
        System.out.println("El Chasis con codigo de bastidor: "+chasis.getCodBastidor());
        System.out.println("Marca: "+chasis.getMarcaChasis()+"\nModelo: "+chasis.getModeloChasis());
        System.out.println("LLeva montado: ");

        }
    }


