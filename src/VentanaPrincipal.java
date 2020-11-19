
import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    DOM gesDOM = new DOM();
    SAX gesSAX = new SAX();

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        jButtonMostrarDOM.setEnabled(false);
        jButtonMostrarJAXB.setEnabled(false);
        jButtonMostrarSAX.setEnabled(false);
        jButtonAñadirDOM.setEnabled(false);
        jButtonGuardarDOM.setEnabled(false);
        jButtonModificarDOM.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMostrarDOM = new javax.swing.JButton();
        jButtonMostrarJAXB = new javax.swing.JButton();
        jButtonMostrarSAX = new javax.swing.JButton();
        jButtonAñadirDOM = new javax.swing.JButton();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelPublicado = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldPublicado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrado = new javax.swing.JTextArea();
        jButtonGuardarDOM = new javax.swing.JButton();
        jTextFieldTituloAntiguo = new javax.swing.JTextField();
        jTextFieldTituloNuevo = new javax.swing.JTextField();
        jLabelTituloAntiguo = new javax.swing.JLabel();
        jLabelTituloNuevo = new javax.swing.JLabel();
        jButtonModificarDOM = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFicherosXML = new javax.swing.JMenu();
        jMenuItemAbrirDOM = new javax.swing.JMenuItem();
        jMenuItemAbrirSAX = new javax.swing.JMenuItem();
        jMenuItemAbrirJAXB = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMostrarDOM.setText("Mostrar DOM");
        jButtonMostrarDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarDOMActionPerformed(evt);
            }
        });

        jButtonMostrarJAXB.setText("Mostrar JAXB");

        jButtonMostrarSAX.setText("Mostrar SAX");
        jButtonMostrarSAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarSAXActionPerformed(evt);
            }
        });

        jButtonAñadirDOM.setText("Añadir");
        jButtonAñadirDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirDOMActionPerformed(evt);
            }
        });

        jLabelMensaje.setText("<Fichero XML no seleccionado>");

        jLabelTitulo.setText("Título:");

        jLabelAutor.setText("Autor:");

        jLabelPublicado.setText("Publicado en:");

        jTextAreaMostrado.setColumns(20);
        jTextAreaMostrado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrado);

        jButtonGuardarDOM.setText("Guardar DOM");
        jButtonGuardarDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarDOMActionPerformed(evt);
            }
        });

        jLabelTituloAntiguo.setText("Título antiguo");

        jLabelTituloNuevo.setText("Título nuevo");

        jButtonModificarDOM.setText("Modificar");
        jButtonModificarDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDOMActionPerformed(evt);
            }
        });

        jMenuFicherosXML.setText("Ficheros XML");

        jMenuItemAbrirDOM.setText("Abrir DOM");
        jMenuItemAbrirDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirDOMActionPerformed(evt);
            }
        });
        jMenuFicherosXML.add(jMenuItemAbrirDOM);

        jMenuItemAbrirSAX.setText("Abrir SAX");
        jMenuItemAbrirSAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirSAXActionPerformed(evt);
            }
        });
        jMenuFicherosXML.add(jMenuItemAbrirSAX);

        jMenuItemAbrirJAXB.setText("Abrir JAXB");
        jMenuFicherosXML.add(jMenuItemAbrirJAXB);

        jMenuBar1.add(jMenuFicherosXML);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMostrarDOM, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarSAX, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarJAXB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAñadirDOM, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonGuardarDOM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabelTitulo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabelAutor)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldAutor)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelPublicado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldPublicado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(66, 66, 66)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonModificarDOM))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelTituloNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldTituloNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelTituloAntiguo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldTituloAntiguo))))))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrarDOM)
                    .addComponent(jButtonMostrarSAX)
                    .addComponent(jButtonMostrarJAXB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTitulo)
                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAutor)
                                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPublicado)
                                    .addComponent(jTextFieldPublicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTituloAntiguo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTituloAntiguo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldTituloNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTituloNuevo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonModificarDOM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGuardarDOM)
                            .addComponent(jButtonAñadirDOM))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAbrirDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirDOMActionPerformed
        File ficheroXML;
        ficheroXML = dialogoSeleccionarFichero();

        if (ficheroXML == null) {
            this.jLabelMensaje.setText("Error en la seleccion del fichero");
        } else {
            if (gesDOM.abrir_XML_DOM(ficheroXML) == -1) {
                this.jLabelMensaje.setText("Error al crear el objeto DOM");
            } else {
                this.jLabelMensaje.setText("Objeto DOM creado");
                jButtonMostrarDOM.setEnabled(true);
                jButtonAñadirDOM.setEnabled(true);
                jButtonGuardarDOM.setEnabled(true);
                jButtonModificarDOM.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jMenuItemAbrirDOMActionPerformed

    private void jButtonMostrarDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarDOMActionPerformed
        String salida = "";
        salida = gesDOM.recorrerYmostrarDOM();
        this.jTextAreaMostrado.setText(salida);

    }//GEN-LAST:event_jButtonMostrarDOMActionPerformed

    private void jButtonAñadirDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirDOMActionPerformed
        if (gesDOM.añadirDOM(this.jTextFieldTitulo.getText(), this.jTextFieldAutor.getText(), this.jTextFieldPublicado.getText()) == -1) {
            this.jLabelMensaje.setText("Error al añadir el nodo");
        } else {
            this.jLabelMensaje.setText("Nodo añadido correctamente");
        }
    }//GEN-LAST:event_jButtonAñadirDOMActionPerformed

    private void jButtonGuardarDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarDOMActionPerformed
        if (gesDOM.guardarDOM() == -1) {
            jLabelMensaje.setText("Error al guardar el fichero");
        } else {
            jLabelMensaje.setText("Fichero guardado correctamente");
        }
    }//GEN-LAST:event_jButtonGuardarDOMActionPerformed

    private void jButtonModificarDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDOMActionPerformed
        if (gesDOM.modificarTituloDOM(this.jTextFieldTituloAntiguo.getText(), this.jTextFieldTituloNuevo.getText()) == -1) {
            jLabelMensaje.setText("Error al modificar el DOM");
        } else if (gesDOM.modificarTituloDOM(this.jTextFieldTituloAntiguo.getText(), this.jTextFieldTituloNuevo.getText()) == 0) {
            jLabelMensaje.setText("Nodo modificado correctamente");
        } else {
            jLabelMensaje.setText("No existe nodo con ese titulo");
        }
    }//GEN-LAST:event_jButtonModificarDOMActionPerformed

    private void jMenuItemAbrirSAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirSAXActionPerformed
        
        File ficheroXML;
        ficheroXML = dialogoSeleccionarFichero();

        if (ficheroXML == null) {
            this.jLabelMensaje.setText("Error en la seleccion del fichero");
        } else {
            if (gesSAX.abrir_XML_SAX(ficheroXML) == -1) {
                this.jLabelMensaje.setText("Error al crear el objeto SAX");
            } else {
                this.jLabelMensaje.setText("Objeto SAX creado");
                jButtonMostrarSAX.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jMenuItemAbrirSAXActionPerformed

    private void jButtonMostrarSAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarSAXActionPerformed
        String salida = gesSAX.recorrerSAX();
        jTextAreaMostrado.setText(salida);
    }//GEN-LAST:event_jButtonMostrarSAXActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirDOM;
    private javax.swing.JButton jButtonGuardarDOM;
    private javax.swing.JButton jButtonModificarDOM;
    private javax.swing.JButton jButtonMostrarDOM;
    private javax.swing.JButton jButtonMostrarJAXB;
    private javax.swing.JButton jButtonMostrarSAX;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelPublicado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloAntiguo;
    private javax.swing.JLabel jLabelTituloNuevo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFicherosXML;
    private javax.swing.JMenuItem jMenuItemAbrirDOM;
    private javax.swing.JMenuItem jMenuItemAbrirJAXB;
    private javax.swing.JMenuItem jMenuItemAbrirSAX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMostrado;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldPublicado;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldTituloAntiguo;
    private javax.swing.JTextField jTextFieldTituloNuevo;
    // End of variables declaration//GEN-END:variables

    private File dialogoSeleccionarFichero() {
        File fichero = null;
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fichero = fc.getSelectedFile();
        }
        return fichero;
    }
}
