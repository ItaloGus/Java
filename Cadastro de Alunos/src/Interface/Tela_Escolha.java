/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Utilitarios.conexao;
import java.awt.Toolkit;

/**
 *
 * @author Italo
 */
public class Tela_Escolha extends javax.swing.JFrame {
        conexao conecta = new conexao ();
    /**
     * Creates new form TelaEscolha
     */
    public Tela_Escolha() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonLogoff = new javax.swing.JButton();
        jLabelAluno = new javax.swing.JLabel();
        jLabelProfessor = new javax.swing.JLabel();
        jButtonAluno = new javax.swing.JButton();
        jButtonProfessor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESCOLHA DE CADASTRO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButtonLogoff.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogoff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogoff.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogoff.setText("LOGOFF");
        jButtonLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffActionPerformed(evt);
            }
        });
        jButtonLogoff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLogoffKeyPressed(evt);
            }
        });

        jLabelAluno.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAluno.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jLabelAluno.setText("ALUNO");
        jLabelAluno.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelProfessor.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProfessor.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jLabelProfessor.setText("PROFESSOR");
        jLabelProfessor.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButtonAluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAluno.setText("DISCENTE");
        jButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunoActionPerformed(evt);
            }
        });
        jButtonAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAlunoKeyPressed(evt);
            }
        });

        jButtonProfessor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonProfessor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProfessor.setText("DOCENTE");
        jButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorActionPerformed(evt);
            }
        });
        jButtonProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonProfessorKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CARREGANDO ENGRENAGEM.gif"))); // NOI18N
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/escola.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo IFPA.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButtonLogoff))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(174, 174, 174))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogoff)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(336, 311));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffActionPerformed
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_jButtonLogoffActionPerformed

    private void jButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunoActionPerformed
        // TODO add your handling code here:
        telaAluno();
    }//GEN-LAST:event_jButtonAlunoActionPerformed

    private void jButtonProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorActionPerformed
        telaProfessor();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProfessorActionPerformed

    private void jButtonProfessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonProfessorKeyPressed
        if(evt.getKeyCode() == evt.VK_DOWN)
            jButtonAluno.requestFocus();
        else if(evt.getKeyCode() == evt.VK_RIGHT)
            jButtonLogoff.requestFocus();
        else if(evt.getKeyCode() == evt.VK_ENTER)
            telaProfessor();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProfessorKeyPressed

    private void jButtonAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAlunoKeyPressed
        if(evt.getKeyCode() == evt.VK_UP)
            jButtonProfessor.requestFocus();
        else if(evt.getKeyCode() == evt.VK_DOWN)
            jButtonLogoff.requestFocus();
        else if(evt.getKeyCode() == evt.VK_RIGHT)
            jButtonLogoff.requestFocus();
        else if(evt.getKeyCode() == evt.VK_ENTER)
            telaAluno();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlunoKeyPressed

    private void jButtonLogoffKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLogoffKeyPressed
        if(evt.getKeyCode() == evt.VK_LEFT)
            jButtonAluno.requestFocus();
        else if(evt.getKeyCode() == evt.VK_UP)
            jButtonAluno.requestFocus();
        else if(evt.getKeyCode() == evt.VK_ENTER)
            logoff();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogoffKeyPressed

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
            java.util.logging.Logger.getLogger(Tela_Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Escolha().setVisible(true);
            }
        });
    }
    
    private void telaAluno(){
        dispose();
        TelaAluno tla = new TelaAluno ();
        tla.setVisible(true);
    }
    
    private void telaProfessor(){
        dispose();
        TelaProfessor tlf = new TelaProfessor();
        tlf.setVisible(true);
    }
    
    private void logoff(){
        conecta.desconectar();
        dispose();
        Tela_Login tll = new Tela_Login();
        tll.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAluno;
    private javax.swing.JButton jButtonLogoff;
    private javax.swing.JButton jButtonProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAluno;
    private javax.swing.JLabel jLabelProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("escola.png")));
    }
}
