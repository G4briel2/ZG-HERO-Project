package com.linketinder.objects

import groovy.transform.TupleConstructor

@TupleConstructor
class Pessoa {
    String nome, email, estado, cep, descricao
    ArrayList<Habilidades> competencias
}