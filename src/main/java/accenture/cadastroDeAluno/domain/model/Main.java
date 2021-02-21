package accenture.cadastroDeAluno.domain.model;

import accenture.cadastroDeAluno.domain.repository.BancoDeDados;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Aluno aluno2 = new Aluno("nome", 10,"12345");
        try (Connection con = BancoDeDados.getConnection()) {
            System.out.println("Sucesso !!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.printf("Hell0 \n");
        System.out.println(aluno2);
        System.out.println();
    }
}
