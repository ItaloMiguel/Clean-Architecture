package br.com.alura.escola.aplicacao.matricula;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public class MatricularAlunoRequest {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoRequest(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }


    public Aluno criarAluno() {
        return new Aluno(
                new CPF(cpfAluno),
                nomeAluno,
                new Email(emailAluno)
        );
    }
}
