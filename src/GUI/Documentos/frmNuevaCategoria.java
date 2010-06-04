/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmNuevaCategoria.java
 *
 * Created on 27/05/2010, 05:01:39 PM
 */

package GUI.Documentos;

import BusinessEntity.Documentos.*;
import BusinessLogic.Documentos.*;
import GUI.Mensajes.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class frmNuevaCategoria extends javax.swing.JFrame {

    private CategoriaBE objCategoriaBE;
    private SubcategoriaBE objSubcategoriaBE;
    private CategoriaBL objCategoriaBL = new CategoriaBL();
    private SubcategoriaBL objSubcategoriaBL = new SubcategoriaBL();
    private ArrayList<CategoriaBE> arrCategoria = new ArrayList<CategoriaBE>();
    private ArrayList<SubcategoriaBE> arrSubcategoria = new ArrayList<SubcategoriaBE>();

    /** Creates new form frmNuevaCategoria */
    public frmNuevaCategoria() {
        initComponents();
        
        try {
            arrCategoria = this.objCategoriaBL.listarCategoria(objCategoriaBE);
            arrSubcategoria = this.objSubcategoriaBL.listarSubcategoria(objSubcategoriaBE);
            cargarTablaCategoria();
            cargarTablaSubcategoria();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.getMessage(),"Excepcion ",JOptionPane.ERROR_MESSAGE);
        }
        /*if(arrCategoria!=null){
            if (!arrCategoria.isEmpty()){            
                        cargarTabla();
                JOptionPane.showMessageDialog(null,"Error en llenar la Tabla","Mensaje",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No se encontro ningun usuario","Mensaje",JOptionPane.ERROR_MESSAGE);
        }  */
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescripcionCategoria = new javax.swing.JTextField();
        rdbCategorias = new javax.swing.JRadioButton();
        rdbSubcategorias = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionSubcategoria = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubcategoria = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaBarraEstado = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar Categorías");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración"));

        jLabel1.setText("Ingrese Nueva Categoría:");

        txtDescripcionCategoria.setEnabled(false);
        txtDescripcionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionCategoriaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbCategorias);
        rdbCategorias.setText("Categorías");
        rdbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCategoriasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbSubcategorias);
        rdbSubcategorias.setText("Subcategorías");
        rdbSubcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSubcategoriasActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Nueva Subcategoría:");

        txtDescripcionSubcategoria.setEnabled(false);

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Categoría", "Categoría", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoria.setColumnSelectionAllowed(true);
        tblCategoria.setEnabled(false);
        tblCategoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblCategoria);
        tblCategoria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tblSubcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Subcategoría", "Subcategoría", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSubcategoria.setColumnSelectionAllowed(true);
        tblSubcategoria.setEnabled(false);
        tblSubcategoria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSubcategoria);
        tblSubcategoria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(txtDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(txtDescripcionSubcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(rdbCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(rdbSubcategorias)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSubcategorias)
                    .addComponent(rdbCategorias))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionSubcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txaBarraEstado.setBackground(new java.awt.Color(204, 204, 204));
        txaBarraEstado.setColumns(20);
        txaBarraEstado.setForeground(new java.awt.Color(246, 5, 5));
        txaBarraEstado.setRows(5);
        txaBarraEstado.setText("Escoja Categorías o Subcategorías");
        jScrollPane2.setViewportView(txaBarraEstado);

        btnGuardar.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        jButton1.setText("Modificar");

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        jButton2.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionCategoriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      if(this.txtDescripcionCategoria.isEnabled()){   
        if (validarDatosCat()){
            try{
                CategoriaBE objCategoria = new CategoriaBE();
                almacenarDatosCat(objCategoria);
                     if (this.objCategoriaBL.registrarCategoria(objCategoria)){
                         String texto="La categoria se registro satisfactoriamente";
                      dlgAvisoExito exito=new dlgAvisoExito(javax.swing.JOptionPane.getFrameForComponent(this),true,texto);
                      exito.setVisible(true);
                      this.dispose();
                }else{
                    String texto="Error al registrar la categoria";
                    dlgAvisoError error=new dlgAvisoError(javax.swing.JOptionPane.getFrameForComponent(this),true, texto);
                    error.setVisible(true);
                }
             }catch (Exception ex) {
                System.out.println("Ocurrio una Excepcion en frmNuevaCategoria "+ex.getMessage());
             }
         }
      }else if(this.txtDescripcionSubcategoria.isEnabled()){
        if (validarDatosSubCat()){
            try{
                SubcategoriaBE objSubcategoria = new SubcategoriaBE();
                almacenarDatosSubCat(objSubcategoria);
                     if (this.objSubcategoriaBL.registrarSubcategoria(objSubcategoria)){
                         String texto="La subcategoria se registro satisfactoriamente";
                      dlgAvisoExito exito=new dlgAvisoExito(javax.swing.JOptionPane.getFrameForComponent(this),true,texto);
                      exito.setVisible(true);
                      this.dispose();
                }else{
                    String texto="Error al registrar la subcategoria";
                    dlgAvisoError error=new dlgAvisoError(javax.swing.JOptionPane.getFrameForComponent(this),true, texto);
                    error.setVisible(true);
                }
             }catch (Exception ex) {
                System.out.println("Ocurrio una Excepcion en frmNuevaCategoria "+ex.getMessage());
             }
         }
      }else{
          this.txtDescripcionCategoria.setBackground(new JTextField().getBackground());
          this.txaBarraEstado.setForeground(Color.RED);
          this.txaBarraEstado.setText("Debe escoger categorías o subcategotías");
      }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean validarDatosCat( ){
        this.txtDescripcionCategoria.setBackground(new JTextField().getBackground());
        if (this.txtDescripcionCategoria.getText().equals("")){
            this.txtDescripcionCategoria.setBackground(Color.YELLOW);
            this.txaBarraEstado.setForeground(Color.RED);
           this.txaBarraEstado.setText("Debe llenar los campos obligatorios");
            return false;
        }
        return true;
    }

    private void almacenarDatosCat(CategoriaBE objCategoria){
        objCategoria.setDescripcion(this.txtDescripcionCategoria.getText());
        objCategoria.setEstado("Activo");
    }

    private boolean validarDatosSubCat( ){
    this.txtDescripcionSubcategoria.setBackground(new JTextField().getBackground());
    if (this.txtDescripcionSubcategoria.getText().equals("")){
        this.txtDescripcionSubcategoria.setBackground(Color.YELLOW);
        this.txaBarraEstado.setForeground(Color.RED);
       this.txaBarraEstado.setText("Debe llenar los campos obligatorios");
        return false;
    }
    return true;
    }

    private void almacenarDatosSubCat(SubcategoriaBE objSubcategoria){
        objSubcategoria.setDescripcion(this.txtDescripcionSubcategoria.getText());
        objSubcategoria.setEstado("Activo");
        objSubcategoria.setCodCategoria(1); //Esta hardcodeado
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void rdbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCategoriasActionPerformed
        javax.swing.AbstractButton boton = (javax.swing.AbstractButton)evt.getSource();
       if (boton.isSelected()) {
           this.txtDescripcionCategoria.setEnabled(true);
           this.tblCategoria.setEnabled(true);
           this.txtDescripcionSubcategoria.setEnabled(false);
           this.tblSubcategoria.setEnabled(false);
           this.txtDescripcionSubcategoria.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_rdbCategoriasActionPerformed

    private void rdbSubcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSubcategoriasActionPerformed
        javax.swing.AbstractButton boton = (javax.swing.AbstractButton)evt.getSource();
       if (boton.isSelected()) {
           this.txtDescripcionSubcategoria.setEnabled(true);
           this.tblSubcategoria.setEnabled(true);
           this.txtDescripcionCategoria.setEnabled(false);
           this.tblCategoria.setEnabled(false);
           this.txtDescripcionCategoria.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_rdbSubcategoriasActionPerformed

    
    private void cargarTablaCategoria(){
        DefaultTableModel model = (DefaultTableModel) this.tblCategoria.getModel();
        model.setNumRows(0);
        for (CategoriaBE obj : arrCategoria){            
                llenarGrillaCategoria(obj,model);
        }
        this.tblCategoria.setModel(model);
    }

    private void llenarGrillaCategoria(CategoriaBE obj, DefaultTableModel model){
           Object[]  newRow = {obj.getCodCategoria(), obj.getDescripcion(), obj.getEstado()};
           model.addRow(newRow);
    }
 
private void cargarTablaSubcategoria(){
        DefaultTableModel model = (DefaultTableModel) this.tblSubcategoria.getModel();
        model.setNumRows(0);
        for (SubcategoriaBE obj : arrSubcategoria){
                llenarGrillaSubcategoria(obj,model);
        }
        this.tblSubcategoria.setModel(model);
    }

    private void llenarGrillaSubcategoria(SubcategoriaBE obj, DefaultTableModel model){
           Object[]  newRow = {obj.getCodCategoria(), obj.getDescripcion(), obj.getEstado()};
           model.addRow(newRow);
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNuevaCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdbCategorias;
    private javax.swing.JRadioButton rdbSubcategorias;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTable tblSubcategoria;
    private javax.swing.JTextArea txaBarraEstado;
    private javax.swing.JTextField txtDescripcionCategoria;
    private javax.swing.JTextField txtDescripcionSubcategoria;
    // End of variables declaration//GEN-END:variables

}
