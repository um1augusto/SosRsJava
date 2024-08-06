/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sosrs;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doenca;
import model.DoencaDAO;

/**
 *
 * @author 03824366010
 */
public class PesquisaDoenca extends javax.swing.JFrame {

    /**
     * Creates new form PesquisaDoenca
     */
    public PesquisaDoenca() {
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

        TodosPanel = new javax.swing.JPanel();
        PanelSos = new javax.swing.JPanel();
        sosRS = new javax.swing.JLabel();
        PanelDescricao = new javax.swing.JPanel();
        jLabelDigitarDoenca = new javax.swing.JLabel();
        txtEscreverDoenca = new javax.swing.JTextField();
        jScrollTabelaDoenca = new javax.swing.JScrollPane();
        jTableDoenca = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sosRS.setFont(new java.awt.Font("Sitka Subheading", 0, 40)); // NOI18N
        sosRS.setText("SOS RS");

        javax.swing.GroupLayout PanelSosLayout = new javax.swing.GroupLayout(PanelSos);
        PanelSos.setLayout(PanelSosLayout);
        PanelSosLayout.setHorizontalGroup(
            PanelSosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sosRS)
                .addGap(128, 128, 128))
        );
        PanelSosLayout.setVerticalGroup(
            PanelSosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sosRS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabelDigitarDoenca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDigitarDoenca.setText("Digite a doença:");

        txtEscreverDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscreverDoencaActionPerformed(evt);
            }
        });

        jTableDoenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Doença"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollTabelaDoenca.setViewportView(jTableDoenca);
        if (jTableDoenca.getColumnModel().getColumnCount() > 0) {
            jTableDoenca.getColumnModel().getColumn(0).setResizable(false);
            jTableDoenca.getColumnModel().getColumn(1).setResizable(false);
        }

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Alterar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout PanelDescricaoLayout = new javax.swing.GroupLayout(PanelDescricao);
        PanelDescricao.setLayout(PanelDescricaoLayout);
        PanelDescricaoLayout.setHorizontalGroup(
            PanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescricaoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(txtEscreverDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDescricaoLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(PanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDescricaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnVoltar)
                        .addGap(37, 37, 37)
                        .addComponent(btnExcluir)
                        .addGap(32, 32, 32)
                        .addComponent(btnCancelar))
                    .addComponent(jLabelDigitarDoenca)
                    .addComponent(jScrollTabelaDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        PanelDescricaoLayout.setVerticalGroup(
            PanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDescricaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelDigitarDoenca)
                .addGap(18, 18, 18)
                .addGroup(PanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEscreverDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollTabelaDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(PanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout TodosPanelLayout = new javax.swing.GroupLayout(TodosPanel);
        TodosPanel.setLayout(TodosPanelLayout);
        TodosPanelLayout.setHorizontalGroup(
            TodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TodosPanelLayout.setVerticalGroup(
            TodosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodosPanelLayout.createSequentialGroup()
                .addComponent(PanelSos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TodosPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TodosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEscreverDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscreverDoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscreverDoencaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Obtém o índice da linha selecionada na tabela
    int selectedRow = jTableDoenca.getSelectedRow();

    // Verifica se alguma linha foi selecionada
    if (selectedRow >= 0) {
        // Obtém o ID da doença a partir da tabela (supondo que o ID esteja na primeira coluna)
        int idDoenca = (int) jTableDoenca.getValueAt(selectedRow, 0);

        // Cria uma instância de DoencaDAO e exclui a doença pelo ID
        DoencaDAO doencaDAO = new DoencaDAO();
        try {
            doencaDAO.deleteDoenca(idDoenca);

            // Atualiza a tabela após a exclusão
            ((DefaultTableModel) jTableDoenca.getModel()).setRowCount(0); // Limpa a tabela
            List<Doenca> doencas = doencaDAO.getAllDoencas(); // Obtém todas as doenças restantes
            for (Doenca doenca : doencas) {
                ((DefaultTableModel) jTableDoenca.getModel()).addRow(new Object[]{doenca.getId(), doenca.getDoenca()});
            }

            JOptionPane.showMessageDialog(this, "Doença excluída com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir a doença: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Nenhuma doença selecionada para exclusão.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // Obtém o índice da linha selecionada na tabela
    int selectedRow = jTableDoenca.getSelectedRow();

    // Verifica se alguma linha foi selecionada
    if (selectedRow >= 0) {
        // Obtém o ID da doença a partir da tabela (supondo que o ID esteja na primeira coluna)
        int idDoenca = (int) jTableDoenca.getValueAt(selectedRow, 0);

        // Cria uma instância de DoencaDAO e busca a doença pelo ID
        DoencaDAO doencaDAO = new DoencaDAO();
        try {
            Doenca doenca = doencaDAO.getDoencaById(idDoenca);
            
            // Cria uma nova instância da tela CadastroDoenca e passa a doença selecionada
            CadastroDoenca cadastroDoenca = new CadastroDoenca(doenca);
            cadastroDoenca.setVisible(true);
            
            // Fecha a tela atual (PesquisaDoenca)
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a doença para alteração: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Nenhuma doença selecionada para alteração.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Captura o texto inserido no campo de pesquisa
    String pesquisaDescricao = txtEscreverDoenca.getText();

    // Verifica se o campo de pesquisa não está vazio
    if (!pesquisaDescricao.isEmpty()) {
        // Cria uma instância de DoencaDAO e busca as doenças pelo nome
        DoencaDAO doencaDAO = new DoencaDAO();
        try {
            List<Doenca> doencas = doencaDAO.searchDoencasByName(pesquisaDescricao);
            DefaultTableModel model = (DefaultTableModel) jTableDoenca.getModel();
            model.setRowCount(0); // Limpa a tabela antes de adicionar os novos dados

            // Adiciona os resultados na tabela
            for (Doenca doenca : doencas) {
                model.addRow(new Object[]{doenca.getId(), doenca.getDoenca()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar as doenças: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "O campo de pesquisa não pode estar vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    public void carregarTabelaDoencas() {
    DoencaDAO doencaDAO = new DoencaDAO();
    try {
        List<Doenca> doencas = doencaDAO.getAllDoencas();
        DefaultTableModel model = (DefaultTableModel) jTableDoenca.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar os dados

        for (Doenca doenca : doencas) {
            model.addRow(new Object[]{doenca.getId(), doenca.getDoenca()});
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar os dados das doenças: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

    
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
            java.util.logging.Logger.getLogger(PesquisaDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaDoenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDescricao;
    private javax.swing.JPanel PanelSos;
    private javax.swing.JPanel TodosPanel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabelDigitarDoenca;
    private javax.swing.JScrollPane jScrollTabelaDoenca;
    private javax.swing.JTable jTableDoenca;
    private javax.swing.JLabel sosRS;
    private javax.swing.JTextField txtEscreverDoenca;
    // End of variables declaration//GEN-END:variables
}
