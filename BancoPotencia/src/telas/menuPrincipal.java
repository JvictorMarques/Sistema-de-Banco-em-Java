/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;
import connection.Conection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Elder
 */
public class menuPrincipal extends javax.swing.JFrame {
    saqueTela saque;
    transferenciaTela transferencia;
    depositoTela deposito;
    poupancaTela poupanca;
    extratoTela extrato;
    Conection con1=new Conection(); 
    Connection connected;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;

    
    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {

        initComponents();
        setLocationRelativeTo(null);  
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTextSaldo = new javax.swing.JLabel();
        jLabelValorSaldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonTransferencia = new javax.swing.JButton();
        jButtonDeposito = new javax.swing.JButton();
        jButtonSaque = new javax.swing.JButton();
        jButtonPoupanca = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonExtrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTextSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTextSaldo.setText("Saldo: ");

        jLabelValorSaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorSaldo.setText("   ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/potencia.png"))); // NOI18N

        jButtonTransferencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTransferencia.setText("Transferência");
        jButtonTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferenciaActionPerformed(evt);
            }
        });

        jButtonDeposito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeposito.setText("Deposito");
        jButtonDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositoActionPerformed(evt);
            }
        });

        jButtonSaque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSaque.setText("Saque");
        jButtonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaqueActionPerformed(evt);
            }
        });

        jButtonPoupanca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPoupanca.setText("Poupança");
        jButtonPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPoupancaActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonExtrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExtrato.setText("Extrato");
        jButtonExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTextSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorSaldo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextSaldo)
                    .addComponent(jLabelValorSaldo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void saldo(int id){
        int chama = id;
        try {
            connected = con1.getConnection();       
            String sqlSelect1 = "SELECT id_conta_corrente, senha, saldo FROM banco_potencia.contacorrente WHERE id_conta_corrente = " + chama;
            st = connected.createStatement();
            rs = st.executeQuery(sqlSelect1);
            if (rs.next()) {
                double saldo = rs.getDouble("saldo");
                jLabelValorSaldo.setText(Double.toString(saldo));
            } else {
                JOptionPane.showMessageDialog(null, "Aqui não nemnem");
                this.dispose();
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("Erro ao estabelecer a conexão com o banco de dados. Erro: " + e);
        }
    }
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        telaLogin login = new telaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaqueActionPerformed
        // TODO add your handling code here:
        if(saque == null) {
            
            saqueTela saque = new saqueTela();
            saque.setVisible(true);   
            saque.recebeSaque(jLabelValorSaldo.getText());
        }
        
    }//GEN-LAST:event_jButtonSaqueActionPerformed

    private void jButtonTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferenciaActionPerformed
        // TODO add your handling code here:
        if(transferencia == null){
            transferenciaTela transferencia = new transferenciaTela();
            transferencia.setVisible(true);
            transferencia.recebeTrans(jLabelValorSaldo.getText());
        }
        
        
    }//GEN-LAST:event_jButtonTransferenciaActionPerformed

    private void jButtonDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositoActionPerformed
        // TODO add your handling code here:
        if(deposito == null){
            depositoTela deposito = new depositoTela();
            deposito.setVisible(true);
        }
    }//GEN-LAST:event_jButtonDepositoActionPerformed

    private void jButtonPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPoupancaActionPerformed
        // TODO add your handling code here:
        if(poupanca == null){
            poupancaTela poupanca = new poupancaTela();
            poupanca.setVisible(true);
        }
    }//GEN-LAST:event_jButtonPoupancaActionPerformed

    private void jButtonExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtratoActionPerformed
        // TODO add your handling code here:
        
        if(extrato == null){
            extratoTela extrato = new extratoTela();
            extrato.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonExtratoActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeposito;
    private javax.swing.JButton jButtonExtrato;
    private javax.swing.JButton jButtonPoupanca;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSaque;
    private javax.swing.JButton jButtonTransferencia;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTextSaldo;
    private javax.swing.JLabel jLabelValorSaldo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
