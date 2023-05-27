package telas;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }
    private void initComponents() {

        botaoPJuridica = new javax.swing.JButton();
        botaoPFisica = new javax.swing.JButton();
        voltarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoPJuridica.setText("PESSOA JURIDICA");
        botaoPJuridica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPJuridicaActionPerformed(evt);
            }
        });

        botaoPFisica.setText("PESSOA FISICA");
        botaoPFisica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPFisicaActionPerformed(evt);
            }
        });

        voltarCadastro.setText("Voltar");
        voltarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(botaoPFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(voltarCadastro)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(botaoPFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(botaoPJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(voltarCadastro)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }

    private void botaoPJuridicaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void botaoPFisicaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void voltarCadastroActionPerformed(java.awt.event.ActionEvent evt) {
        telaLogin telaLoginS = new telaLogin();
        telaLoginS.setVisible(true);
        Cadastro.this.dispose();
    }

    public static void main(String args[]) {
    
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    private javax.swing.JButton botaoPFisica;
    private javax.swing.JButton botaoPJuridica;
    private javax.swing.JButton voltarCadastro;
}
