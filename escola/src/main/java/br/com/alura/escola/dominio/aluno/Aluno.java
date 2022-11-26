package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String name;
    private Email email;
    private Telefone telefone;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String telefone) {
        this.telefones.add(new Telefone(ddd, telefone));
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Telefone> getTelefones() {
        return this.telefones;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", telefone=" + telefone +
                ", telefones=" + telefones +
                '}';
    }
}
