package com.company;

public class Gato extends Animal{
    private String razaDeGato;
    private String dueño;
    private String color;

    public Gato(){
        super();
    }

    public Gato(int edad, String nombre, double peso, boolean esMacho, char inicial, String razaDeGato, String dueño, String color){
        super(edad,nombre,peso,esMacho,inicial);
        this.razaDeGato=razaDeGato;
        this.dueño=dueño;
        this.color=color;
    }

    public void setRazaDeGato(String razaDeGato) {
        this.razaDeGato = razaDeGato;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRazaDeGato() {
        return razaDeGato;
    }

    public String getDueño() {
        return dueño;
    }

    public String getColor() {
        return color;
    }

    public void decirRaza(){
        System.out.println("Mi raza es: "+razaDeGato);
    }

    public void decirDueño(){
        System.out.println("Mi nombre dueño es: "+dueño);
    }

    public void decirColor(){
        System.out.println("Mi color es: " + color);
    }
}
