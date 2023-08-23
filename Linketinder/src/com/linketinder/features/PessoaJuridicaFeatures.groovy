package com.linketinder.features

import com.linketinder.objects.Habilidades
import com.linketinder.objects.Pessoa
import com.linketinder.objects.PessoaJuridica

class PessoaJuridicaFeatures extends Pessoa{
    List<PessoaJuridica> empresas = new ArrayList<>()

    Object fixedEmpresa = [
            new PessoaJuridica("Poca-Cola", "Poca@cola.com", "Soda professionals", [Habilidades.JAVA], "60.849.904/0001-18",  "Estados Unidos", "California", "90002"),
            new PessoaJuridica("Arroz-Gostoso", "arroiz@fejao.com.br", "Os melhores almoços brasileiros", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR], "86.225.859/0001-14",  "Brasil", "Santa Catarina", "80010-970"),
            new PessoaJuridica("Beautiffy", "BStudio@beauty.com", "Maior empresa em produtos de beleza", [Habilidades.SPRING_FRAMEWORK], "33.690.494/0001-32",  "Brasil", "São Paulo", "02046-050"),
            new PessoaJuridica("SpaceonautsTech", "nasa_2@fly.com", "Técnologia alienigena", [Habilidades.PYTHON, Habilidades.JAVA, Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR], "20.910.456/0001-04",  "Brasil", "Amazonas", "69000-213"),
            new PessoaJuridica("Império do Boliche", "BestBowling@strike.com.br", "Faça o melhor \"STRIKE!\" da sua vida", [Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR], "88.185.515/0001-54",  "Brasil", "Rio Grande do Sul", "96200-010")
    ]

    def onLoad(){
        fixedEmpresa.each {empresas.add(it)}
    }

    def listar(){
        int i = 1
        empresas.each {
            println("$i - $it")
            i++
        }
    }

    def cadastrar(){
        print("#Cadastrar Empresa#\nNome da empresa: ")
        String _nome = System.in.newReader().readLine()

        String _email = stringValidator("E-mail corporativo: ", /[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})/)

        print("Descrição: ")
        String _descricao = System.in.newReader().readLine()

        println("#Competências#")
        def _competencias = cadastrarHabilidades("competência")

        String _cnpj = stringValidator("CNPJ da empresa: ", /\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}/)

        print("País: ")
        String _pais = System.in.newReader().readLine()

        print("Estado: ")
        String _estado = System.in.newReader().readLine()

        print("CEP: ")
        String _cep = System.in.newReader().readLine()

        empresas.add(new PessoaJuridica(_nome, _email, _descricao, _competencias, _cnpj, _pais, _estado, _cep))
    }

}