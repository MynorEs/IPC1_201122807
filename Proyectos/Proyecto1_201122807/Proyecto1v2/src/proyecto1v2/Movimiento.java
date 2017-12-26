/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1v2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mynor Escobar
 */
public class Movimiento extends Thread {
    
    public Movimiento(int cantidad, Tablero tablero, String direccion){
        
        this.cantidad = cantidad;
        this.tablero = tablero;
        this.direccion = direccion;
        
    }
    
    public void mover(int cantidad){
        
        
        if(direccion.equalsIgnoreCase("derecha")){//CODIGO HACIA DERECHA
            
            try {
            if(cantidad<=0){
                return;
            }
            if(comprobarDerecha()){
                //regresar el jugador a la posicion 0
                cantidad=0;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;//tab.vec[tab.tam-1]=0;
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null); //tab.veclabel[tab.tam-1].setIcon(null);
                tablero.posrandomxjug1 = (int)tablero.tamano/2;//tab.posjugx=0;
                tablero.posrandomyjug1 = (int)tablero.tamano/2;
                tablero.matriz[(int)(tablero.tamano/2)][(int)(tablero.tamano/2)] = 1; //tab.vec[0]=1;
                tablero.repintar();//tab.repintar();
                return;
            }  
                       
            //IF PARA COMPROBAR SI HAY JUGADOR A LA DERECHA
            if(tablero.matriz[(tablero.posrandomxjug1+1)][tablero.posrandomyjug1]==2){
                
                boolean derecha = true;
                while(derecha){
                    
                    int nuevadireccion = (int)(Math.random()*10);
                    if(nuevadireccion>=1 && nuevadireccion<=3){
                        
                        switch(nuevadireccion){
                            
                            case 1:
                                
                                direccion = "arriba";
                                derecha = false;
                                break;
                                
                            case 2:
                                
                                direccion = "abajo";
                                derecha = false;
                                break;
                                
                            case 3:
                                
                                direccion = "izquierda";
                                derecha = false;
                                break;
                            
                        }
                        
                    }
                    
                }
                
                return;
                
            } else {
                
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null); 
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.repintar();
                
                tablero.posrandomxjug1 = tablero.posrandomxjug1 + 1;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
            
                mover(cantidad);
                
            }
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(direccion.equalsIgnoreCase("izquierda")){//CODIGO HACIA IZQUIERDA
            
            try {
            if(cantidad<=0){
                return;
            }
            if(comprobarIzquierda()){
                //regresar el jugador a la posicion 0
                cantidad=0;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null);
                tablero.posrandomxjug1 = (int)tablero.tamano/2;//
                tablero.posrandomyjug1 = (int)tablero.tamano/2;
                tablero.matriz[(int)(tablero.tamano/2)][(int)(tablero.tamano/2)] = 1;
                tablero.repintar();
                return;
            }
            //mover una posicion
            
            //IF PARA COMPROBAR SI HAY JUGADOR A LA IZQUIERDA
            if(tablero.matriz[(tablero.posrandomxjug1-1)][tablero.posrandomyjug1]==2){
                
                boolean izquierda = true;
                while(izquierda){
                    
                    int nuevadireccion = (int)(Math.random()*10);
                    if(nuevadireccion>=1 && nuevadireccion<=3){
                        
                        switch(nuevadireccion){
                            
                            case 1:
                                
                                direccion = "arriba";
                                izquierda = false;
                                break;
                                
                            case 2:
                                
                                direccion = "abajo";
                                izquierda = false;
                                break;
                                
                            case 3:
                                
                                direccion = "derecha";
                                izquierda = false;
                                break;
                            
                        }
                        
                    }
                    
                }
                
                return;
                
            } else {
                
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null); 
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.repintar();
                tablero.posrandomxjug1 = tablero.posrandomxjug1 - 1;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
            
                mover(cantidad);
                
            }
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(direccion.equalsIgnoreCase("arriba")){//CODIGO HACIA ARRIBA
            
            try {
            if(cantidad<=0){
                return;
            }
            if(comprobarArriba()){
                //regresar el jugador a la posicion 0
                cantidad=0;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null);
                tablero.posrandomxjug1 = (int)tablero.tamano/2;
                tablero.posrandomyjug1 = (int)tablero.tamano/2;
                tablero.matriz[(int)(tablero.tamano/2)][(int)(tablero.tamano/2)] = 1;
                tablero.repintar();
                return;
            }
            //mover una posicion
            //IF COMPROBAR SI HAY JUGADOR ARRIBA
            if(tablero.matriz[tablero.posrandomxjug1][(tablero.posrandomyjug1-1)]==2){
                
                boolean arriba = true;
                while(arriba){
                    
                    int nuevadireccion = (int)(Math.random()*10);
                    if(nuevadireccion>=1 && nuevadireccion<=3){
                        
                        switch(nuevadireccion){
                            
                            case 1:
                                
                                direccion = "derecha";
                                arriba = false;
                                break;
                                
                            case 2:
                                
                                direccion = "izquierda";
                                arriba = false;
                                break;
                                
                            case 3:
                                
                                direccion = "abajo";
                                arriba = false;
                                break;
                            
                        }
                        
                    }
                    
                }
                
                return;
                
            } else {
                
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null); 
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.repintar();
                tablero.posrandomyjug1 = tablero.posrandomyjug1 - 1;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
            
                mover(cantidad);
                
            }
            
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(direccion.equalsIgnoreCase("abajo")){//CODIGO HACIA ABAJO
            
            try {
            if(cantidad<=0){
                return;
            }
            if(comprobarAbajo()){
                //regresar el jugador a la posicion 0
                cantidad=0;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null);
                tablero.posrandomxjug1 = (int)tablero.tamano/2;
                tablero.posrandomyjug1 = (int)tablero.tamano/2;
                tablero.matriz[(int)(tablero.tamano/2)][(int)(tablero.tamano/2)] = 1;
                tablero.repintar();
                return;
            }
            //mover una posicion
            //IF COMPROBAR SI HAY JUGADOR ABAJO
            if(tablero.matriz[tablero.posrandomxjug1][(tablero.posrandomyjug1+1)]==2){
                
                boolean abajo = true;
                while(abajo){
                    
                    int nuevadireccion = (int)(Math.random()*10);
                    if(nuevadireccion>=1 && nuevadireccion<=3){
                        
                        switch(nuevadireccion){
                            
                            case 1:
                                
                                direccion = "derecha";
                                abajo = false;
                                break;
                                
                            case 2:
                                
                                direccion = "izquierda";
                                abajo = false;
                                break;
                                
                            case 3:
                                
                                direccion = "arriba";
                                abajo = false;
                                break;
                            
                        }
                        
                    }
                    
                }
                return;
                
            } else {
                
                tablero.matrizlabel[tablero.posrandomxjug1][tablero.posrandomyjug1].setIcon(null);
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 0;
                tablero.repintar();
                tablero.posrandomyjug1 = tablero.posrandomyjug1 + 1;
                tablero.matriz[tablero.posrandomxjug1][tablero.posrandomyjug1] = 1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
            
                mover(cantidad);
                
            }
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public boolean comprobarDerecha(){//COMPRUEBA HACIA LA DERECHA DEL TABLERO
        
        if(tablero.posrandomxjug1>=tablero.tamano-1){
            
            return true;
            
        }
        
        return false;
        
    }
    
    public boolean comprobarIzquierda(){//COMPRUEBA HACIA LA IZQUIERDA DEL TABLERO
        
        if(tablero.posrandomxjug1<=0){
            
            return true;
            
        }
        
        return false;
        
    }
    
    public boolean comprobarArriba(){//COMPRUEBA HACIA ARRIBA DEL TABLERO
        
        if(tablero.posrandomyjug1<=0){
            
            return true;
            
        }
        
        return false;
        
    }
    
    public boolean comprobarAbajo(){//COMPRUEBA HACIA ARRIBA DEL TABLERO
        
        if(tablero.posrandomyjug1>=tablero.tamano-1){
            
            return true;
            
        }
        
        return false;
        
    }
    
    public void run(){
        mover(cantidad);
    }
    
    private int cantidad = 0;
    private Tablero tablero;
    private String direccion;
    
}
