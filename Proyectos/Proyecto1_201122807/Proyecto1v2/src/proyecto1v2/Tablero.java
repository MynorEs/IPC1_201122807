/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1v2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Mynor Escobar
 */
public class Tablero {
    
    public Tablero(int tam, JPanel cuadricula){//CONSTRUCTOR
        
        tamano = tam;
        this.cuadricula = cuadricula;
        llenar(tam);
        
    }
    
    public void llenar(int tam){
        
        tamanobloquex = 492/tam;
        tamanobloquey = 491/tam;
        matriz = new int[tam][tam];
        matrizlabel = new JLabel[tam][tam];
        for(int i=0;i<tam;i++){ //FOR PARA RELLENARLA DE 0 A LA MATRIZ DE ENTEROS
            
            for(int j=0;j<tam;j++){
                
                matriz[i][j] = 0;
                
            }
            
        }
        
        //COLOCANDO LAS MINAS
        int contadorbomba = 0;
        int diezporciento = (int)(tam*tam*0.10);
        while(contadorbomba<diezporciento){
            
            int posrandomx = (int)(Math.random()*100);
            int posrandomy = (int)(Math.random()*100);
            if(posrandomx>-1 && posrandomx<tam && posrandomy>-1 && posrandomy<tam &&
                    matriz[posrandomx][posrandomy]!=3){
                
                matriz[posrandomx][posrandomy] = 3;
                contadorbomba = contadorbomba + 1;
                
            }
            
        }
        
        //COLOCANDO LAS VIDAS
        int contadorvida = 0;
        while(contadorvida<(int)(((tam*tam)*0.05))){
            
            int posrandomx = (int)(Math.random()*100);
            int posrandomy = (int)(Math.random()*100);
            if(posrandomx>-1 && posrandomx<tam && posrandomy>-1 && posrandomy<tam &&
                    matriz[posrandomx][posrandomy]!=3 && matriz[posrandomx][posrandomy]!=4){
                
                matriz[posrandomx][posrandomy] = 4;
                contadorvida = contadorvida + 1;
                
            }
            
        }
        
        //COLOCANDO JUGADOR 1 PERSONAJE
        int personaje1 = 0;
        while(personaje1!=1){
            
            posrandomxjug1 = (int)(Math.random()*100);
            posrandomyjug1 = (int)(Math.random()*100);
            if(posrandomxjug1>-1 && posrandomxjug1<tamano && posrandomyjug1>-1 && posrandomyjug1<tamano 
                    && matriz[posrandomxjug1][posrandomyjug1]!=3 && matriz[posrandomxjug1][posrandomyjug1]!=4){
                        
                matriz[posrandomxjug1][posrandomyjug1] = 1;
                personaje1 = 1;
            
            }
            
        }
        
        //COLOGANDO JUGADOR 2 PERSONAJE
        int personaje2 = 0;
        while(personaje2!=2){
            
            posrandomxjug2 = (int)(Math.random()*100);
            posrandomyjug2 = (int)(Math.random()*100);
            if(posrandomxjug2>-1 && posrandomxjug2<tamano && posrandomyjug2>-1 && posrandomyjug2<tamano &&
                    matriz[posrandomxjug2][posrandomyjug2]!=3 && matriz[posrandomxjug2][posrandomyjug2]!=4 &&
                    matriz[posrandomxjug2][posrandomyjug2]!=1){
                
                matriz[posrandomxjug2][posrandomyjug2] = 2;
                personaje2 = 2;
                
            }
            
        }
        
        //ICONO PARA JUGADOR 2
        ImageIcon magotemp = new ImageIcon(getClass().getResource("/Imagenes/mago2.jpg"));
        Image mg = magotemp.getImage();
        Image mg1 = mg.getScaledInstance(tamanobloquex, tamanobloquey, Image.SCALE_SMOOTH);
        mago = new ImageIcon(mg1);
        
        //ICONO PARA JUGADOR 1
        ImageIcon princesatemp = new ImageIcon(getClass().getResource("/Imagenes/princesa1.jpg"));
        Image pr = princesatemp.getImage();
        Image pr1 = pr.getScaledInstance(tamanobloquex, tamanobloquey, Image.SCALE_SMOOTH);
        princesa = new ImageIcon(pr1);
        
        //ICONO PARA MINA
        ImageIcon minatemp = new ImageIcon(getClass().getResource("/Imagenes/mina.jpg"));
        Image m = minatemp.getImage();
        Image m1 = m.getScaledInstance(tamanobloquex, tamanobloquey, Image.SCALE_SMOOTH);
        mina = new ImageIcon(m1);
        
        //ICONO PARA VIDA
        ImageIcon vidatemp = new ImageIcon(getClass().getResource("/Imagenes/vida.jpg"));
        Image v = vidatemp.getImage();
        Image v1 = v.getScaledInstance(tamanobloquex, tamanobloquey, Image.SCALE_SMOOTH);
        vida = new ImageIcon(v1);
        
        repintar();
        
    }
    
