package com.linketinder.features

import com.linketinder.models.Habilidades

class FeaturesManager{
    CandidatoFeatures candidato = new CandidatoFeatures()
    EmpresaFeatures empresa = new EmpresaFeatures()

    def listarCandidatos(){
        candidato.listar()
    }

    def listarEmpresas(){
        empresa.listar()
    }

    def cadastrarCandidatos(String nome, String email, String estado, String cep, String descricao, ArrayList<Habilidades> habilidades, String cpf, int idade){
        candidato.cadastrar(nome, email, estado, cep, descricao, habilidades, cpf, idade)
    }

    def cadastrarEmpresas(String nome, String email, String descricao, ArrayList<Habilidades> competencias, String cnpj, String pais, String estado, String cep) {
        empresa.cadastrar(nome, email, descricao, competencias, cnpj, pais, estado, cep)
    }
}
