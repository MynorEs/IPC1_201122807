/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2v2;
//import com.sun.istack.internal.logging.Logger;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import listas.*;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Mynor Escobar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.numeroDeAviones = ThreadLocalRandom.current().nextInt(1, 4);
        this.numeroEscritorios = ThreadLocalRandom.current().nextInt(1, 12);
        this.numeroEstacionesMantenimiento = ThreadLocalRandom.current().nextInt(1, 4);
        
        try{
            
            this.avionesAterrizados = new ListaDoble();
            for(int i=0;i<numeroDeAviones;i++){
                
                avionesAterrizados.establecerAlFinal(new Avion());
                
            }
            
            consola("Aviones aterrizados");
            
        } catch(ExceptionALista e){
            
            //EXCEPTION A LISTA
            
        }
        
        this.estacionesMantenimiento = new ListaSimple();
        try{
            
            for(int i=1;i<=this.numeroEstacionesMantenimiento;i++){
                
                estacionesMantenimiento.establecerAlFinal(new EstacionMantenimiento());
                
            }
            
            consola("Preparando estaciones de mantenimiento");
            
        } catch(ExceptionALista e){
            
            //EXCEPTION A LISTA
            
        }
        
        this.escritoriosDeRegistro = new ListaDoble();
        try{
            
            for(int i=0;i<this.numeroEscritorios;i++){
                
                escritoriosDeRegistro.establecerAlFinal(new EscritorioDeRegistro());
                
            }
            
            consola("Estableciendo escritorios de registro");
            
        }catch(ExceptionALista e){
            
            //ExceptionALista
            
        }
        
        this.pasajeros = new ListaSimple();
        this.maletasPasajero = new ListaCircularDoble();
        this.avionesMantenimiento = new ListaSimple();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btndesabordar = new javax.swing.JButton();
        btnescritoriosderegistro = new javax.swing.JButton();
        btnequipaje = new javax.swing.JButton();
        btnmantenimiento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtconsola = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnequipajegrafico = new javax.swing.JButton();
        btndesabordajegrafico = new javax.swing.JButton();
        btnmantenimientografico = new javax.swing.JButton();
        btndesabordajegrafico1 = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulacion de Aviones");
        setResizable(false);

        btndesabordar.setText("Desabordar");
        btndesabordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesabordarActionPerformed(evt);
            }
        });

        btnescritoriosderegistro.setText("Escritorios De Registro");
        btnescritoriosderegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescritoriosderegistroActionPerformed(evt);
            }
        });

        btnequipaje.setText("Equipaje");
        btnequipaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequipajeActionPerformed(evt);
            }
        });

        btnmantenimiento.setText("Mantenimiento");
        btnmantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmantenimientoActionPerformed(evt);
            }
        });

        txtconsola.setEditable(false);
        txtconsola.setColumns(20);
        txtconsola.setRows(5);
        jScrollPane1.setViewportView(txtconsola);

        jLabel1.setText("Seleccione el grafico a visualizar en los siguientes botones, por favor.");

        btnequipajegrafico.setText("Equipaje");
        btnequipajegrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequipajegraficoActionPerformed(evt);
            }
        });

        btndesabordajegrafico.setText("Desabordaje");
        btndesabordajegrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesabordajegraficoActionPerformed(evt);
            }
        });

        btnmantenimientografico.setText("Mantenimiento");
        btnmantenimientografico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmantenimientograficoActionPerformed(evt);
            }
        });

        btndesabordajegrafico1.setText("Escritorios");
        btndesabordajegrafico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesabordajegrafico1ActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndesabordajegrafico)
                        .addGap(18, 18, 18)
                        .addComponent(btndesabordajegrafico1)
                        .addGap(18, 18, 18)
                        .addComponent(btnmantenimientografico)
                        .addGap(18, 18, 18)
                        .addComponent(btnequipajegrafico))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btndesabordar)
                                .addGap(18, 18, 18)
                                .addComponent(btnescritoriosderegistro)
                                .addGap(18, 18, 18)
                                .addComponent(btnequipaje)
                                .addGap(18, 18, 18)
                                .addComponent(btnmantenimiento)))
                        .addGap(63, 63, 63)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndesabordar)
                    .addComponent(btnescritoriosderegistro)
                    .addComponent(btnequipaje)
                    .addComponent(btnmantenimiento))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnsalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndesabordajegrafico)
                    .addComponent(btnmantenimientografico)
                    .addComponent(btndesabordajegrafico1)
                    .addComponent(btnequipajegrafico))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndesabordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesabordarActionPerformed
        // TODO add your handling code here:
        
        if(avionesAterrizados.obtenerAlInicio() != null){
            
            consola("Desabordando pasajeros");
            Avion nuevoAvion = (Avion)avionesAterrizados.obtenerAlInicio().obtenerDato();
            for(int i=0;i<nuevoAvion.obtenerPasajeros();i++){
                
                try{
                    
                    pasajeros.establecerAlFinal(new Pasajero());
                    
                } catch(ExceptionALista e){
                    
                    //EXCEPTION A LISTA
                    
                }
                
            }
            
            consola("Cola de pasajeros a escritorio");
            Nodo nuevoPasajero = pasajeros.obtenerAlInicio();
            Pasajero nPasajero;
            int contador = 0;
            while(nuevoPasajero != null){
                
                nPasajero = (Pasajero)nuevoPasajero.obtenerDato();
                contador = contador + nPasajero.obtenerMaletas();
                nuevoPasajero = nuevoPasajero.obtenerSiguiente();
                
            }
            
            for(int i=1;i<=contador;i++){
                
                try{
                    
                    this.maletasPasajero.establecerAlFinal(new Maleta());
                    
                } catch(ExceptionALista e){
                    
                    //EXCEPTION A LISTA
                    
                }
                
            }
            
            consola("Cargando informacion sobre equipaje");
            nuevoAvion.establecerTurnoDesbordar(nuevoAvion.obtenerTurnoDesbordar()-1);
            if(nuevoAvion.obtenerTurnoDesbordar()<=0){
                
                try{
                    
                    avionesMantenimiento.establecerAlFinal(nuevoAvion);
                    
                } catch(ExceptionALista e){
                    
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
                    
                }
                
                consola("Avion enviado a mantenimiendo");
                
                try{
                    
                    avionesAterrizados.removerAlInicio();
                    
                } catch(ExceptionALista e){
                    
                    //EXCEPTION A LISTA
                    
                }
                
                consola("Avion confirmado vacio y listo para revisión");
                
            }
            
        } else {
            
            consola("Aviones aterrizados:----N/A----");
            
        }
        
    }//GEN-LAST:event_btndesabordarActionPerformed

    private void btnescritoriosderegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescritoriosderegistroActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if(pasajeros.obtenerAlInicio() != null){
            
            Nodo nuevoPasajero = pasajeros.obtenerAlInicio();
            Pasajero nPasajero;
            NodoDoble nuevoEscritorioRegistro = this.escritoriosDeRegistro.obtenerAlInicio();
            EscritorioDeRegistro nERegistro;
            int contador = 0;
            while(nuevoPasajero != null){
                
                nPasajero = (Pasajero)nuevoPasajero.obtenerDato();
                nERegistro = (EscritorioDeRegistro)nuevoEscritorioRegistro.obtenerDato();
                if(contador<10){
                    
                    try{
                        
                        nERegistro.obtenerFilaAEscritorio().establecerAlFinal(nPasajero);
                        nPasajero.establecerTurnoDeRegistro(nPasajero.obtenerTurnoDeRegistro()-1);
                        pasajeros.eliminar(nuevoPasajero);
                        
                    } catch(ExceptionALista e){
                        
                        //EXCEPTION A LISTA
                        
                    }
                    
                    contador++;
                    
                } else {
                    
                    nuevoEscritorioRegistro = nuevoEscritorioRegistro.obtenerSiguiente();
                    contador = 0;
                    
                }
                
                nuevoPasajero = nuevoPasajero.obtenerSiguiente();
                
            }
            
            consola("Pasajeros pasando a escritorios");
            
        } else {
            
            consola("No hay pasajero:----N/A----");
            
        }
            
        }catch(java.lang.NullPointerException e){
            
            consola("No hay pasajero:----N/A----");
            
        }
        
    }//GEN-LAST:event_btnescritoriosderegistroActionPerformed

    private void btnequipajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequipajeActionPerformed
        // TODO add your handling code here:
        
        NodoDoble nuevoNodo = this.escritoriosDeRegistro.obtenerAlInicio();
        ListaSimple nuevoEscritorio;
        if(nuevoNodo != null){
            
            EscritorioDeRegistro escritorio = (EscritorioDeRegistro)nuevoNodo.obtenerDato();
            nuevoEscritorio = (ListaSimple)escritorio.obtenerFilaAEscritorio();
            Nodo filaNuevoNodo = nuevoEscritorio.obtenerAlInicio();
            Pasajero nPasajero;
            if(filaNuevoNodo != null){
                
                nPasajero = (Pasajero)filaNuevoNodo.obtenerDato();
                if(nPasajero.obtenerTurnoDeRegistro()<=0){
                    
                    for(int i=0;i<nPasajero.obtenerMaletas();i++){
                        
                        try{
                            
                            this.maletasPasajero.removerAlFinal();
                            consola("Maleta eliminada de lista");
                            
                        }catch(ExceptionALista e){
                            
                            
                            
                        }
                        
                    }
                    
                }
                
                filaNuevoNodo = filaNuevoNodo.obtenerSiguiente();
                
            }
            
            nuevoNodo = nuevoNodo.obtenerSiguiente();
            
        }
        
    }//GEN-LAST:event_btnequipajeActionPerformed

    private void btnmantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmantenimientoActionPerformed

    private void btnequipajegraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequipajegraficoActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if(maletasPasajero.obtenerAlInicio()!=null){
                
                this.graficaListaMaleta();
                Grafica migrafica = new Grafica();
                migrafica.estableceImagen(FORMATODOT, "Maleta.jpg");
                migrafica.setLocationRelativeTo(null);
                migrafica.setVisible(true);
                migrafica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            } else {
                
                JOptionPane.showMessageDialog(null, "No hay maletas aun!");
                
            }
            
        }catch(IOException e){
            
            //TODOCODE
            
        }
        
    }//GEN-LAST:event_btnequipajegraficoActionPerformed

    private void btndesabordajegraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesabordajegraficoActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if(this.maletasPasajero.obtenerAlInicio()!=null){
                
                Grafica migrafica = new Grafica();
                this.graficadorListaDeDesabordaje();
                migrafica.estableceImagen(FORMATODOT, "Desabordaje.jpg");
                migrafica.setLocationRelativeTo(null);
                migrafica.setVisible(true);
                migrafica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            } else {
                
                consola("¡¡¡Esto esta vacio!!!");
                
            }
            
        }catch(IOException e){
            
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,e);
            
        }
        
    }//GEN-LAST:event_btndesabordajegraficoActionPerformed

    private void btnmantenimientograficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmantenimientograficoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmantenimientograficoActionPerformed

    private void btndesabordajegrafico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesabordajegrafico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndesabordajegrafico1ActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_btnsalirActionPerformed
    
    public void consola(String consola){
        
        this.txtconsola.setText(txtconsola.getText() + "\n" + consola + " ha sido completado!");
        
    }
    
    public void graficaListaMaleta()throws IOException{
        
        String nombre;
        File archivo;
        nombre = "Maleta";
        this.grafica_Maleta(this.maletasPasajero.obtenerAlInicio(), nombre);
        archivo = new File(nombre+".jpg");
        try{
            
            File imagen = new File(this.FORMATODOT+nombre+".jpg");
            Desktop.getDesktop().open(imagen);
            
        } catch(IOException e){
            
            e.printStackTrace();
            
        }
        
        
    }
    
    public void grafica_Maleta(NodoDoble primero, String nom)throws IOException{
        
        String archivoentrante, archivosaliente;
        archivoentrante = nom+".txt";
        archivosaliente = nom+".jpg";
        f = new File(archivoentrante);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        pr.println("digraph G {");
        pr.println("M[shape=box3d, fillcolor=red label=\"Maleta\"]");
        pr.println("node [shape=box, color=\"#008000\"];");
        pr.println("edge [color=\"#1E90F\"];");
        pr.print("{rank = same;");
        this.columnasParaMaletas(primero);
        pr.println("}");
        this.nodosParaMaletas(primero);
        this.unirMaletas(primero);
        pr.println("}");
        pr.close();
        bw.close();
        String [] cmd = {this.FORMATODOTA, this.PARAMETROT, archivoentrante, this.PARAMETROTO, archivosaliente};
        Runtime rt = Runtime.getRuntime();
        rt.exec(cmd);
        
    }
    
    public void columnasParaMaletas(NodoDoble primero){
        
        if(primero != null){
            
            NodoDoble nuevo = this.maletasPasajero.obtenerAlInicio();
            do{
                
                pr.print(nuevo.obtenerDato().hashCode()+"[groups=g"+nuevo.obtenerDato().hashCode()+"];");
                nuevo = nuevo.obtenerSiguiente();
                
            }while(nuevo!=maletasPasajero.obtenerAlInicio());
            
        }
        
    }
    
    public void nodosParaMaletas(NodoDoble primero){
        
        if(primero!=null){
            
            NodoDoble nuevo = maletasPasajero.obtenerAlInicio();
            Maleta nuevaMaleta;
            do{
                
                nuevaMaleta = (Maleta)nuevo.obtenerDato();
                pr.println(nuevo.obtenerDato().hashCode()+" [label=\"Nombre: "+nuevaMaleta.obtenetNombreMaleta()+"\"];");
                nuevo = nuevo.obtenerSiguiente();
                
            }while(nuevo!=maletasPasajero.obtenerAlInicio());
            
        }
        
    }
    
    public void unirMaletas(NodoDoble primero){
        
        if(primero!=null){
            
            NodoDoble nuevo = maletasPasajero.obtenerAlInicio();
            do{
                
                pr.println(nuevo.obtenerDato().hashCode()+" -> "+nuevo.obtenerSiguiente().obtenerDato().hashCode()+" ;");
                pr.println(nuevo.obtenerSiguiente().obtenerDato().hashCode()+" -> "+nuevo.obtenerDato().hashCode()+" ;");
                nuevo = nuevo.obtenerSiguiente();
                
            }while(nuevo!=maletasPasajero.obtenerAlInicio());
            
        }
        
    }
    
    public void graficadorListaDeDesabordaje()throws IOException{
        
        String nombre;
        File archivo;
        nombre = "Desabordaje";
        graficaDesabordaje(pasajeros.obtenerAlInicio(),pasajeros.obtenerAlFinal(), nombre);
        archivo = new File(nombre+".jpg");
        try{
            
            File imagen = new File(this.FORMATODOT+nombre+".jpg");
            Desktop.getDesktop().open(imagen);
            
        }catch(IOException e){
            
            e.printStackTrace();
            
        }
        
    }
    
    public void graficaDesabordaje(Nodo primero, Nodo ultimo, String nombre)throws IOException{
        
        String archivoentrante;
        String archivosaliente;
        archivoentrante = nombre+".txt";
        archivosaliente = nombre+".jpg";
        f = new File(archivoentrante);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);
        
        pr.println("digraph G {");
        pr.println("D[shape=box3d, fillcolor=red label=\"Desabordaje\"]");
        pr.println("node [shape=box, color=\"#008000\"];");
        pr.println("edge [color=\"#1E90F\"];");
        nodosDesabordaje(primero);
        this.unirDesabordaje(primero, ultimo);
        pr.println("}");
        pr.close();
        bw.close();
        String [] cmd = {this.FORMATODOTA,this.PARAMETROT,archivoentrante,this.PARAMETROTO, archivosaliente};
        Runtime rt = Runtime.getRuntime();
        rt.exec(cmd);
        
    }
    
    public void nodosDesabordaje(Nodo primero){
        
        if(primero!=null){
            
            Nodo nuevoNodo = primero;
            Pasajero nuevoPasajero;
            do{
                
                nuevoPasajero = (Pasajero)nuevoNodo.obtenerDato();
                pr.println(nuevoNodo.obtenerDato().hashCode()+" [label=\"Documentos: "+nuevoPasajero.obtenerDocumentos()+"\\n Maletas"+nuevoPasajero.obtenerMaletas()+"\"]");
                nuevoNodo = nuevoNodo.obtenerSiguiente();
                
            }while(nuevoNodo!=null);
            
        }
        
    }
    
    public void unirDesabordaje(Nodo primero, Nodo ultimo){
        
        if(primero!=null){
            
            Nodo nuevoNodo = primero;
            do{
                
                if(nuevoNodo!=ultimo){
                    
                    pr.println(nuevoNodo.obtenerDato().hashCode()+" -> "+nuevoNodo.obtenerSiguiente().obtenerDato().hashCode()+" ;");
                    
                }
                
                nuevoNodo = nuevoNodo.obtenerSiguiente();
                
            }while(nuevoNodo!=null);
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    private Integer numeroDeAviones, numeroEstacionesMantenimiento, numeroEscritorios;
    private ListaSimple estacionesMantenimiento, avionesMantenimiento, pasajeros;
    private ListaDoble avionesAterrizados, escritoriosDeRegistro;
    private ListaCircularDoble maletasPasajero;
    private Avion avion;
    
    public static String FORMATODOT = System.getProperty("user.dir").replace("\\", "/")+"/";
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private PrintWriter pr;
    private int turno = 1;
    private final String FORMATODOTA = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String PARAMETROT = "-Tjpg";
    private final String PARAMETROTO = "-o";
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndesabordajegrafico;
    private javax.swing.JButton btndesabordajegrafico1;
    private javax.swing.JButton btndesabordar;
    private javax.swing.JButton btnequipaje;
    private javax.swing.JButton btnequipajegrafico;
    private javax.swing.JButton btnescritoriosderegistro;
    private javax.swing.JButton btnmantenimiento;
    private javax.swing.JButton btnmantenimientografico;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtconsola;
    // End of variables declaration//GEN-END:variables
}
