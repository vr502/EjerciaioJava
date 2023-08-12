 /* Clase de parqueo para el ejemplo en clase*/

package com.mycompany.poo.Clases;

public class Parqueo {
    // atributos de la clase
     private int NumeroParqueo;
     private String DireccionParqueo;
     private int ParqueosDisponibles;
     
     // Contructor
     public Parqueo(int NumeroParqueo, String DireccionParqueo, int ParqueoDisponible){
         this.NumeroParqueo = NumeroParqueo;
         this.DireccionParqueo = DireccionParqueo;
         this.ParqueosDisponibles = ParqueoDisponible;
     }
     
     public Parqueo(){
         // Vacio
     }
     
     // comportamiento / Metodos

    public int getNumeroParqueo() {
        return NumeroParqueo;
    }

    public void setNumeroParqueo(int NumeroParqueo) {
        this.NumeroParqueo = NumeroParqueo;
    }

    public String getDireccionParqueo() {
        return DireccionParqueo;
    }

    public void setDireccionParqueo(String DireccionParqueo) {
        this.DireccionParqueo = DireccionParqueo;
    }

    public int getParqueosDisponibles() {
        return ParqueosDisponibles;
    }

    public void setParqueosDisponibles(int ParqueosDisponibles) {
        this.ParqueosDisponibles = ParqueosDisponibles;
    }
    
    // Metodos para manejar el parqueo de los carros
    public String sacarCarro(){
        
        if(this.ParqueosDisponibles == this.NumeroParqueo){
            return ("Parqueo Libre");
        }
        
        if(this.ParqueosDisponibles < this.NumeroParqueo){
            this.ParqueosDisponibles = this.ParqueosDisponibles +1;
            return ("Salio Carro");
        }
        return ("Mensaje");
    
    }    
        
    public String MeterCarro(){
        
        if(this.ParqueosDisponibles == 0){
            return ("Parqueo Lleno");
        }
                
        if(this.ParqueosDisponibles <= this.NumeroParqueo){
            this.ParqueosDisponibles = this.ParqueosDisponibles -1;
            return("Ingreso de Carro");
        } 
        
  
        return("Meter Parqueo");
    }
   
}
