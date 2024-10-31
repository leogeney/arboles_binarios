package com.mycompany.arbolesbinarios;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Arbol arbol = new Arbol();
    
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertarArbol = new javax.swing.JButton();
        preorden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inorden = new javax.swing.JButton();
        postorden = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertarArbol.setText("Agregar al árbol");
        insertarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarArbolActionPerformed(evt);
            }
        });

        preorden.setText("Recorrido Pre-Orden");
        preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preordenActionPerformed(evt);
            }
        });

        jLabel1.setText("ÁRBOLES BINARIOS");

        inorden.setText("Recorrido In-Orden");
        inorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inordenActionPerformed(evt);
            }
        });

        postorden.setText("Recorrido Post-Orden");
        postorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postordenActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar similar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar producto recomendado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertarArbol)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(preorden, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postorden)
                            .addComponent(jButton2))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(insertarArbol))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(preorden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inorden)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(postorden)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarArbolActionPerformed
        // TODO add your handling code here:
        arbol.insertar();
    }//GEN-LAST:event_insertarArbolActionPerformed

    private void preordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preordenActionPerformed
        // TODO add your handling code here:
        String resultado = arbol.dispararPreorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_preordenActionPerformed

    private void inordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inordenActionPerformed
        // TODO add your handling code here:
        
        String resultado = arbol.dispararInorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_inordenActionPerformed

    private void postordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postordenActionPerformed
        // TODO add your handling code here:
        String resultado = arbol.dispararPostorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_postordenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a buscar");
    String valorStr = JOptionPane.showInputDialog(null, "Ingrese el valor del producto a buscar");
    String color = JOptionPane.showInputDialog(null, "Ingrese el color del producto a buscar");
    String tamañoStr = JOptionPane.showInputDialog(null, "Ingrese el tamaño del producto a buscar");
    String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del producto a buscar");

    try {
        int valor = Integer.parseInt(valorStr);
        int tamaño = Integer.parseInt(tamañoStr);

        // Llama al método para buscar e imprimir productos similares
        arbol.buscarYImprimirSimilares(nombre, valor, color, tamaño, marca);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor o tamaño ingresado no es válido. Intente nuevamente.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        arbol.buscarYMostrarRecomendado();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inorden;
    private javax.swing.JButton insertarArbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton postorden;
    private javax.swing.JButton preorden;
    // End of variables declaration//GEN-END:variables
}
