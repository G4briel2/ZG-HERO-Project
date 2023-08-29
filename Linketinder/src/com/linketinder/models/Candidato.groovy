package com.linketinder.models

class Candidato extends Pessoa{
    String cpf
    int idade

    Candidato(String nome, String email, String estado, String cep, String descricao, ArrayList<Habilidades> competencias, String cpf, int idade) {
        super(nome, email, estado, cep, descricao, competencias)
        this.cpf = cpf
        this.idade = idade
    }

    @Override
    String toString() {
        return "candidato: $nome, " +
                "skills: $competencias, " +
                "bio: $descricao, " +
                "e-mail: $email, " +
                "$idade anos, " +
                "cpf: $cpf, " +
                "estado: $estado, " +
                "cep: $cep"
    }
}