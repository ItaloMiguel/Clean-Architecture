package br.com.alura.escola;

import br.com.alura.escola.aplicacao.matricula.MatricularAluno;
import br.com.alura.escola.aplicacao.matricula.MatricularAlunoRequest;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Fulano da silva";
        String cpf = "123.456.789-10";
        String email = "fulano@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executa(new MatricularAlunoRequest(nome, cpf, email));
    }
}
