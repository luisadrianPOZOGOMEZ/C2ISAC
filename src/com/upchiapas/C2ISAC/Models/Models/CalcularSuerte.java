package com.upchiapas.C2ISAC.Models.Models;

public class CalcularSuerte {
    private LecturaDatos datos;

    public CalcularSuerte(LecturaDatos datos){
        this.datos=datos;
    }
    public void suma(){
        RNumeroSuerte(datos.getDia() + datos.getMes() + datos.getAño());

    }
    public void RNumeroSuerte(int numero){
        String aux = Integer.toString(numero);
        Impresion suerteRNS = new Impresion();
        Integer [] digitos = new Integer[aux.length()];
        Integer [] resultado = new Integer[aux.length()];
        resultado[0] = numero/10;
        digitos[0] = numero%10;
        for(int i=1; i<aux.length(); i++){
            resultado[i] = resultado [i-1]/10;
            digitos[i] = resultado [i-1]%10;
        }
        numero=0;
        for (int i=0; i<aux.length();i++){
            numero += digitos[i];
        }
        suerteRNS.resultado(numero);
    }
}
