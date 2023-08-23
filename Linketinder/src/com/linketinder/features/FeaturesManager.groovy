package com.linketinder.features

class FeaturesManager{
    PessoaFisicaFeatures candidato = new PessoaFisicaFeatures()
    PessoaJuridicaFeatures empresa = new PessoaJuridicaFeatures()

    def onLoad(){
        candidato.onLoad()
        empresa.onLoad()
    }

    def listarCandidatos(){
        candidato.listar()
    }

    def listarEmpresas(){
        empresa.listar()
    }

    def cadastrarEmpresas(){
        empresa.cadastrar()
    }

    def cadastrarCandidatos(){
        candidato.cadastrar()
    }
}
