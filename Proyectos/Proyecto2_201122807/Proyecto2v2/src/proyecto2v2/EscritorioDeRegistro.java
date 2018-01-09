/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2v2;
import listas.ListaSimple;

/**
 *
 * @author Mynor Escobar
 */
public class EscritorioDeRegistro {
    
    public EscritorioDeRegistro(){
        
        estableceOrdenEscritorio(idSiguiente);
        idSiguiente++;
        switch (ordenEscritorio){
            
            case 1:letra = "A";break;
            case 2:letra = "B";break;
            case 3:letra = "C";break;
            case 4:letra = "D";break;
            case 5:letra = "E";break;
            case 6:letra = "F";break;
            case 7:letra = "G";break;
            case 8:letra = "H";break;
            case 9:letra = "I";break;
            case 10:letra = "J";break;
            case 11:letra = "K";break;
            case 12:letra = "L";break;
            case 13:letra = "M";break;
            case 14:letra = "N";break;
            case 15:letra = "O";break;
            case 16:letra = "P";break;
            case 17:letra = "Q";break;
            case 18:letra = "R";break;
            case 19:letra = "S";break;
            case 20:letra = "T";break;
            case 21:letra = "U";break;
            case 22:letra = "V";break;
            case 23:letra = "W";break;
            case 24:letra = "X";break;
            case 25:letra = "Y";break;
            case 26:letra = "Z";break;
            
        }//FIN SWITCH
        
        estableceLetraEscritorio("Escritorio: " + letra);
        filaAEscritorio = new ListaSimple();
        
    }
    
    public void estableceOrdenEscritorio(int orden){
        
        ordenEscritorio = orden;
        
    }
    
    public int obtenerOrdenEscritorio(){
        
        return ordenEscritorio;
        
    }
    
    public void estableceLetraEscritorio(String letra){
        
        this.letra = letra;
        
    }
    
    public String obtenerLetraEscritorio(){
        
        return letra;
        
    }
    
    public void estableceFilaAEscritorio(ListaSimple fila){
        
        filaAEscritorio = fila;
        
    }
    
    public ListaSimple obtenerFilaAEscritorio(){
        
        return filaAEscritorio;
        
    }
    
    private int ordenEscritorio;
    private String letra;
    private ListaSimple filaAEscritorio;
    private static int idSiguiente = 1;
    
}