    public void repintar(){
        
        for(int i=0;i<tamano;i++){
            
            for(int j=0;j<tamano;j++){
                
                if(matriz[i][j]==0){//CELDA VACIA
                    
                    JLabel tablero;
                    tablero = new JLabel();
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tamanobloquex, j*tamanobloquey, tamanobloquex, tamanobloquey);
                    matrizlabel[i][j] = tablero;
                    cuadricula.add(matrizlabel[i][j], BorderLayout.CENTER);
                    cuadricula.repaint();
                    
                } else if(matriz[i][j]==3){//CELDA CON MINA
                    
                    JLabel tablero;
                    tablero = new JLabel(mina);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tamanobloquex, j*tamanobloquey, tamanobloquex, tamanobloquey);
                    matrizlabel[i][j] = tablero;
                    cuadricula.add(matrizlabel[i][j], BorderLayout.CENTER);
                    cuadricula.repaint();
                    
                } else if(matriz[i][j]==4){//CELDA CON VIDA
                    
                    JLabel tablero;
                    tablero = new JLabel(vida);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tamanobloquex, j*tamanobloquey, tamanobloquex, tamanobloquey);
                    matrizlabel[i][j] = tablero;
                    cuadricula.add(matrizlabel[i][j], BorderLayout.CENTER);
                    cuadricula.repaint();
                    
                } else if(matriz[i][j]==1){//CELDA CON MAGO
                    
                    JLabel tablero;
                    tablero = new JLabel(princesa);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tamanobloquex, j*tamanobloquey, tamanobloquex, tamanobloquey);
                    matrizlabel[i][j] = tablero;
                    cuadricula.add(matrizlabel[i][j], BorderLayout.CENTER);
                    cuadricula.repaint();
                    
                } else if(matriz[i][j]==2){//CELDA CON MAGO
                    
                    JLabel tablero;
                    tablero = new JLabel(mago);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i*tamanobloquex, j*tamanobloquey, tamanobloquex, tamanobloquey);
                    matrizlabel[i][j] = tablero;
                    cuadricula.add(matrizlabel[i][j], BorderLayout.CENTER);
                    cuadricula.repaint();
                    
                }
                
            }
            
        }
        
    }
    
    public int tamano;//USADA
    public JPanel cuadricula;//USADO
    public int posjugador;//PENDIENTE
    public int [][] matriz;//PENDIENTE
    public JLabel [][] matrizlabel;//USADO
    public ImageIcon personaje;//PENDIENTE
    public int tamanobloquex;//ANALIZADO USADO
    public int tamanobloquey;//ANALIZADO USADO
    public ImageIcon vida;
    public ImageIcon mina;
    public ImageIcon mago;
    public ImageIcon princesa;
    public int posrandomxjug1;
    public int posrandomyjug1;
    public int posrandomxjug2;
    public int posrandomyjug2;
    
}
