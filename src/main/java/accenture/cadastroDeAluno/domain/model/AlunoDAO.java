package accenture.cadastroDeAluno.domain.model;

import accenture.cadastroDeAluno.domain.repository.BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public List<Aluno> list() {
        List<Aluno> alunos = new ArrayList<>();

        try (Connection con = BancoDeDados.getConnection()) {
            String sql = "select * FROM aluno";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String estado = rs.getString("estado");
                String cep= rs.getString("cep");
                String telefone=rs.getString("telefone");
                String address=rs.getString("address");
                String matricula=rs.getString("matricula");

                alunos.add(new Aluno(
                        id,
                        nome,
                        idade,
                        estado,
                        cep,
                        telefone,
                        address,
                        matricula,
                ));
            }
        } catch (SQLException e) {
            System.out.println("Listagem de alunos Falhou!");
            e.printStackTrace();
        }
        return alunos;
    }
    // READ
    public Aluno getById(int id){
        Aluno aluno= new Aluno();
        try (Connection con= BancoDeDados.getConnection()){
            String sql ="SELECT * FROM aluno WHERE id=?";
            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs=stmt.executeQuery();

            if(rs.next()){
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setEstado(rs.getString("estado"));
            }
        }catch(SQLException e) {
            System.out.println("Listagem de Alunos Falhou");
            e.printStackTrace();
        }
        return aluno;
    }
    //CREATE
    public void create(Aluno aluno){
        try(Connection con = BancoDeDados.getConnection()){
            String sql ="INSERT INTO aluno(nome, idade,estado";
            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setString(1,aluno.getNome());
            stmt.setInt(2,aluno.getIdade());
            stmt.setString(3,aluno.getEstado());

            int rowsAffected=stmt.executeUpdate();
            System.out.println("Insercao bem sucedida");
        }catch(SQLException e)
        {e.printStackTrace();}
    }

    //DELETE

    public void delete(int id){
        try (Connection con=BancoDeDados.getConnection()){
            String sql="DELETE FROM aluno Where id=?";

            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setInt(1,id);
            int arrowAffected=stmt.executeUpdate();
            System.out.println("Delete Bem Sucedida");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    //UPDATE
    public void update(Aluno aluno){
        try(Connection con =BancoDeDados.getConnection()){
            String sql="UPDATE aluno SET nome=?,idade=?,estado=? WHERE id =?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,aluno.getNome());
            stmt.setInt(2,aluno.getIdade());
            stmt.setString(3,aluno.getEstado());
            stmt.setInt(4,aluno.getId());

            int rowsAffected=stmt.executeUpdate();
            System.out.println("Atualizao bem sucedida");

        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Atualizacao Falhou");
        }
    }

}