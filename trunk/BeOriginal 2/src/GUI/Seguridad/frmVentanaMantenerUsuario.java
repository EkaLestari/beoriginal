/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmVentanaMantenerUsuario.java
 *
 * Created on 05/05/2010, 10:17:12 PM
 */

package GUI.Seguridad;

/**
 *
 * @author Administador
 */
public class frmVentanaMantenerUsuario extends javax.swing.JFrame {

    /** Creates new form frmVentanaMantenerUsuario */
    public frmVentanaMantenerUsuario() {
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

        pnlListaUsuarios = new javax.swing.JPanel();
        scpCarteras = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        pnlBusquedaUsuario = new javax.swing.JPanel();
        pnlDatosUsuario = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApePaterno = new javax.swing.JLabel();
        lblApeMaterno = new javax.swing.JLabel();
        lblPerfilUsuario = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApePaterno = new javax.swing.JTextField();
        txtApeMaterno = new javax.swing.JTextField();
        cmbPerfilUsuario = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlListaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 12), java.awt.Color.blue)); // NOI18N

        tblUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Apellido Paterno", "Apellido Materno", "Estado", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpCarteras.setViewportView(tblUsuario);

        javax.swing.GroupLayout pnlListaUsuariosLayout = new javax.swing.GroupLayout(pnlListaUsuarios);
        pnlListaUsuarios.setLayout(pnlListaUsuariosLayout);
        pnlListaUsuariosLayout.setHorizontalGroup(
            pnlListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpCarteras, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlListaUsuariosLayout.setVerticalGroup(
            pnlListaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpCarteras, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBusquedaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 12), java.awt.Color.blue)); // NOI18N
        pnlBusquedaUsuario.setName("pnlBusquedaUsuario"); // NOI18N

        pnlDatosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 12), java.awt.Color.blue)); // NOI18N

        lblCodigo.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        lblCodigo.setText("Código :");

        lblNombres.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        lblNombres.setText("Nombres :");
        lblNombres.setName("lblNombres"); // NOI18N

        lblApePaterno.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        lblApePaterno.setText("Apellido Paterno :");
        lblApePaterno.setName("lblApePaterno"); // NOI18N

        lblApeMaterno.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        lblApeMaterno.setText("Apellido Materno :");
        lblApeMaterno.setName("lblApeMaterno"); // NOI18N

        lblPerfilUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        lblPerfilUsuario.setText("Perfil de Usuario :");
        lblPerfilUsuario.setName("lblPerfilUsuario"); // NOI18N

        txtCodigo.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        txtCodigo.setName("txtCodigo"); // NOI18N

        txtNombres.setFont(new java.awt.Font("DejaVu Sans", 0, 12));

        txtApePaterno.setFont(new java.awt.Font("DejaVu Sans", 0, 12));

        txtApeMaterno.setFont(new java.awt.Font("DejaVu Sans", 0, 12));

        cmbPerfilUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        cmbPerfilUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbPerfilUsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosUsuarioLayout = new javax.swing.GroupLayout(pnlDatosUsuario);
        pnlDatosUsuario.setLayout(pnlDatosUsuarioLayout);
        pnlDatosUsuarioLayout.setHorizontalGroup(
            pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                        .addComponent(lblApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApeMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApePaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(cmbPerfilUsuario, 0, 198, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        pnlDatosUsuarioLayout.setVerticalGroup(
            pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(lblPerfilUsuario)
                            .addComponent(cmbPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(txtApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApeMaterno)
                            .addComponent(txtApeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosUsuarioLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBusquedaUsuarioLayout = new javax.swing.GroupLayout(pnlBusquedaUsuario);
        pnlBusquedaUsuario.setLayout(pnlBusquedaUsuarioLayout);
        pnlBusquedaUsuarioLayout.setHorizontalGroup(
            pnlBusquedaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlBusquedaUsuarioLayout.setVerticalGroup(
            pnlBusquedaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnBuscar.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Seguridad/find.png"))); // NOI18N
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        btnNuevo.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Seguridad/Add.png"))); // NOI18N
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnModificar.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Seguridad/Edit.png"))); // NOI18N
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnModificar);

        btnEliminar.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Seguridad/Delete.png"))); // NOI18N
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminar);

        btnLimpiar.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Auditoria/erase_icon.gif"))); // NOI18N
        btnLimpiar.setAutoscrolls(true);
        btnLimpiar.setFocusable(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLimpiar);

        btnCerrar.setFont(new java.awt.Font("DejaVu Sans", 0, 12));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Seguridad/Close-icon.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrar);

        jToolBar2.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBusquedaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlListaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBusquedaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(pnlListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPerfilUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPerfilUsuarioKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_cmbPerfilUsuarioKeyTyped

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
}//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
}//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        frmVentanaUsuario ventanaUsuario = new frmVentanaUsuario();
        ventanaUsuario.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        // new frmVentanaUsuario(null,1).setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentanaMantenerUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbPerfilUsuario;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblApeMaterno;
    private javax.swing.JLabel lblApePaterno;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPerfilUsuario;
    private javax.swing.JPanel pnlBusquedaUsuario;
    private javax.swing.JPanel pnlDatosUsuario;
    private javax.swing.JPanel pnlListaUsuarios;
    private javax.swing.JScrollPane scpCarteras;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtApeMaterno;
    private javax.swing.JTextField txtApePaterno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}