/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmVentanaAcceso.java
 *
 * Created on 06/05/2010, 12:14:01 AM
 */

package GUI.Principal;
import BusinessLogic.*;
import BusinessEntity.*;
import DataAccess.UsuarioDA;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Administador
 */
public class frmVentanaAcceso extends javax.swing.JFrame {

    /** Creates new form frmVentanaAcceso */
    private int intentos = 0;
    private boolean conectado = false;
    private String usr;

    public frmVentanaAcceso() {
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

        lblUsuario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Be Original - Ingreso al Sistema");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblUsuario.setText("Usuario");

        btnSalir.setText("Salir");
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.setMinimumSize(new java.awt.Dimension(110, 39));
        btnIngresar.setName("btnIngresar"); // NOI18N
        btnIngresar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtUsuario.setName("btnIngresar"); // NOI18N

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblPassword.setText("Password");

        jLabel1.setIcon(new javax.swing.ImageIcon("T:\\PUCP\\Cursos\\DP1\\2010-1\\Trabajo\\Laboratorios\\Iconos\\application-iconset\\48\\Users.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("T:\\PUCP\\Cursos\\DP1\\2010-1\\Trabajo\\Laboratorios\\Iconos\\application-iconset\\48\\Login.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        //frmVentanaPrincipal ventanaPrincipal= new frmVentanaPrincipal();
        //ventanaPrincipal.setVisible(true);
        //this.setVisible(false);
        LogUsuarioBL objLogUsuarioBL = new LogUsuarioBL();
        if (!(this.txtUsuario.getText().equals("")) && !(this.txtPassword.getText().equals(""))) {
         try{

            AccesoSistemaBL Logicaacceso = new AccesoSistemaBL();
            AccesoSistemaBE objAcceso = new AccesoSistemaBE(txtUsuario.getText(),txtPassword.getText());

            UsuarioBE objUsuario = new UsuarioBE();
            objUsuario= Logicaacceso.validarCuenta(objAcceso);
            System.out.println(objUsuario.getPassword()+"");

//         objUsuario = objIngresoBL.validarCuenta(objIngreso);
             if (objUsuario !=  null){
                LogUsuarioBE objLogUsuarioBE = new LogUsuarioBE();
                 objLogUsuarioBE.setObjUsuarioBE(objUsuario);
                 int codlog=objLogUsuarioBL.obtenerIdLog();
                   frmVentanaPrincipal ventana = new frmVentanaPrincipal(objUsuario,codlog);
                   conectado=true;
                   this.setVisible(false);

                        //setEnableMenus(ventana,false);
                         //habilitar menus permitidos al usario
//                         ModuloBL objModuloBL = new ModuloBL();
//                         ArrayList<ModuloBE> listaModulo = new ArrayList<ModuloBE>();
//                         listaModulo = objModuloBL.getModulo(objUsuario.getCodPerfil());
                    this.txtPassword.setText("");
                    this.txtUsuario.setText("");
                    //muestro la pantalla Principal
                    ventana.setVisible(true);

                }
                  
                else{
                 JOptionPane.showMessageDialog(null,"Nombre o Clave incorrecta"," Mensaje ",JOptionPane.ERROR_MESSAGE);
                 this.txtPassword.setText("");
                 this.txtUsuario.transferFocus();
                }

 
         }
     catch(Exception exc){
             //System.out.printf("ERROR=%s",exc.getMessage());
             JOptionPane.showMessageDialog(null,"Error en Ingreso","Mensaje ",JOptionPane.ERROR_MESSAGE);
         }
      }
      else{
            JOptionPane.showMessageDialog(null,"Debe Ingresar el nombre del Usuario y la Clave"," Mensaje ",JOptionPane.ERROR_MESSAGE);
            this.btnSalir.transferFocus();
      }


    }//GEN-LAST:event_btnIngresarActionPerformed
 private void setEnableMenus(frmVentanaPrincipal form,boolean estado) {
        int cont_menus=0;
        while(cont_menus<form.getJMenuBar().getMenuCount()-1){
            int cont_items=0;


//             while(cont_items<form.getJMenuBar().getMenu(cont_menus).getMenuComponentCount()){
//                    form.getJMenuBar().getMenu(cont_menus).getItem(cont_items).setEnabled(estado);
//                    cont_items++;
//             }
          form.getJMenuBar().getMenu(cont_menus).setEnabled(false);
          cont_menus++;
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentanaAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
