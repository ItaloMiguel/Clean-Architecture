package br.com.alura.escola.dominio.aluno;


import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoNaoEncontrato extends RuntimeException {

    public AlunoNaoEncontrato(CPF cpf) {
        super("Aluno não encontrado com CPF:" + cpf.getNumero());
    }
}
