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
public class Pasajero {
    
    public Pasajero(){
        
        id = idSiguiente;
        idSiguiente++;
        maleta = ThreadLocalRandom.current().nextInt(1, 4);
        documento = ThreadLocalRandom.current().nextInt(1, 10);
        turno = ThreadLocalRandom.current().nextInt(1, 3);
                        
    }
    
    public void establecerMaletas(Integer maleta){
        
        this.maleta = maleta;
        
    }
    
    public Integer obtenerMaletas(){
        
        return maleta;
        
    }
    
    public void establecerDocumentos(Integer documento){
        
        this.documento = documento;
        
    }
    
    public Integer obtenerDocumentos(){
        
        return documento;
        
    }
    
    public void establecerTurnoDeRegistro(Integer turno){
        
        this.turno = turno;
        
    }
    
    public Integer obtenerTurnoDeRegistro(){
        
        return turno;
        
    }
    
    public int obtenerNoId(){
        
        return id;
        
    }
    
    private int id;
    private Integer maleta;
    private Integer documento;
    private Integer turno;
    private static int idSiguiente;
    
}
