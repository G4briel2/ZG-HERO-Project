package com.linketinder.objects

import groovy.transform.TupleConstructor

@TupleConstructor
class Pessoa {
    String nome, email, estado, cep, descricao
    ArrayList<Habilidades> competencias

    static def cadastrarHabilidades(String tipo){
        ArrayList<Habilidades> competencias = []

        for(competencia in Habilidades){
            boolean repeat = true

            do{
                println("-----$competencia-----\nDeseja adicionar essa $tipo?\n1 - Sim\n2 - Não")
                try{
                    int opc = System.in.newReader().readLine() as int

                    switch (opc){
                        case 1:
                            competencias.add(competencia as Habilidades)
                            repeat = false
                            break
                        case 2:
                            repeat = false
                            break
                        default:
                            println("Inválido")
                            break
                    }
                } catch (Exception ignored) {
                    println("Inválido")
                }

            }while(repeat)
        }

        competencias
    }

    static String stringValidator(String toValidate, String pattern){

        print(toValidate)
        String response = System.in.newReader().readLine()

        if(validator(pattern, response)){
            response
        }
        else {
            println("Valor inválido")
            stringValidator(toValidate, pattern)
        }
    }

    static boolean validator(String pattern, String toValidate){
        toValidate ==~ pattern
    }

    static int intValidator(String toValidate){
        try{
            print(toValidate)
            int response = System.in.newReader().readLine() as int
            response
        }
        catch (Exception ignored){
            print("Valor inválido")
            intValidator(toValidate)
        }
    }
}