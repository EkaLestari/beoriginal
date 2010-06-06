/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCargaDocumento.java
 *
 * Created on 26/05/2010, 03:05:27 PM
 */

package GUI.Documentos;

/**
 *
 * @author pedro
 */

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import GUI.Evaluacion.*;
import java.io.File;
import GUI.Mensajes.*;
import java.awt.Color;
import javax.swing.JTextField;

public class frmCargaDocumento extends javax.swing.JFrame {

    /** Creates new form frmCargaDocumento */

    private File fichero;
    //private frmVentanaEvaluacion ventanaEvaluacion;

    public frmCargaDocumento() {
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

        jPanel1 = new javax.swing.JPanel();
        btnCargarArchivos = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        btnCargarCarpetas = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaBarraEstado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Documentos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Carga Documentos"));
        jPanel1.setName("PanelCargaDocumentos"); // NOI18N

        btnCargarArchivos.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        btnCargarArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Attach-icon.png"))); // NOI18N
        btnCargarArchivos.setText("Carga Archivos");
        btnCargarArchivos.setName("btnCargaArchivos"); // NOI18N
        btnCargarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivosActionPerformed(evt);
            }
        });

        txtRuta.setEditable(false);

        btnCargarCarpetas.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        btnCargarCarpetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Files-icon.png"))); // NOI18N
        btnCargarCarpetas.setText("Carga Carpetas");
        btnCargarCarpetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCarpetasActionPerformed(evt);
            }
        });

        lblTitulo.setText("Título:");

        btnAceptar.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(35, 35, 35)
                        .addComponent(txtTitulo))
                    .addComponent(txtRuta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCargarArchivos)
                        .addGap(35, 35, 35)
                        .addComponent(btnCargarCarpetas)
                        .addGap(33, 33, 33)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCargarCarpetas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txaBarraEstado.setBackground(new java.awt.Color(204, 204, 204));
        txaBarraEstado.setColumns(20);
        txaBarraEstado.setRows(5);
        jScrollPane1.setViewportView(txaBarraEstado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // private frmVentanaDocumento ventanaDocumento;

    //private void abrirVentanaDocumento(){
        /*
        if (ventanaDocumento == null) {
            ventanaDocumento = new frmVentanaDocumento(this);
        } else {
            ventanaDocumento.requestFocus();
            ventanaDocumento.getBtnAgregar().setVisible(true);
        }*/
    //    ventanaDocumento = new frmVentanaDocumento(this, "Seleccion de los archivos fuente");

    //}

    private void btnCargarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivosActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT","txt");
        fileChooser.setFileFilter(filter);
        int seleccion=fileChooser.showOpenDialog(txtRuta);
        if (seleccion==JFileChooser.CANCEL_OPTION) return;
        if (seleccion==JFileChooser.APPROVE_OPTION) {
            fichero = fileChooser.getSelectedFile();
            txtRuta.setText(fichero.getPath());
        }
}//GEN-LAST:event_btnCargarArchivosActionPerformed

    private void btnCargarCarpetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCarpetasActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT","txt");
        //fileChooser.setFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
        int seleccion=fileChooser.showOpenDialog(txtRuta);
        if (seleccion==JFileChooser.CANCEL_OPTION) return;
        if (seleccion==JFileChooser.APPROVE_OPTION) {
            fichero = fileChooser.getSelectedFile();
            txtRuta.setText(fichero.getPath());
        }
    }//GEN-LAST:event_btnCargarCarpetasActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //abrirVentanaDocumento();
        //ventanaDocumento.setVisible(true);
        /*if ((this.txtRuta.getSelectedText().isEmpty()) && (this.txtTitulo.getSelectedText().isEmpty())) {
            JOptionPane.showMessageDialog(null,"Debe escoger el archivo y ponerle título","Mensaje",JOptionPane.ERROR_MESSAGE);
            //new dlgCArgaArchivoError().setVisible(true);
        } */
        if (validarDatos()){
            new frmVentanaDocumento(this.txtRuta.getText(), this.txtTitulo.getText()).setVisible(true);
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private boolean validarDatos( ){
        this.txtTitulo.setBackground(new JTextField().getBackground());
        this.txtRuta.setBackground(new JTextField().getBackground());
        if (this.txtRuta.getText().equals("")){
            this.txtRuta.setBackground(Color.YELLOW);
            this.txaBarraEstado.setForeground(Color.RED);
           this.txaBarraEstado.setText("Debe escoger la ubicación del archivo o carpeta a subir");
            return false;
        }
        if (this.txtTitulo.getText().equals("")){
            this.txtTitulo.setBackground(Color.YELLOW);
            this.txaBarraEstado.setForeground(Color.RED);
           this.txaBarraEstado.setText("Debe llenar los campos obligatorios");
            return false;
        }
        return true;
    }


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        dispose();
}//GEN-LAST:event_btnCancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCargaDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarArchivos;
    private javax.swing.JButton btnCargarCarpetas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaBarraEstado;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}