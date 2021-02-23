package accenture.cadastroDeAluno.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Aluno {

    String nome;
    int idade;
    String address;
    String uf;
    String cep;
    String telefone;
    String matricula;

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getAddress() {
        return address;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //    public Aluno(String nome, int idade, String matricula ) {
//        this.nome = nome;
//        this.idade = idade;
//        this.matricula=matricula;
//    }

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
