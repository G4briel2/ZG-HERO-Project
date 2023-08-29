package com.linketinder.features

import com.linketinder.models.Habilidades

class HabilidadesManager{
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
}

