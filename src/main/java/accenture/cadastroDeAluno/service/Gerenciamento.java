package accenture.cadastroDeAluno.service;

import accenture.cadastroDeAluno.domain.model.Aluno;
import accenture.cadastroDeAluno.domain.model.Curso;
import accenture.cadastroDeAluno.domain.repository.BancoDeDados;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Gerenciamento{

    private final BancoDeDados bancoDeDados;

    public Gerenciamento(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void upsertAluno(Aluno aluno){
        log.info(aluno.getNome() + " foi cadastrado no sistema");
//        bancoDeDados.save(aluno);
    }

    public void cadastrarCurso(Curso curso){

    }

    public double calcularMedia(double nota1, double nota2, double notaTrabalho, double notaApresentacao){
        return (nota1 + nota2 + notaApresentacao + notaTrabalho) / 4 ;
    }

//    public String verificarAprovacao(Aluno aluno){
//        String conceito = "reprovado";
//        double media = calcularMedia(aluno.prova1, aluno.prova2, aluno.notaTrabalho, aluno.notaApresentacao);
//        if(media >= 90){
//            conceito = "A";
//        }
//        if (80 <= media && media < 90 ){
//            conceito = "B";
//        }
//        if (70 <= media && media < 80 ){
//            conceito = "C";
//        }
//        if (60 <= media && media < 70 ){
//            conceito = "D";
//        }
//
//        return aluno.nome + " está " + conceito + ".";
//    }


}
