package accenture.cadastroDeAluno.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Aluno {

    String nome;
    int idade;
    String dataNascimento;
    String matricula;
    String rg;
    String cpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String telefone;
    String turma;

    public Aluno(){

    }
    public Aluno(String nome, int idade, String dataMatricula, String turma, String matricula ) {
        this.nome = nome;
        this.idade = idade;
        this.dataMatricula = dataMatricula;
        this.turma = turma;
        this.matricula=matricula;
    }

//    @NonNull
//    public String nome;
//    public String chaveDeRelacionamento;
//    @NonNull
//    public String endereco;
//    @NonNull
//    public int ddd;
//    @NonNull
//    public int celular;
//    public double prova1 = 0;
//    public double prova2 = 0;
//    public double notaTrabalho = 0;
//    public double notaApresentacao = 0;
//    @NonNull
//    public Curso curso;


    public Aluno(String nome) {
        this.nome = nome;
    }

}
