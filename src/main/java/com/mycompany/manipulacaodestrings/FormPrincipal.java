/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manipulacaodestrings;

import javax.swing.JOptionPane;

/**
 *
 * @author Wanderson
 */
public class FormPrincipal extends javax.swing.JFrame {

    Gerencia gerencia;
    String operacao;

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        status(false);
        gerencia = new Gerencia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCoperacoes = new javax.swing.JComboBox<>();
        TFDigitePalavra = new javax.swing.JTextField();
        TFdigiteChave = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TFresultado = new javax.swing.JTextField();
        JBenviar = new javax.swing.JButton();
        JLdigiteUmaChave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JCoperacoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vogais", "Inverter", "Tamanho", "Palíndromo", "Consoantes", "Criptografar", "Descriptografar" }));
        JCoperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCoperacoesActionPerformed(evt);
            }
        });

        TFDigitePalavra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFDigitePalavra.setText("Digite a palavra");

        TFdigiteChave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFdigiteChave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFdigiteChaveMouseClicked(evt);
            }
        });
        TFdigiteChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdigiteChaveActionPerformed(evt);
            }
        });

        TFresultado.setEditable(false);
        TFresultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFresultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFresultado.setToolTipText("");

        JBenviar.setText("Enviar");
        JBenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBenviarActionPerformed(evt);
            }
        });

        JLdigiteUmaChave.setText("Digite uma chave de um digito.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFDigitePalavra, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCoperacoes, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLdigiteUmaChave))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TFdigiteChave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFDigitePalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCoperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLdigiteUmaChave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFdigiteChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBenviar)))
                    .addComponent(TFresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCoperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCoperacoesActionPerformed
        operacao = JCoperacoes.getSelectedItem().toString();
        gerencia.setPalavra(TFDigitePalavra.getText());

        switch (operacao) {

            case "Inverter" -> {
                TFresultado.setText(gerencia.inverter());
                status(false);
            }
            case "Tamanho" -> {
                status(false);

                TFresultado.setText(String.valueOf(gerencia.getPalavra().length()));
            }
            case "Palíndromo" -> {
                status(false);

                TFresultado.setText(gerencia.palindromo());
            }
            case "Vogais" -> {
                status(false);

                TFresultado.setText(gerencia.vogais());
            }
            case "Consoantes" -> {
                status(false);

                TFresultado.setText(gerencia.consoantes());
            }
            case "Criptografar" -> {
                TFdigiteChave.setText("");
                status(true);

            }
            case "Descriptografar" -> {
                TFdigiteChave.setText("");
                status(true);
            }
        }
        ;
    }//GEN-LAST:event_JCoperacoesActionPerformed

    private void JBenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBenviarActionPerformed
        operacao = JCoperacoes.getSelectedItem().toString();
        if (!TFdigiteChave.getText().equals("")) {
            gerencia.setChave(Integer.parseInt(TFdigiteChave.getText()));
            if ("Criptografar".equals(operacao)) {
                TFresultado.setText(gerencia.criptografar());
                status(false);

            } else {
                TFresultado.setText(gerencia.descriptografar());
                status(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe uma chave para continuar!");
        }

    }//GEN-LAST:event_JBenviarActionPerformed

    private void TFdigiteChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdigiteChaveActionPerformed
        TFdigiteChave.setText("");    }//GEN-LAST:event_TFdigiteChaveActionPerformed

    private void TFdigiteChaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFdigiteChaveMouseClicked
        TFdigiteChave.setText("");

    }//GEN-LAST:event_TFdigiteChaveMouseClicked

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    public void status(boolean b) {

        TFdigiteChave.setVisible(b);
        JBenviar.setVisible(b);
        JLdigiteUmaChave.setVisible(b);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBenviar;
    private javax.swing.JComboBox<String> JCoperacoes;
    private javax.swing.JLabel JLdigiteUmaChave;
    private javax.swing.JTextField TFDigitePalavra;
    private javax.swing.JTextField TFdigiteChave;
    private javax.swing.JTextField TFresultado;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
