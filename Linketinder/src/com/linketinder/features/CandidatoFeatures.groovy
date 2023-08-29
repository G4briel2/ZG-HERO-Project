package com.linketinder.features

import com.linketinder.models.Habilidades
import com.linketinder.models.Pessoa
import com.linketinder.models.Candidato

class CandidatoFeatures extends Pessoa{


    ArrayList<Candidato> fixedPessoa = [
            new Candidato("João da Silva", "jaodograu123@gmail.com", "Paraná", "87955-970", "Olá pessoar, eu gosto muito de programar", [Habilidades.PYTHON],"850.183.012-13", 23),
            new Candidato("Mariel Robert", "mrRoberto@hotmail.com.br", "Rio de Janeiro", "20211-901", "Procuro uma \"relação\" séria ", [Habilidades.JAVA],"123.512.321-51", 20),
            new Candidato("Litia Litiana", "litiadescente@gmail.com", "São Paulo", "02045-970", "Sou rápida, direta e precisa", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK],"862.148.291-33", 35),
            new Candidato("Marcos José Miguel", "Jmproducoes@outlook.com", "São Paulo", "02046-050", "Preciso de emprego logo", [Habilidades.PYTHON, Habilidades.JAVA, Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR],"215.215.190-42", 86),
            new Candidato("Gabriel Martins", "gabriel_almeida_m@outlook.com", "São Paulo", "12345-123", "Desenvolvedor da aplicação :)", [Habilidades.JAVA, Habilidades.ANGULAR],"123.456.789-10", 18)
    ]

    List<Candidato> candidatos = new ArrayList<>(fixedPessoa)

    def listar(){
        def i = 1
        candidatos.each {
            println("$i - $it")
            i++
        }
    }

    def cadastrar(String nome, String email, String estado, String cep, String descricao, ArrayList<Habilidades> habilidades, String cpf, int idade){
        candidatos.add(new Candidato(nome, email, estado, cep, descricao, habilidades, cpf, idade))
    }
}

