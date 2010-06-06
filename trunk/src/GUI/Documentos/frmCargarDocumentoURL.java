/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCargarDocumentoURL.java
 *
 * Created on 30/05/2010, 04:42:31 PM
 */

package GUI.Documentos;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Harvey Rivadeneyra
 */
public class frmCargarDocumentoURL extends javax.swing.JFrame {
   private JTextField enterField;
   private JEditorPane contentsArea;

    /** Creates new form frmCargarDocumentoURL */
//    public frmCargarDocumentoURL() {
//        initComponents();
//    }
    public frmCargarDocumentoURL()
   {
      super( "Busca archivo en internet" );

      Container container = getContentPane();

      // create enterField and register its listener
      enterField = new JTextField( "Ingrese direccion URL del archivo aqui" );
      enterField.addActionListener(
         new ActionListener() {

            // get document specified by user
            public void actionPerformed( ActionEvent event )
            {
               getThePage( event.getActionCommand() );
            }

         } // end inner class

      ); // end call to addActionListener

      container.add( enterField, BorderLayout.NORTH );

      // create contentsArea and register HyperlinkEvent listener
      contentsArea = new JEditorPane();
      contentsArea.setEditable( false );
      contentsArea.addHyperlinkListener(
         new HyperlinkListener() {

            // if user clicked hyperlink, go to specified page
            public void hyperlinkUpdate( HyperlinkEvent event )
            {
               if ( event.getEventType() ==
                    HyperlinkEvent.EventType.ACTIVATED )
                  getThePage( event.getURL().toString() );
            }

         } // end inner class

      ); // end call to addHyperlinkListener

      container.add( new JScrollPane( contentsArea ),
         BorderLayout.CENTER );
      setSize( 600, 600 );
      setVisible( true );

   } // fin de constructor
   // load document
   private void getThePage( String location )
   {
      // load document and display location
      try {
         contentsArea.setPage( location );
         enterField.setText( location );
      }
      catch ( IOException ioException ) {
         JOptionPane.showMessageDialog( this,
            "Error al ingresar el URL especificado", "URL no existe",
            JOptionPane.ERROR_MESSAGE );
      }

   } // end method getThePage

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCargarDocumentoURL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}