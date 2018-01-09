/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2v2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mynor Escobar
 */
public class Avion {
    
    public Avion(){
        
        id = idSiguiente;
        idSiguiente++;
        tipo = ThreadLocalRandom.current().nextInt(1, 3);
        if(tipo == 1){
            
            pasajero = ThreadLocalRandom.current().nextInt(5, 10);
            turnoDesbordaje = 1;
            turnoMantenimiento = ThreadLocalRandom.current().nextInt(1, 3);
            
        } else if (tipo == 2){
            
            pasajero = ThreadLocalRandom.current().nextInt(15, 25);
            turnoDesbordaje = 2;
            turnoMantenimiento = ThreadLocalRandom.current().nextInt(2, 4);
            
        } else {
            
            pasajero = ThreadLocalRandom.current().nextInt(30, 40);
            turnoDesbordaje = 3;
            turnoMantenimiento = ThreadLocalRandom.current().nextInt(3, 6);
            
        }
        
    }
    
    public int obtenerId(){
        
        return id;
        
    }
    
    public void establecerTipo(Integer tipo){
        
        this.tipo = tipo;
        
    }
    
    public Integer obtenerTipo(){
        
        return tipo;
        
    }
    
    public void establecerPasajeros(Integer pasajeros){
        
        this.pasajero = pasajeros;
        
    }
    
    public Integer obtenerPasajeros(){
        
        return pasajero;
        
    }
    
    public void establecerTurnoDesbordar(Integer turnoDesbordaje){
        
        this.turnoDesbordaje = turnoDesbordaje;
        
    }
    
    public Integer obtenerTurnoDesbordar(){
        
        return turnoDesbordaje;
        
    }
    
    public void establecerTurnoMantenimiento(Integer turnoMantenimiento){
        
        this.turnoMantenimiento = turnoMantenimiento;
        
    }
    
    public Integer obtenerTurnoMantenimiento(){
        
        return turnoMantenimiento;
        
    }
    
    private int id;
    private Integer tipo, pasajero, turnoDesbordaje, turnoMantenimiento;
    private static int idSiguiente = 1;
    
}
