package accenture.cadastroDeAluno.domain.model;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("nome", 10, "21/12/2022", "T4I", "12345");
        System.out.printf("Hell0 \n");
        System.out.println(aluno2);
    }
}
