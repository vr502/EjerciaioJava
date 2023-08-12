
package com.mycompany.poo.Clases;

public class Carro {
    
    // Atributos
    private String Marca;
    private String Modelo;
    private String Matricula;
    private String Color;
    
    // Constructor

    public Carro(String Marca, String Modelo, String Matricula, String Color) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Matricula = Matricula;
        this.Color = Color;
    }
    
    public Carro(){
        // Vacio
    }
    
    // Comportamiento

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
}
