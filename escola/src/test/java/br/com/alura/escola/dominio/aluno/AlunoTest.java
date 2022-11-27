package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new Aluno(new CPF("123.456.789-10"), "Fulano da Silva", new Email("fulano@email.com"));
    }
    @Test
    void deveriaPermitirCadastrar1Numeros() {
        this.aluno.adicionarTelefone("11","111111111");
        assertEquals(1, aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirCadastrar2Numeros() {
        this.aluno.adicionarTelefone("22","222222222");
        this.aluno.adicionarTelefone("33","333333333");
        assertEquals(2, aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirCadastrar2Numeros() {
        assertThrows(TelefoneMaximoException.class, () -> {
            this.aluno.adicionarTelefone("44", "444444444");
            this.aluno.adicionarTelefone("55", "555555555");
            this.aluno.adicionarTelefone("66", "666666666");
        });
    }


}