package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCpsComCpfInfalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("1"));
    }

    @Test
    void deveriaPermitirCriarCPFValido() {
        String numero = "610.242.272-43";
        CPF cpf = new CPF(numero);
        assertNotNull(cpf);
        assertEquals(numero,cpf.getNumero());
    }
}