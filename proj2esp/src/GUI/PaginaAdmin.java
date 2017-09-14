
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PaginaAdmin extends javax.swing.JFrame {


    public PaginaAdmin() {
        private JPanel atual = null; 
        private JFrame atualframe = null;
    
        public PaginaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        atual = this.jPanel2;
        atualframe = this;
    }

  
 public class PaginaAdmin extends javax.swing.JFrame {
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dados_pessoais = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        funcionarios = new javax.swing.JButton();
        produtos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        categorias = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

public class PaginaAdmin extends javax.swing.JFrame {

        jPanel2.setOpaque(false);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/user.jpg"))); // NOI18N
        jButton2.setBorder(null);
        dados_pessoais.setBackground(new java.awt.Color(255, 255, 255));
        dados_pessoais.setForeground(new java.awt.Color(255, 255, 255));
        dados_pessoais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/user.jpg"))); // NOI18N
        dados_pessoais.setBorder(null);
        dados_pessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dados_pessoaisActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/logout.png"))); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/logout.png"))); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("SAIR");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/userfind.png"))); // NOI18N
        funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/userfind.png"))); // NOI18N
        funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariosActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/doc.png"))); // NOI18N
        produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/doc.png"))); // NOI18N
        produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosActionPerformed(evt);
            }
        });

        jLabel3.setText("DADOS PESSOAIS");

 public class PaginaAdmin extends javax.swing.JFrame {

        jLabel5.setText("PRODUTOS");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/arquivo.png"))); // NOI18N
        categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj2esp/images/arquivo.png"))); // NOI18N
        categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasActionPerformed(evt);
            }
        });

        jLabel6.setText("CATEGORIAS");

public class PaginaAdmin extends javax.swing.JFrame {
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
public class PaginaAdmin extends javax.swing.JFrame {
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(dados_pessoais)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
public class PaginaAdmin extends javax.swing.JFrame {
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dados_pessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
public class PaginaAdmin extends javax.swing.JFrame {
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dados_pessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dados_pessoaisActionPerformed
        jPanel2.setVisible(false);
        
    }//GEN-LAST:event_dados_pessoaisActionPerformed

    private void funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionariosActionPerformed
        mudaPainel(new veri_func());
    }//GEN-LAST:event_funcionariosActionPerformed

    private void produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosActionPerformed

    private void categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriasActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.setVisible(false);
        login login = new login();
        login.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    /**
     * @param args the command line arguments
     */
 public class PaginaAdmin extends javax.swing.JFrame {
                new PaginaAdmin().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton categorias;
    private javax.swing.JButton dados_pessoais;
    private javax.swing.JButton funcionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton produtos;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

    public void mudaPainel(JPanel newpanel){
        this.atual.setVisible(false);
        atual = newpanel;
        this.setContentPane(atual);
        this.atual.setVisible(true);
    }
    public void mudaFrame(JFrame newframe){
        this.atualframe.setVisible(false);
        atualframe = newframe;
        this.atualframe.setVisible(true);
    }
    
    public void voltar() {
        this.atual.setVisible(false);
        this.atual = jPanel2;
        this.setContentPane(atual);
        this.atual.setVisible(true);
    }
}