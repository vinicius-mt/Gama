package accenture.cadastroDeAluno.domain.view;

import accenture.cadastroDeAluno.domain.controll.AlunoDAO;
import accenture.cadastroDeAluno.domain.model.Aluno;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> alunos= alunoDAO.list();
        alunos.stream().forEach(System.out::println);
        Aluno alunoParaConsulta = alunoDAO.getById(1);
        System.out.println(alunoParaConsulta);

        Aluno alunoParaInsercao =new Aluno(
                "Matheus",
                43,
                "Rua Alves",
                "SP",
                "06253240",
                "990007700",
                "1801409"
        );

        //alunoDAO.create(alunoParaInsercao);

        //alunoDAO.delete(1);

        Aluno alunoParaAtualizar =alunoDAO.getById(3);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("SP");
        alunoParaAtualizar.setCep("06253240");
        alunoParaAtualizar.setAddress("Rua Tom jobim");
        alunoParaAtualizar.setTelefone("11966537789");
        alunoParaAtualizar.setMatricula("SP");

        //alunoDAO.update(alunoParaAtualizar);

        System.out.printf("Hell0 \n");
         System.out.println();
    }
}
