package accenture.cadastroDeAluno.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

//apagar essa linha

@Getter
@Setter
public class Aluno {
    @NonNull
    public String nome;
    public String chaveDeRelacionamento;
    @NonNull
    public String endereco;
    @NonNull
    public int ddd;
    @NonNull
    public int celular;
    public double prova1 = 0;
    public double prova2 = 0;
    public double notaTrabalho = 0;
    public double notaApresentacao = 0;
    @NonNull
    public Curso curso;


    public Aluno(String nome) {
        this.nome = nome;
    }

}
