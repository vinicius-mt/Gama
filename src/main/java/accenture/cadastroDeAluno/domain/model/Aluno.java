package accenture.cadastroDeAluno.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Aluno {
    int id;
    String nome;
    int idade;
    String address;
    String estado;
    String cep;
    String telefone;
    String matricula;

    public Aluno(){

    }

    public Aluno(int id, String nome, int idade, String address, String estado, String cep, String telefone, String matricula) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.address = address;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String address, String estado, String cep, String telefone, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.address = address;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.matricula = matricula;
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

    public String getEstado() {
        return estado;
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
    public int getId(int id){
        return id;
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

    public void setEstado(String Estado) {
        this.estado = estado;
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

    public void setId(int id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", address='" + address + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", telefone='" + telefone + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
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




}
