package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            ejercicio1();
            ejercicio2();
            ejercicio3();
    }

    static void ejercicio1(){
        Gato gato1 = new Gato();
        gato1.setEdad(3);
        gato1.setNombre("Sr. Bigotes");
        gato1.setPeso(3.2);
        gato1.setEsMacho(true);
        gato1.setInicial('S');
        gato1.setRazaDeGato("americano");
        gato1.setDueño("Leiner Pachas");
        gato1.setColor("Negro");


        System.out.println(gato1.getEdad());
        System.out.println(gato1.getNombre());
        System.out.println(gato1.getPeso());
        System.out.println(gato1.getEsMacho());
        System.out.println(gato1.getInicial());
        System.out.println(gato1.getRazaDeGato());
        System.out.println(gato1.getDueño());
        System.out.println(gato1.getColor());


        Gato gato2 = new Gato(2, "Princesa",2.9,false,'P',"Americano","Leiner Pachas","Blanco" );
        gato2.decirEdad();
        gato2.decirNombreEInicial();
        gato2.mostrarPeso();
        gato2.mostrarGenero();
        gato2.decirRaza();
        gato2.decirDueño();
        gato2.decirColor();
    }

    static void ejercicio2(){
        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Hola");
        listaDeStrings.add("soy");
        listaDeStrings.add("Juan");
        listaDeStrings.add("Perez");

        String saludo = "";

        for (String elementoListaString: listaDeStrings) {
            saludo = saludo + elementoListaString;
        }

        System.out.println(saludo);
    }

    static void ejercicio3(){
        double x = 12.5;
        double y = 13.3;
        double result;
        boolean soniguales;

        result = Calculadora.sumar2Numeros(x,y);
        System.out.println("La suma es: "+ result);

        result = Calculadora.resta2Numeros(x,y);
        System.out.println("La resta es: "+ result);

        result = Calculadora.multiplica2Numeros(x,y);
        System.out.println("El producto es: "+ result);

        result = Calculadora.divide2Numeros(x,y);
        System.out.println("El división es: "+ result);

        soniguales = Calculadora.sonIguales(x,y);
        if (soniguales){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros son diferentes");
        }


    }
}
