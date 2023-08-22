package com.linketinder.objects

class PessoaJuridica extends Pessoa{
    String cnpj, pais

    PessoaJuridica(String nome, String email, String descricao, ArrayList<Habilidades> competencias, String cnpj, String pais, String estado, String cep) {
        super(nome, email, estado, cep, descricao, competencias)
        this.cnpj = cnpj
        this.pais = pais
    }

    @Override
    String toString() {
        return "empresa: $nome, " +
                "requisitos: $competencias, " +
                "descrição: $descricao, " +
                "contato: $email, " +
                "cnpj: $cnpj, " +
                "país: $pais, " +
                "estado: $estado, " +
                "cep: $cep"
    }
}