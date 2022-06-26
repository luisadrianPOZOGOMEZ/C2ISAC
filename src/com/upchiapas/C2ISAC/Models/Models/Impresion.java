package com.upchiapas.C2ISAC.Models.Models;

public class Impresion {
    private LecturaDatos datos;
    public CalcularSuerte suerte;

    //public Impresion(LecturaDatos datos, CalcularSuerte suerte) {
    //    this.datos = datos;
    //    this.suerte = suerte;
    //}

    public Impresion() {

    }

    public void resultado(int numeroSuerte){
        System.out.println("El numero de la suerte es: " + numeroSuerte);
    }
}
