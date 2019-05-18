/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Utilitarios.ModeloTabela;
import Utilitarios.conexao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Italo
 */
public class Tela_Tabela_Aluno extends javax.swing.JFrame {
    conexao conecta = new conexao();
    /**
     * Creates new form Tela_Tabela_Aluno
     */
    public Tela_Tabela_Aluno() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        preencherTabela("select * from tbaluno order by cod_aluno");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Aluno = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonCod_Aluno = new javax.swing.JButton();
        jButtonNascimento_Aluno = new javax.swing.JButton();
        jButtonPeriodo_Aluno = new javax.swing.JButton();
        jButtonNome_Aluno = new javax.swing.JButton();
        jButtonCurso_Aluno = new javax.swing.JButton();
        jButtonMatricula_Aluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo IFPA.jpg"))); // NOI18N

        jButtonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseExited(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jTable_Aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Aluno.getTableHeader().setReorderingAllowed(false);
        jTable_Aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Aluno);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "ALTERAR ORDEM DA TABELA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButtonCod_Aluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCod_Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCod_Aluno.setText("CÓDIGO");
        jButtonCod_Aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonCod_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCod_AlunoActionPerformed(evt);
            }
        });
        jButtonCod_Aluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCod_AlunoKeyPressed(evt);
            }
        });

        jButtonNascimento_Aluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNascimento_Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNascimento_Aluno.setText("NASCIMENTO");
        jButtonNascimento_Aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonNascimento_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNascimento_AlunoActionPerformed(evt);
            }
        });
        jButtonNascimento_Aluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNascimento_AlunoKeyPressed(evt);
            }
        });

        jButtonPeriodo_Aluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPeriodo_Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPeriodo_Aluno.setText("PERÍODO");
        jButtonPeriodo_Aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonPeriodo_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPeriodo_AlunoActionPerformed(evt);
            }
        });
        jButtonPeriodo_Aluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonPeriodo_AlunoKeyPressed(evt);
            }
        });

        jButtonNome_Aluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNome_Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNome_Aluno.setText("NOME");
        jButtonNome_Aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonNome_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNome_AlunoActionPerformed(evt);
            }
        });
        jButtonNome_Aluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNome_AlunoKeyPressed(evt);
            }
        });

        jButtonCurso_Aluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCurso_Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCurso_Aluno.setText("CURSO");
        jButtonCurso_Aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonCurso_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCurso_AlunoActionPerformed(evt);
            }
        });
        jButtonCurso_Aluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCurso_AlunoKeyPressed(evt);
            }
        });

        jButtonMatricula_Aluno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMatricula_Aluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMatricula_Aluno.setText("MATRICULA");
        jButtonMatricula_Aluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonMatricula_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatricula_AlunoActionPerformed(evt);
            }
        });
        jButtonMatricula_Aluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMatricula_AlunoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCod_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNome_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNascimento_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPeriodo_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCurso_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMatricula_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCod_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNascimento_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPeriodo_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNome_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCurso_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMatricula_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("TABELA DO ALUNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(322, 322, 322)))
                        .addComponent(jLabelLogo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelLogo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        jButtonVoltar.setBackground(new Color(235, 235, 235));
        jButtonVoltar.setForeground(new Color(58, 65, 84));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        jButtonVoltar.setBackground(new Color(0, 0, 0));
        jButtonVoltar.setForeground(new Color(255, 255, 255));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaAluno tla = new TelaAluno();
        tla.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTable_AlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AlunoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_AlunoMouseClicked

    private void jButtonCod_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCod_AlunoActionPerformed
        preencherTabela("select * from tbaluno order by cod_aluno");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCod_AlunoActionPerformed

    private void jButtonCod_AlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCod_AlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCod_AlunoKeyPressed

    private void jButtonNascimento_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNascimento_AlunoActionPerformed
        preencherTabela("select * from tbaluno order by data_de_nascimento_aluno");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNascimento_AlunoActionPerformed

    private void jButtonNascimento_AlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNascimento_AlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNascimento_AlunoKeyPressed

    private void jButtonPeriodo_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPeriodo_AlunoActionPerformed
        preencherTabela("select * from tbaluno order by periodo");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPeriodo_AlunoActionPerformed

    private void jButtonPeriodo_AlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPeriodo_AlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPeriodo_AlunoKeyPressed

    private void jButtonNome_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNome_AlunoActionPerformed
        preencherTabela("select * from tbaluno order by nome_aluno");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNome_AlunoActionPerformed

    private void jButtonNome_AlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNome_AlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNome_AlunoKeyPressed

    private void jButtonCurso_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCurso_AlunoActionPerformed
        preencherTabela("select * from tbaluno order by curso");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCurso_AlunoActionPerformed

    private void jButtonCurso_AlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCurso_AlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCurso_AlunoKeyPressed

    private void jButtonMatricula_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatricula_AlunoActionPerformed
        preencherTabela("select * from tbaluno order by numero_de_matricula_aluno");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMatricula_AlunoActionPerformed

    private void jButtonMatricula_AlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMatricula_AlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMatricula_AlunoKeyPressed

    /**
     * @param args the command line arguments
     */
        
    public  void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] colunas = new String[] {"   COD ", "                                  NOME ","NASCIMENTO", "           CPF",       "CELULAR", "                             ENDEREÇO ", "Nº DE MATRÍCULA ", "                                  CURSO ", "    SEXO ", " PERÍODO "};
        
       conecta.executaSQL(SQL);
        try{
            conecta.rs.first();
            do{ //Coloca os dados.
                dados.add(new Object[]{conecta.rs.getInt("cod_aluno"), conecta.rs.getString("nome_aluno"),conecta.rs.getString("data_de_nascimento_aluno"), conecta.rs.getString("cpf_aluno"), conecta.rs.getString("celular_aluno"), conecta.rs.getString("endereco_aluno"), conecta.rs.getString("numero_de_matricula_aluno"), conecta.rs.getString("curso"), conecta.rs.getString("sexo"), conecta.rs.getString("periodo")});
            }while (conecta.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\nErro:" + ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
   
        jTable_Aluno.setModel(modelo);
        jTable_Aluno.getColumnModel().getColumn(0).setPreferredWidth(60);//cod_aluno
        jTable_Aluno.getColumnModel().getColumn(0).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(1).setPreferredWidth(250);///nome_aluno
        jTable_Aluno.getColumnModel().getColumn(1).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(2).setPreferredWidth(100);//data_de_nascimento_aluno
        jTable_Aluno.getColumnModel().getColumn(2).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(3).setPreferredWidth(100);//cpf_aluno
        jTable_Aluno.getColumnModel().getColumn(3).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(4).setPreferredWidth(100);//celular_aluno
        jTable_Aluno.getColumnModel().getColumn(4).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(5).setPreferredWidth(250);//endereco_aluno
        jTable_Aluno.getColumnModel().getColumn(5).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(6).setPreferredWidth(120);//numero_de_matricula_aluno
        jTable_Aluno.getColumnModel().getColumn(6).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(7).setPreferredWidth(250);//curso
        jTable_Aluno.getColumnModel().getColumn(7).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(8).setPreferredWidth(80);//sexo
        jTable_Aluno.getColumnModel().getColumn(8).setResizable(false);
        jTable_Aluno.getColumnModel().getColumn(9).setPreferredWidth(80);//periodo
        jTable_Aluno.getColumnModel().getColumn(9).setResizable(false);
        jTable_Aluno.getTableHeader().setReorderingAllowed(false);
        jTable_Aluno.setAutoResizeMode(jTable_Aluno.AUTO_RESIZE_OFF);
        jTable_Aluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
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
            java.util.logging.Logger.getLogger(Tela_Tabela_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Tabela_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Tabela_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Tabela_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Tabela_Aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCod_Aluno;
    private javax.swing.JButton jButtonCurso_Aluno;
    private javax.swing.JButton jButtonMatricula_Aluno;
    private javax.swing.JButton jButtonNascimento_Aluno;
    private javax.swing.JButton jButtonNome_Aluno;
    private javax.swing.JButton jButtonPeriodo_Aluno;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Aluno;
    // End of variables declaration//GEN-END:variables
}