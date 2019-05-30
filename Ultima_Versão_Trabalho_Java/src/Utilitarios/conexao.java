package Utilitarios;
;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexao {

    public  static Connection conn;
    public Statement stm;
    public ResultSet rs;
    
    private String driver = "com.mysql.jdbc.Driver"; 
    private String caminho = "jdbc:mysql://localhost:3306/bdcadastro?autoReconnect=true&useSSL=false";
    private String usuario = "root";
    private String senha = "root";

    public void conectar() {
             JOptionPane.showMessageDialog(null, "Tentando conectar com banco de dados!");
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão com banco de dados bem sucedida!");
        } catch (SQLException ex){
            System.out.println("Erro ao conectar com banco de dados!\n Erro:" + ex.getMessage());
        }
    }
    
    public void desconectar(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconexão com banco de dados bem sucedida!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com banco de dados!\n Erro:" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try{
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n Erro:" + ex.getMessage());
        }
    }
}