package view;

import javax.swing.table.DefaultTableModel;
import dto.Subject;
import dao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class Main extends javax.swing.JFrame {
    DefaultTableModel table = new DefaultTableModel();
    Connect dao = new Connect();
    Subject dto = new Subject();
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    

    public Main() {
        initComponents();
        conn = dao.connectio();
        setLocationRelativeTo(null);
        table = (DefaultTableModel) jTable.getModel();
        clean();
    }
    
    private void search_cpf(){//Busca pelo cpf e resultado aparece na jTable.
        try {
            ps = conn.prepareStatement(
"select id,cpf,nome,sobrenome,email,fone,logradouro from pessoa where cpf like ?"
            );
            ps.setString(1, txtCpf.getText()+ "%");
            rs = ps.executeQuery();
            
    ((DefaultTableModel)jTable.getModel()).setRowCount(0);//Limpa jTable.
        while(rs.next()){
            table.insertRow(table.getRowCount(), new Object[]{rs.getString(1),
            rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
            rs.getString(6),rs.getString(7)});
        }
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);    
        }
    }
    
    private void search_name(){//Busca pelo nome e resultado aparece na jTable.
        try {
            ps = conn.prepareStatement(
"select id,cpf,nome,sobrenome,email,fone,logradouro from pessoa where nome like ?"
            );
            ps.setString(1, txtNome.getText()+ "%");
            rs = ps.executeQuery();
            
    ((DefaultTableModel)jTable.getModel()).setRowCount(0);//Limpa jTable.
        while(rs.next()){
            table.insertRow(table.getRowCount(),new Object[]{rs.getString(1),
            rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
            rs.getString(6),rs.getString(7)});
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void settext(){//Preenche os campos"txt" quando selecionado em jTable.
        int numero = jTable.getSelectedRow(); //"numero" da linha da jTable.
//ATENÇÃO: Em jTable as colunas começam com o nº "0" CPF == 0/ Nome == 1...
        txtId.setText(jTable.getModel().getValueAt(numero,0).toString());
        txtCpf.setText(jTable.getModel().getValueAt(numero,1).toString());
        txtNome.setText(jTable.getModel().getValueAt(numero,2).toString());
        txtSobrenome.setText(jTable.getModel().getValueAt(numero,3).toString());
        txtEmail.setText(jTable.getModel().getValueAt(numero, 4).toString());
        txtFone.setText(jTable.getModel().getValueAt(numero, 5).toString());
        txtLogradouro.setText(jTable.getModel().getValueAt(numero, 6).toString());
        
    btnCreate.setEnabled(false);
    }
    
    private void clean(){
        txtId.setText(null);
        txtCpf.setText(null);
        txtNome.setText("");
        txtSobrenome.setText(null);
        txtEmail.setText("");
        txtFone.setText("");
        txtLogradouro.setText(null);
        search_cpf();
        btnCreate.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Pessoal");
        setResizable(false);

        jTable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF", "Nome", "Sobrenome", "E-Mail", "Fone", "Logradouro"
            }
        ));
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        txtCpf.setToolTipText("Campo de pesquisa");
        txtCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        txtNome.setToolTipText("Campo de pesquisa");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        jLabel1.setText("<html><font color = red>*</font color>CPF</html>");

        jLabel2.setText("<html><font color = red>*</font color>Nome</html>");

        jLabel3.setText("<html><font color = red>*</font color>Sobrenome</html>");

        btnCreate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(0, 153, 51));
        btnCreate.setText("Adicionar");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 153));
        btnUpdate.setText("Atualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(204, 0, 0));
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClean.setText("Restaurar Campos");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("<html><font size = 5>*</font size> Camos obrigatórios de preenchimento.");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Faça sua busca instantânea atravéz do CPF e/ou Nome.");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        jLabel6.setText("ID Cadastral");

        txtId.setFont(new java.awt.Font("sansserif", 0, 8)); // NOI18N
        txtId.setEnabled(false);

        jLabel7.setText("E-mail");

        jLabel8.setText("<html><font color = red>*</font color>Fone</html>");

        jLabel9.setText("<html><font color = red>*</font color>Logradouro</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLogradouro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnClean))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClean))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if ((txtCpf.getText().equals(""))||(txtNome.getText().equals(""))||
                (txtSobrenome.getText().equals(""))||(txtFone.getText().equals(""))
                ||(txtLogradouro.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
        String id, cpf, nome, sobrenome, email, fone, logradouro;
        cpf = txtCpf.getText();
        nome = txtNome.getText();
        sobrenome = txtSobrenome.getText();
        email = txtEmail.getText();
        fone = txtFone.getText();
        logradouro = txtLogradouro.getText();
        
        dto.setCpf(cpf);
        dto.setNome(nome);
        dto.setSobrenome(sobrenome);
        dto.setEmail(email);
        dto.setFone(fone);
        dto.setLogradouro(logradouro);
        
        dao.insert(dto);
        clean();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
// "btn"Função do mouse / txtNome / Eventos / Key / KetReleased.        
        search_name();
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
// "btn"Função do mouse / txtCpf / Eventos / Key / KetReleased.        
        search_cpf();
    }//GEN-LAST:event_txtCpfKeyReleased

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
//"btn"Função do mouse / jTable / Eventos / Mouse / MouseClicked. 
        settext();
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_jTableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       if ((txtCpf.getText().equals(""))||(txtNome.getText().equals(""))||(txtSobrenome.getText().equals(""))
               ||(txtFone.getText().equals(""))||(txtLogradouro.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
        dto.setId(Integer.parseInt(txtId.getText()));
        dto.setCpf(txtCpf.getText());
        dto.setNome(txtNome.getText());
        dto.setSobrenome(txtSobrenome.getText());
        dto.setEmail(txtEmail.getText());
        dto.setFone(txtFone.getText());
        dto.setLogradouro(txtLogradouro.getText());
        
        dao.update(dto);
        clean();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
       clean();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int conf = JOptionPane.showConfirmDialog(null, "<html>Excluir <strong>"+
txtNome.getText()+"</strong> do cadastro?</html>","ATENÇÃO",JOptionPane.YES_NO_OPTION
        );
        if (conf == JOptionPane.YES_OPTION) {
            
        String id = txtId.getText();
        
        dao.delete(Integer.parseInt(id));
        clean();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
