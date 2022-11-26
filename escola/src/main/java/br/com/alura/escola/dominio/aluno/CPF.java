package br.com.alura.escola.dominio.aluno;

import java.util.Objects;

public class CPF {
    private static final String REGEX = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";

    private String numero;

    public CPF(String numero) {
        if(numero == null || !numero.matches(REGEX)) {
            throw  new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "CPF{" +
                "numero='" + numero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CPF cpf)) return false;
        return Objects.equals(numero, cpf.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
