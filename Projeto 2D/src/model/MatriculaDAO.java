package model;

import model.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;


public class MatriculaDAO {
    private Connection con;
    
    public MatriculaDAO(){
        con = new Conexao().conectar();
    }
    
    public ArrayList<Matricula> listar(){
        String sql = "SELECT * FROM matricula";
        ArrayList<Matricula> matriculas;
        matriculas = new ArrayList<Matricula>();
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Matricula m = new Matricula();
            m.setId(rs.getInt("id"));
            m.setAluno(rs.getString("aluno"));
            m.setRg(rs.getInt("rg"));
            m.setResponsavel(getString("responsavel"));
            m.setNis(getInt("nis"));
            m.setIdade(getInt("idade"));
            m.setEmail(getString("email"));
            Matricula.add (m);
        }
            
    }catch (Exception e) {
            System.out.println (e.getMessage());
    } 
        ArrayList<Matricula> matricula = null;
      return matriculas;
    }
    
    public void inserir(Matricula m){
        String sql = "INSETE INTO matricula(aluno,rg,responsavel,nis,idade,email) VALUES(?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,m.getAluno());
            ps.setInt(2, m.getRg());
            ps.setString(3, m.getResponsavel());
            ps.setInt(4, m.getNis());
            ps.setInt(5, m.getIdade());
            ps.setString(6, m.getEmail());
            ps.execute();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void atualizar(Matricula m){
        String sql = "UPDATE matricula SET aluno=?,rg=?,responsavel=?,nis=?,idade=?,email=? WHERE id=?";
        try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, m.getAluno());
                ps.setInt(2, m.getRg());
                ps.setInt(3, m.getId());
                ps.setString(4, m.getResponsavel());
                ps.setInt(5, m.getNis());
                ps.setInt( 6, m.getIdade());
                ps.setString(7, m.getEmail());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Matricula atualizada com sucesso!");
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void excluir(Matricula m){
        String sql = "DELETE FROM matricula WHERE id=?";
        try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, m.getId());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Matricula excluida com sucesso!");
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}

