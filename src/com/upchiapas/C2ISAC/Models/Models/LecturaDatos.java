package com.upchiapas.C2ISAC.Models.Models;

import java.util.Scanner;

public class LecturaDatos {
    private Scanner entrada=new Scanner(System.in);
    private int dia;
    private int mes;
    private int año;

    public LecturaDatos() {
    }

    public void leerDatos(){
        System.out.println("Dame el dia de nacimiento");
        dia = entrada.nextInt();
        System.out.println("Dame el mes de nacimiento");
        mes = entrada.nextInt();
        System.out.println("Dame el año de nacimiento");
        año = entrada.nextInt();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
}
