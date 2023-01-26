package com.ibrakor.Nissan_SL.presentation;

import com.ibrakor.Nissan_SL.domain.models.Chasis;
import com.ibrakor.Nissan_SL.domain.models.CuadroDeMandos;
import com.ibrakor.Nissan_SL.domain.models.Motor;
import com.ibrakor.Nissan_SL.domain.models.Ruedas;
import com.ibrakor.Nissan_SL.domain.usecase.CrearAccesorioUseCase;
import com.ibrakor.Nissan_SL.domain.usecase.CrearChasisUseCase;
import com.ibrakor.Nissan_SL.domain.usecase.ObtenerAccesorioUseCase;
import com.ibrakor.Nissan_SL.domain.usecase.ObtenerChasisUseCase;

public class Main {
    public static void main(String[] args) {

        Ruedas ruedas1 = new Ruedas();
        ruedas1.setCodigo("1");
        ruedas1.setMarca("Michelin");
        ruedas1.setModelo("Alpin 6");
        ruedas1.setDiametro(185);
        ruedas1.setUnidades(5);

        CrearAccesorioUseCase crearAccesorioUseCase = new CrearAccesorioUseCase();
        ObtenerAccesorioUseCase obtenerAccesorioUseCase = new ObtenerAccesorioUseCase();
        crearAccesorioUseCase.execute(ruedas1);

        Ruedas ruedas2 = new Ruedas();
        ruedas2.setCodigo("2");
        ruedas2.setMarca("Firestone");
        ruedas2.setModelo("WinterHawk");
        ruedas2.setDiametro(205);
        ruedas2.setUnidades(3);

        crearAccesorioUseCase.execute(ruedas2);

        Motor motor1 = new Motor();
        motor1.setCodigo("1");
        motor1.setModelo("X6000");
        motor1.setCilindrada(2.0);
        motor1.setCaballos(120);
        motor1.setUnidades(2);

        crearAccesorioUseCase.execute(motor1);

        Motor motor2 = new Motor();
        motor2.setCodigo("2");
        motor2.setModelo("x9000");
        motor2.setCilindrada(2.4);
        motor2.setCaballos(160);
        motor2.setUnidades(2);

        crearAccesorioUseCase.execute(motor2);

        CuadroDeMandos cuadro1 = new CuadroDeMandos();
        cuadro1.setCodigo("1");
        cuadro1.setModelo("LM2000");
        cuadro1.setUnidades(4);

        crearAccesorioUseCase.execute(cuadro1);

        CuadroDeMandos cuadro2 = new CuadroDeMandos();
        cuadro2.setCodigo("2");
        cuadro2.setModelo("LM6000");
        cuadro2.setUnidades(2);

        crearAccesorioUseCase.execute(cuadro2);

        Chasis chasisA = new Chasis();
        chasisA.setCodBastidor("8912K");
        chasisA.setModeloChasis("OVa900");
        chasisA.setMarcaChasis("Mercedes");
        chasisA.setAccesorios(ruedas1);
        chasisA.setAccesorios(motor2);
        chasisA.setAccesorios(cuadro1);

        CrearChasisUseCase crearChasisUseCase = new CrearChasisUseCase();
        ObtenerChasisUseCase obtenerChasisUseCase = new ObtenerChasisUseCase();
        crearChasisUseCase.execute(chasisA);

        Chasis chasisB = new Chasis();
        chasisB.setCodBastidor("922F");
        chasisB.setModeloChasis("LaFerrari");
        chasisB.setMarcaChasis("Ferrari");
        chasisB.setAccesorios(ruedas2);
        chasisB.setAccesorios(motor2);
        chasisB.setAccesorios(cuadro2);

        crearChasisUseCase.execute(chasisB);

        Chasis chasisC = new Chasis();
        chasisC.setCodBastidor("895M");
        chasisC.setModeloChasis("MC205");
        chasisC.setMarcaChasis("McLaren");
        chasisC.setAccesorios(ruedas1);
        chasisC.setAccesorios(motor1);
        chasisC.setAccesorios(cuadro1);

        crearChasisUseCase.execute(chasisC);

        Chasis chasisD = new Chasis();
        chasisD.setCodBastidor("19L8");
        chasisD.setModeloChasis("811FF");
        chasisD.setMarcaChasis("Audi");
        chasisD.setAccesorios(ruedas1);
        chasisD.setAccesorios(motor1);
        chasisD.setAccesorios(cuadro2);

        crearChasisUseCase.execute(chasisD);






        ChasisPrint chasisPrint = new ChasisPrint();
    // Chasis A
        chasisPrint.print(obtenerChasisUseCase.execute("8912K"));
        System.out.println("Ruedas: "+ruedas1.getModelo());
        System.out.println("Motor: "+motor2.getModelo());
        System.out.println("Cuadro de Mandos: "+cuadro1.getModelo());
    //Chasis B
        chasisPrint.print(obtenerChasisUseCase.execute("922F"));
        System.out.println("Ruedas: "+ruedas2.getModelo());
        System.out.println("Motor: "+motor2.getModelo());
        System.out.println("Cuadro de Mandos: "+cuadro2.getModelo());
    //Chasis C
        chasisPrint.print(obtenerChasisUseCase.execute("895M"));
        System.out.println("Ruedas: "+ruedas1.getModelo());
        System.out.println("Motor: "+motor1.getModelo());
        System.out.println("Cuadro de Mandos: "+cuadro1.getModelo());
    //Chasis D
         chasisPrint.print(obtenerChasisUseCase.execute("19L8"));
        System.out.println("Ruedas: "+ruedas1.getModelo());
        System.out.println("Motor: "+motor1.getModelo());
        System.out.println("Cuadro de Mandos: "+cuadro2.getModelo());
    }
}
