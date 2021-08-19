package com.company;

public class Animal {
    private int edad;
    private String nombre;
    private double peso;
    private boolean esMacho;
    private char inicial;

    //constructor por defecto
    public Animal(){

    }

    //constructor con parámetros
    public Animal(int edad, String nombre, double peso, boolean esMacho, char inicial){
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.esMacho=esMacho;
        this.inicial=inicial;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double getPeso(){
        return peso;
    }

    public void setEsMacho(boolean esMacho){
        this.esMacho=esMacho;
    }

    public boolean getEsMacho(){
        return esMacho;
    }

    public void setInicial(char inicial){
        this.inicial=inicial;
    }

    public char getInicial(){
        return inicial;
    }

    public void decirEdad(){
        System.out.println("Mi edad es: " + edad);
    }

    public void decirNombreEInicial(){
        System.out.println("Mi nombre es: " + nombre + " y mi inicial es: "+inicial);
    }

    public void mostrarPeso(){
        System.out.println("Mi peso es: " + peso);
    }

    public void mostrarGenero(){
        if (esMacho){
            System.out.println("Soy macho");
        }else{
            System.out.println("Soy hembra");
        }
    }
}
