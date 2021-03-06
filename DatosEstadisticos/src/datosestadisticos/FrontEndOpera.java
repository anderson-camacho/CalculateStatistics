/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosestadisticos;

/**
 *
 * @author anderson
 */
public class FrontEndOpera extends javax.swing.JFrame {

    /**
     * Creates new form FrontEnd
     */
    public FrontEndOpera() {
        initComponents();

        TextPrompt textFieldUnique = new TextPrompt("Cuentos numeros quieres.", jTextField_Dato);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TituloPrincipal = new javax.swing.JLabel();
        jButton_Calcular = new javax.swing.JButton();
        jTextField_Dato = new javax.swing.JTextField();
        jLabel_TituloMedia = new javax.swing.JLabel();
        jLabel_MuestraMedia = new javax.swing.JLabel();
        jLabelTituloDesviacionEstandar = new javax.swing.JLabel();
        jLabel_TituloModa = new javax.swing.JLabel();
        jLabel_MuestraDesviacionEstandar = new javax.swing.JLabel();
        jLabel_MuestraModa = new javax.swing.JLabel();
        jLabel_TituloDatos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_MuestraDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistics Plugin Fast");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Statistics Plugin Fast"); // NOI18N

        jLabel_TituloPrincipal.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel_TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TituloPrincipal.setText("Statistics Plugin Fast");

        jButton_Calcular.setText("CALCULAR");
        jButton_Calcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CalcularMouseClicked(evt);
            }
        });

        jTextField_Dato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Dato.setToolTipText("");
        jTextField_Dato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DatoActionPerformed(evt);
            }
        });
        jTextField_Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_DatoKeyTyped(evt);
            }
        });

        jLabel_TituloMedia.setText("Media Aritmetica: ");

        jLabelTituloDesviacionEstandar.setText("Desviacion Estandar: ");

        jLabel_TituloModa.setText("Moda: ");

        jLabel_MuestraModa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_TituloDatos.setText("Datos: ");

        jTextArea_MuestraDatos.setColumns(20);
        jTextArea_MuestraDatos.setRows(5);
        jScrollPane1.setViewportView(jTextArea_MuestraDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Dato)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_TituloMedia)
                                    .addComponent(jLabelTituloDesviacionEstandar)
                                    .addComponent(jLabel_TituloModa))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_MuestraModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_MuestraDesviacionEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_MuestraMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_TituloDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)))
                        .addGap(0, 289, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_TituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_TituloMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_MuestraMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTituloDesviacionEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_MuestraDesviacionEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_TituloModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_MuestraModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TituloDatos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_TituloPrincipal.getAccessibleContext().setAccessibleDescription("");
        jTextField_Dato.getAccessibleContext().setAccessibleName("Ingresa la cantidad datos");
        jTextField_Dato.getAccessibleContext().setAccessibleDescription("Ingresa la cantidad datos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DatoActionPerformed

    }//GEN-LAST:event_jTextField_DatoActionPerformed

    private void jTextField_DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DatoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DatoKeyTyped

    private void jButton_CalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CalcularMouseClicked
        Estadisitica objeto = new Estadisitica();
        String strDato = jTextField_Dato.getText();// TODO add your handling code here:
        int intDato = Integer.valueOf(strDato);
        objeto.setIntNumeroDatos(intDato);
        objeto.BotonCalcular();
        jLabel_MuestraMedia.setText(String.valueOf(objeto.getDblMediaAritmetica()));
        jLabel_MuestraDesviacionEstandar.setText(String.valueOf(objeto.getDblDesviacionEstandar()));
        int[] intModa = objeto.getIntModaEstadistica();
        String strModaImprimir = "";
        for (int i = 0; i < intModa.length; i++) {
            if (i == 0) {
                strModaImprimir = String.valueOf(intModa[i]);
            } else {
                strModaImprimir = strModaImprimir + " , " + String.valueOf(intModa[i]);
            }

        }
        jLabel_MuestraModa.setText(strModaImprimir);
        int[] intDatosMuestrales = objeto.getIntListaDatosOrdenados();
        String strDatosMuestra = "";
        for (int i = 0; i < intDatosMuestrales.length; i++) {
            if (i == 0) {
                strDatosMuestra = String.valueOf(intDatosMuestrales[i]);
            } else {
                strDatosMuestra = strDatosMuestra + " , " + String.valueOf(intDatosMuestrales[i]);
            }

        }
        jTextArea_MuestraDatos.setText(strDatosMuestra);
    }//GEN-LAST:event_jButton_CalcularMouseClicked

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
            java.util.logging.Logger.getLogger(FrontEndOpera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontEndOpera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontEndOpera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontEndOpera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontEndOpera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Calcular;
    private javax.swing.JLabel jLabelTituloDesviacionEstandar;
    private javax.swing.JLabel jLabel_MuestraDesviacionEstandar;
    private javax.swing.JLabel jLabel_MuestraMedia;
    private javax.swing.JLabel jLabel_MuestraModa;
    private javax.swing.JLabel jLabel_TituloDatos;
    private javax.swing.JLabel jLabel_TituloMedia;
    private javax.swing.JLabel jLabel_TituloModa;
    private javax.swing.JLabel jLabel_TituloPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_MuestraDatos;
    private javax.swing.JTextField jTextField_Dato;
    // End of variables declaration//GEN-END:variables
}
