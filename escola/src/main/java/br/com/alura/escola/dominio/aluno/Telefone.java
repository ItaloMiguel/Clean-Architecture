package br.com.alura.escola.dominio.aluno;

public class Telefone {
    private static final String REGEX_DDD = "\\d{2}";
    private static final String REGEX_NUMERO = "\\d{8}|\\d{9}";

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e numero são obrigatorios");
        }

        if(!ddd.matches(REGEX_DDD)) {
            throw new IllegalArgumentException("DDD inválido!");
        }

        if (!numero.matches(REGEX_NUMERO)) {
            throw new IllegalArgumentException("Número inálido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
