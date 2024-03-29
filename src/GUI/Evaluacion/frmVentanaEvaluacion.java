package GUI.Evaluacion;
import GUI.Documentos.*;
import GUI.Mensajes.*;
import javax.swing.*;
import java.io.File;
import Winnowing.*;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.io.File;
import java.util.ArrayList;
import BusinessEntity.Evaluacion.*;
import BusinessLogic.Evaluacion.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmVentanaEvaluacion.java
 *
 * Created on 05/05/2010, 08:19:53 PM
 */

/**
 *
 * @author Jose Miguel
 */
public class frmVentanaEvaluacion extends javax.swing.JFrame {

    private File archivo;
    
    private ArrayList<File> listaArchivosEvaluar = new ArrayList<File>();
    private ArrayList<File> listaArchivosFuentes = new ArrayList<File>();
    private EvaluacionBE evaluacionBE;
    private EvaluacionBL evaluacionBL;


    public void agregarDocumentoEvaluar(File archivo) {
        listaEva.addElement(archivo.getName());
        this.listaArchivosEvaluar.add(archivo);
    }

    private DefaultListModel listaEva;
    private DefaultListModel listaFuentes;

    /** Creates new form frmVentanaEvaluacion */
    public frmVentanaEvaluacion() {
        listaEva = new DefaultListModel();
        listaFuentes = new DefaultListModel();
        initComponents();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        rdbCompleta = new javax.swing.JRadioButton();
        rdbOriginales = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEvaluar = new javax.swing.JList();
        btnExaminar = new javax.swing.JButton();
        btnQuitarE = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstFuentes = new javax.swing.JList();
        btnSeleccionar = new javax.swing.JButton();
        btnQuitarO = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Evaluación de Documento");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Comparación"));

        buttonGroup1.add(rdbCompleta);
        rdbCompleta.setText("Base de Datos");
        rdbCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCompletaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbOriginales);
        rdbOriginales.setText("Selección de fuentes");
        rdbOriginales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOriginalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(rdbCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbOriginales)
                .addGap(121, 121, 121))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdbCompleta)
                .addComponent(rdbOriginales))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione los documentos que desea evaluar"));

        lstEvaluar.setModel(listaEva);
        jScrollPane1.setViewportView(lstEvaluar);

        btnExaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Files-icon.png"))); // NOI18N
        btnExaminar.setLabel("Examinar");
        btnExaminar.setPreferredSize(new java.awt.Dimension(125, 41));
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        btnQuitarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/erase_icon.gif"))); // NOI18N
        btnQuitarE.setText("Quitar");
        btnQuitarE.setPreferredSize(new java.awt.Dimension(125, 41));
        btnQuitarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnQuitarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione los documentos fuente para la comparación"));

        lstFuentes.setModel(listaFuentes);
        jScrollPane2.setViewportView(lstFuentes);

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Attach-icon.png"))); // NOI18N
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.setLabel("Seleccionar");
        btnSeleccionar.setPreferredSize(new java.awt.Dimension(125, 41));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnQuitarO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/erase_icon.gif"))); // NOI18N
        btnQuitarO.setText("Quitar");
        btnQuitarO.setEnabled(false);
        btnQuitarO.setPreferredSize(new java.awt.Dimension(125, 41));
        btnQuitarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitarO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Play-Hot-icon.png"))); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.setEnabled(false);
        btnIniciar.setPreferredSize(new java.awt.Dimension(125, 41));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(125, 41));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        // TODO add your handling code here:
        //

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter ("TXT","txt");
        fileChooser.setFileFilter(filter);
        int seleccion=fileChooser.showOpenDialog(this);
        if (seleccion==JFileChooser.CANCEL_OPTION) return;
        if (seleccion==JFileChooser.APPROVE_OPTION)
        {            
            archivo = fileChooser.getSelectedFile();
            this.agregarDocumentoEvaluar(archivo);
        }                
    }//GEN-LAST:event_btnExaminarActionPerformed

    private frmVentanaDocumento ventanaDocumento;

    private void abrirVentanaDocumento(){
        /*
        if (ventanaDocumento == null) {
            ventanaDocumento = new frmVentanaDocumento(this);
        } else {
            ventanaDocumento.requestFocus();
            ventanaDocumento.getBtnAgregar().setVisible(true);
        }*/
        ventanaDocumento = new frmVentanaDocumento(this, "Seleccion de los archivos fuente");

    }

    private void rdbCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCompletaActionPerformed
        // TODO add your handling code here:
       javax.swing.AbstractButton boton = (javax.swing.AbstractButton)evt.getSource();
       if (boton.isSelected()) {
           btnSeleccionar.setEnabled(false);
           btnQuitarO.setEnabled(false);
           btnIniciar.setEnabled(true);
       }
    }//GEN-LAST:event_rdbCompletaActionPerformed

    private void rdbOriginalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOriginalesActionPerformed
        // TODO add your handling code here:
        javax.swing.AbstractButton boton = (javax.swing.AbstractButton)evt.getSource();
        if (boton.isSelected()) {
           btnSeleccionar.setEnabled(true);
           this.btnQuitarO.setEnabled(true);
           btnIniciar.setEnabled(true);
        }
    }//GEN-LAST:event_rdbOriginalesActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        if (listaEva.isEmpty()){
            new dlgAvisoError(this,true,"Debe ingresar al menos un archivo para evaluar").setVisible(true);
            return; //Si la lista esta vacia, regresamos sino se cae :D.
        }

        int tipoEvaluacion = 0;
        if (this.rdbCompleta.isSelected()) {
            tipoEvaluacion = 0;
        }else if (this.rdbOriginales.isSelected()){
            tipoEvaluacion = 1;
            if (listaFuentes.isEmpty()){
                new dlgAvisoError(this,true,"Debe seleccionar al menos un archivo fuente u original").setVisible(true);
                return; //Si la lista esta vacia, regresamos sino se cae xD.
            }
        }
        
        evaluacionBE = new EvaluacionBE(tipoEvaluacion, this.listaArchivosEvaluar, this.listaArchivosFuentes);
        evaluacionBL = new EvaluacionBL(evaluacionBE);
        
        evaluacionBL.ejecutarWinnowing();
        //evaluacionBL.probarReporte(); //Este metodo es solo para prueba!!!!!!!!! no usar!!!
        new dlgResultados(this, true, evaluacionBL.getListaResultado()).setVisible(true);

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        abrirVentanaDocumento();
        ventanaDocumento.setVisible(true);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnQuitarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarEActionPerformed
        // TODO add your handling code here:
        if (this.lstEvaluar.getSelectedIndex()!=-1){
            int indice = lstEvaluar.getSelectedIndex();
            listaEva.remove(indice);
            this.listaArchivosEvaluar.remove(indice);
        }else{
            //dlgAvisoError dlgNoSeleccionoElemento = new dlgAvisoError(this,true,"Debe seleccionar el elemento de la lista que desea quitar");
        }
    }//GEN-LAST:event_btnQuitarEActionPerformed

    private void btnQuitarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarOActionPerformed
        // TODO add your handling code here:
        if (this.lstFuentes.getSelectedIndex()!=-1){
            int indice = lstFuentes.getSelectedIndex();
            listaFuentes.remove(indice);
            this.listaArchivosFuentes.remove(indice);
        }else{
            //dlgAvisoError dlgNoSeleccionoElemento = new dlgAvisoError(this,true,"Debe seleccionar el elemento de la lista que desea quitar");
        }
    }//GEN-LAST:event_btnQuitarOActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentanaEvaluacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnQuitarE;
    private javax.swing.JButton btnQuitarO;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstEvaluar;
    private javax.swing.JList lstFuentes;
    private javax.swing.JRadioButton rdbCompleta;
    private javax.swing.JRadioButton rdbOriginales;
    // End of variables declaration//GEN-END:variables

}
