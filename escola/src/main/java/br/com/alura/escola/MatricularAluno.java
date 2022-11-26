package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {
    public static void main(String[] args) {
        String nome = "Fulano da silva";
        CPF cpf = new CPF("123.456.789-00");
        Email email = new Email("fulano@email.com");

        Aluno aluno = new Aluno(cpf, nome, email);

        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        repositorioDeAlunos.matricular(aluno);
    }
}