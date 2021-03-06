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
public class Tela_Tabela_Professor extends javax.swing.JFrame {
    conexao conecta = new conexao();
    /**
     * Creates new form Tela_Tabela_Aluno
     */
    public Tela_Tabela_Professor() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        preencherTabela("select * from tbprofessor order by cod_prof");
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
        jTable_Professor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonCod_Professor = new javax.swing.JButton();
        jButtonNascimento_Professor = new javax.swing.JButton();
        jButtonEixo_de_Atuacao_Professor = new javax.swing.JButton();
        jButtonNome_Professor = new javax.swing.JButton();
        jButtonEscolaridade_Prof = new javax.swing.JButton();
        jButtonAno_de_Admissao_Prof = new javax.swing.JButton();
        jButtonSalario_Prof = new javax.swing.JButton();
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

        jTable_Professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Professor.getTableHeader().setReorderingAllowed(false);
        jTable_Professor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProfessorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Professor);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "ALTERAR ORDEM DA TABELA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButtonCod_Professor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCod_Professor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCod_Professor.setText("CÓDIGO");
        jButtonCod_Professor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonCod_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCod_ProfessorActionPerformed(evt);
            }
        });
        jButtonCod_Professor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCod_ProfessorKeyPressed(evt);
            }
        });

        jButtonNascimento_Professor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNascimento_Professor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNascimento_Professor.setText("NASCIMENTO");
        jButtonNascimento_Professor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonNascimento_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNascimento_ProfessorActionPerformed(evt);
            }
        });
        jButtonNascimento_Professor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNascimento_ProfessorKeyPressed(evt);
            }
        });

        jButtonEixo_de_Atuacao_Professor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEixo_de_Atuacao_Professor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEixo_de_Atuacao_Professor.setText("EIXO DE ATUAÇÂO");
        jButtonEixo_de_Atuacao_Professor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonEixo_de_Atuacao_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEixo_de_Atuacao_ProfessorActionPerformed(evt);
            }
        });
        jButtonEixo_de_Atuacao_Professor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEixo_de_Atuacao_ProfessorKeyPressed(evt);
            }
        });

        jButtonNome_Professor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNome_Professor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNome_Professor.setText("NOME");
        jButtonNome_Professor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonNome_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNome_ProfessorActionPerformed(evt);
            }
        });
        jButtonNome_Professor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNome_ProfessorKeyPressed(evt);
            }
        });

        jButtonEscolaridade_Prof.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEscolaridade_Prof.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEscolaridade_Prof.setText("ESCOLARIDADE");
        jButtonEscolaridade_Prof.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonEscolaridade_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscolaridade_ProfActionPerformed(evt);
            }
        });
        jButtonEscolaridade_Prof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEscolaridade_ProfKeyPressed(evt);
            }
        });

        jButtonAno_de_Admissao_Prof.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAno_de_Admissao_Prof.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAno_de_Admissao_Prof.setText("ANO DE ADMISSÃO");
        jButtonAno_de_Admissao_Prof.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonAno_de_Admissao_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAno_de_Admissao_ProfActionPerformed(evt);
            }
        });
        jButtonAno_de_Admissao_Prof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAno_de_Admissao_ProfKeyPressed(evt);
            }
        });

        jButtonSalario_Prof.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalario_Prof.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalario_Prof.setText("SALÁRIO");
        jButtonSalario_Prof.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonSalario_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalario_ProfActionPerformed(evt);
            }
        });
        jButtonSalario_Prof.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSalario_ProfKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCod_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNome_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNascimento_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEixo_de_Atuacao_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEscolaridade_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAno_de_Admissao_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalario_Prof, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCod_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNascimento_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEixo_de_Atuacao_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNome_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEscolaridade_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAno_de_Admissao_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalario_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("TABELA DO PROFESSOR");

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
                                .addComponent(jLabel1)
                                .addGap(255, 255, 255)))
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
                        .addComponent(jLabel1)
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
        TelaProfessor tla = new TelaProfessor();
        tla.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTable_ProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProfessorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ProfessorMouseClicked

    private void jButtonCod_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCod_ProfessorActionPerformed
        preencherTabela("select * from tbprofessor order by cod_prof");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCod_ProfessorActionPerformed

    private void jButtonCod_ProfessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCod_ProfessorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCod_ProfessorKeyPressed

    private void jButtonNascimento_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNascimento_ProfessorActionPerformed
        preencherTabela("select * from tbprofessor order by data_de_nascimento_prof");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNascimento_ProfessorActionPerformed

    private void jButtonNascimento_ProfessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNascimento_ProfessorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNascimento_ProfessorKeyPressed

    private void jButtonEixo_de_Atuacao_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEixo_de_Atuacao_ProfessorActionPerformed
        preencherTabela("select * from tbprofessor order by Eixo_de_atuacao");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEixo_de_Atuacao_ProfessorActionPerformed

    private void jButtonEixo_de_Atuacao_ProfessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEixo_de_Atuacao_ProfessorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEixo_de_Atuacao_ProfessorKeyPressed

    private void jButtonNome_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNome_ProfessorActionPerformed
        preencherTabela("select * from tbprofessor order by nome_prof");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNome_ProfessorActionPerformed

    private void jButtonNome_ProfessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNome_ProfessorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNome_ProfessorKeyPressed

    private void jButtonEscolaridade_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscolaridade_ProfActionPerformed
        preencherTabela("select * from tbprofessor order by Escolaridade");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEscolaridade_ProfActionPerformed

    private void jButtonEscolaridade_ProfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEscolaridade_ProfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEscolaridade_ProfKeyPressed

    private void jButtonAno_de_Admissao_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAno_de_Admissao_ProfActionPerformed
        preencherTabela("select * from tbprofessor order by admissao");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAno_de_Admissao_ProfActionPerformed

    private void jButtonAno_de_Admissao_ProfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAno_de_Admissao_ProfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAno_de_Admissao_ProfKeyPressed

    private void jButtonSalario_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalario_ProfActionPerformed
        preencherTabela("select * from tbprofessor order by SALARIO");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalario_ProfActionPerformed

    private void jButtonSalario_ProfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSalario_ProfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalario_ProfKeyPressed

    /**
     * @param args the command line arguments
     */
        
    public  void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] colunas = new String[] {"   COD ", "                                  NOME ","NASCIMENTO", "           CPF", "    CELULAR", "                             ENDEREÇO ", "Nº DE MATRÍCULA ","ESCOLARIDADE","      SALARIO","ANO DE ADMISSÃO","NATURALIDADE","                        EIXO DE ATUAÇÃO", "    SEXO"};
        
       conecta.executaSQL(SQL);
        try{
            conecta.rs.first();
            do{ //Coloca os dados.
                dados.add(new Object[]{conecta.rs.getInt("cod_prof"), conecta.rs.getString("nome_prof"), conecta.rs.getString("data_de_nascimento_prof"),conecta.rs.getString("cpf_prof"), conecta.rs.getString("celular_prof"), conecta.rs.getString("endereco_prof"), conecta.rs.getString("numero_de_matricula_prof"), conecta.rs.getString("escolaridade"), conecta.rs.getString("salario"), conecta.rs.getString("admissao"),conecta.rs.getString("naturalidade"),conecta.rs.getString("eixo_de_atuacao"),conecta.rs.getString("sexo")});
            }while (conecta.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\nErro:" + ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
   
        jTable_Professor.setModel(modelo);
        jTable_Professor.getColumnModel().getColumn(0).setPreferredWidth(60);//cod_prof
        jTable_Professor.getColumnModel().getColumn(0).setResizable(true);
        jTable_Professor.getColumnModel().getColumn(1).setPreferredWidth(250);//nome_prof
        jTable_Professor.getColumnModel().getColumn(1).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(2).setPreferredWidth(100);//data_de_nascimento_prof
        jTable_Professor.getColumnModel().getColumn(2).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(3).setPreferredWidth(100);//cpf_prof
        jTable_Professor.getColumnModel().getColumn(3).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(4).setPreferredWidth(100);//celular_prof
        jTable_Professor.getColumnModel().getColumn(4).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(5).setPreferredWidth(250);//endereço_prof
        jTable_Professor.getColumnModel().getColumn(5).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(6).setPreferredWidth(120);//numero_de_matricula_prof
        jTable_Professor.getColumnModel().getColumn(6).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(7).setPreferredWidth(110);//escolaridade
        jTable_Professor.getColumnModel().getColumn(7).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(8).setPreferredWidth(100);//salario
        jTable_Professor.getColumnModel().getColumn(8).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(9).setPreferredWidth(120);//admissão
        jTable_Professor.getColumnModel().getColumn(9).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(10).setPreferredWidth(110);//naturalidade
        jTable_Professor.getColumnModel().getColumn(10).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(11).setPreferredWidth(250);//eixo_de_atuação
        jTable_Professor.getColumnModel().getColumn(11).setResizable(false);
        jTable_Professor.getColumnModel().getColumn(12).setPreferredWidth(80);//sexo
        jTable_Professor.getColumnModel().getColumn(12).setResizable(false);
        jTable_Professor.getTableHeader().setReorderingAllowed(false);
        jTable_Professor.setAutoResizeMode(jTable_Professor.AUTO_RESIZE_OFF);
        jTable_Professor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(Tela_Tabela_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Tabela_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Tabela_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Tabela_Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Tabela_Professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAno_de_Admissao_Prof;
    private javax.swing.JButton jButtonCod_Professor;
    private javax.swing.JButton jButtonEixo_de_Atuacao_Professor;
    private javax.swing.JButton jButtonEscolaridade_Prof;
    private javax.swing.JButton jButtonNascimento_Professor;
    private javax.swing.JButton jButtonNome_Professor;
    private javax.swing.JButton jButtonSalario_Prof;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Professor;
    // End of variables declaration//GEN-END:variables
}
