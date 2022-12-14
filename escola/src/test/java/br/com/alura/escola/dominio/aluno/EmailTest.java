package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("aa"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        String endereco = "emailqualquer@gmail.com";
        Email email = new Email(endereco);
        assertNotNull(email);
        assertEquals(endereco, email.getEndereco());
    }

}