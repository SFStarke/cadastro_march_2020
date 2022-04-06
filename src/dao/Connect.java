package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dto.Subject;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class Connect {
//1º Atribuir Classes; de conecção e de preparo de declaração.

    private Connection conn;
    private PreparedStatement ps;
    
/* 2º Criar método de conecção com o Driver da biblioteca e localhost.
Este método em particular foi criado pensando no uso e jTable na classe Main da package view.
 */
public Connection connectio(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cadastro_march_2022","root",""
            );
        return conn;
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "ERRO NA CONECÇÃO...");
        return null;
    }
}

//3º Criar métodos CreateReadUpdateDelete.
    public boolean insert(Subject get) { 
        try {
            ps = conn.prepareStatement(
                 "insert into pessoa(cpf,nome,sobrenome,email,fone,logradouro) values(?,?,?,?,?,?)"
            );
            ps.setString(1, get.getCpf());
            ps.setString(2, get.getNome());
            ps.setString(3, get.getSobrenome());
            ps.setString(4, get.getEmail());
            ps.setString(5, get.getFone());
            ps.setString(6, get.getLogradouro());
            ps.execute();
            return true;
        } catch (SQLException e) {
JOptionPane.showMessageDialog(null, "ERRO AO CRIAR CONTACTO...\nConfira redundância no nº de CPF.");
            return false;
        }
    }

    public ArrayList<Subject> select() {
/*ATENÇÃO: Este método não será implementado. Não obstante, 
 *permanece para simples conferência em sua lógica de sintaxe.
 */
        ArrayList<Subject> list = new ArrayList();

        try {
            ps = conn.prepareStatement("select from pessoa");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Subject pessoa = new Subject(
                        rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),rs.getString(7)
                );
                list.add(pessoa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR CONTACTO...");
        }

        return list;
    }

    public boolean update(Subject get) {
        try {
            ps = conn.prepareStatement(
                    "update pessoa set cpf = ?,nome = ?,sobrenome = ?,email = ?,"
                            + "fone = ?,logradouro = ? where id = ?"
            );
            ps.setString(1, get.getCpf());
            ps.setString(2, get.getNome());
            ps.setString(3, get.getSobrenome());
            ps.setString(4, get.getEmail());
            ps.setString(5, get.getFone());
            ps.setString(6, get.getLogradouro());
            ps.setInt(7, get.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "ERRO NA ATUALIZAÇÃO DO CONTACTO...");
            return false;
        }
    }
    
    public boolean delete(int numero){
        try {
            ps = conn.prepareStatement("delete from pessoa where id = ?");
            ps.setInt(1, numero);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO EM EXCLUIR CONTACTO...");
            return false;
        }
    }

}
