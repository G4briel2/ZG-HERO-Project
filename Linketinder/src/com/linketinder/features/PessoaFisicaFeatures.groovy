package com.linketinder.features

import com.linketinder.objects.Habilidades
import com.linketinder.objects.Pessoa
import com.linketinder.objects.PessoaFisica

class PessoaFisicaFeatures extends Pessoa{
    List<PessoaFisica> candidatos = new ArrayList<>()

    Object fixedPessoa = [
            new PessoaFisica("João da Silva", "jaodograu123@gmail.com", "Paraná", "87955-970", "Olá pessoar, eu gosto muito de programar", [Habilidades.PYTHON],"850.183.012-13", 23),
            new PessoaFisica("Mariel Robert", "mrRoberto@hotmail.com.br", "Rio de Janeiro", "20211-901", "Procuro uma \"relação\" séria ", [Habilidades.JAVA],"123.512.321-51", 20),
            new PessoaFisica("Litia Litiana", "litiadescente@gmail.com", "São Paulo", "02045-970", "Sou rápida, direta e precisa", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK],"862.148.291-33", 35),
            new PessoaFisica("Marcos José Miguel", "Jmproducoes@outlook.com", "São Paulo", "02046-050", "Preciso de emprego logo", [Habilidades.PYTHON, Habilidades.JAVA, Habilidades.SPRING_FRAMEWORK, Habilidades.ANGULAR],"215.215.190-42", 86),
            new PessoaFisica("Gabriel Martins", "gabriel_almeida_m@outlook.com", "São Paulo", "12345-123", "Desenvolvedor da aplicação :)", [Habilidades.JAVA, Habilidades.ANGULAR],"123.456.789-10", 18)
    ]

    def onLoad(){
        fixedPessoa.each {candidatos.add(it)}
    }
}

