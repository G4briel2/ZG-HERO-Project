package com.linketinder.features

import com.linketinder.models.Habilidades
import com.linketinder.models.Pessoa
import com.linketinder.models.Empresa

class EmpresaFeatures extends Pessoa{

    ArrayList<Empresa> fixedEmpresa = [
            new Empresa("Poca-Cola", "Poca@cola.com", "Soda professionals", [Habilidades.JAVA], "60.849.904/0001-18",  "Estados Unidos", "California", "90002"),
            new Empresa("Arroz-Gostoso", "arroiz@fejao.com.br", "Os melhores almoços brasileiros", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR], "86.225.859/0001-14",  "Brasil", "Santa Catarina", "80010-970"),
            new Empresa("Beautiffy", "BStudio@beauty.com", "Maior empresa em produtos de beleza", [Habilidades.SPRING_FRAMEWORK], "33.690.494/0001-32",  "Brasil", "São Paulo", "02046-050"),
            new Empresa("SpaceonautsTech", "nasa_2@fly.com", "Técnologia alienigena", [Habilidades.PYTHON, Habilidades.JAVA, Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR], "20.910.456/0001-04",  "Brasil", "Amazonas", "69000-213"),
            new Empresa("Império do Boliche", "BestBowling@strike.com.br", "Faça o melhor \"STRIKE!\" da sua vida", [Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR], "88.185.515/0001-54",  "Brasil", "Rio Grande do Sul", "96200-010")
    ]

    List<Empresa> empresas = new ArrayList<>(fixedEmpresa)

    def listar(){
        int i = 1
        empresas.each {
            println("$i - $it")
            i++
        }
    }

    def cadastrar(String nome, String email, String descricao, ArrayList<Habilidades> competencias, String cnpj, String pais, String estado, String cep){
        empresas.add(new Empresa(nome, email, descricao, competencias, cnpj, pais, estado, cep))
    }

}