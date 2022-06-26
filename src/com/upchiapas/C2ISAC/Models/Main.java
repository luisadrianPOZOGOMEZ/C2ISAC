package com.upchiapas.C2ISAC.Models;

import com.upchiapas.C2ISAC.Models.Models.CalcularSuerte;
import com.upchiapas.C2ISAC.Models.Models.LecturaDatos;
import com.upchiapas.C2ISAC.Models.Models.Impresion;

public class Main {
    private static LecturaDatos datos = new LecturaDatos();
    private static CalcularSuerte suerte = new CalcularSuerte(datos);
    //private static Impresion impresion=new Impresion(datos, suerte);
    public static void main(String[] args) {
        datos.leerDatos();
        suerte.suma();

    }
}

