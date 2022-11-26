package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDInvalidos() {
        assertThrows(IllegalArgumentException.class,() -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class,() -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class,() -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumeroInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "12"));
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValido() {
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        assertNotNull(telefone);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}