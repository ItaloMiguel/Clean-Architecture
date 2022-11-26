package br.com.alura.escola.aplicacao.matricula;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno userCase = new MatricularAluno(repositorio);

        MatricularAlunoRequest dados = new MatricularAlunoRequest(
                "Fulano",
                "123.456.789-10",
                "fulano@email.com");
        userCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-10"));

        assertEquals("Fulano", encontrado.getName());
        assertEquals("fulano@email.com", encontrado.getEmail());
        assertEquals("123.456.789-10", encontrado.getCpf());
    }
}