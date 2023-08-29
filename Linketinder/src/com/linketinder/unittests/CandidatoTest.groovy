package com.linketinder.unittests

import com.linketinder.models.Candidato
import com.linketinder.models.Habilidades
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

class CandidatoTest {

    @Test
    void testDoConstrutorDeCandidato(){
        Candidato candidato = new Candidato("João", "joao_213@gmail.com.br", "São Paulo", "12345-123", "Oi, eu sou o João", [Habilidades.ANGULAR, Habilidades.JAVA], "123.123.123-12", 23)

        String nomeEsperado = "João"
        String emailEsperado = "joao_213@gmail.com.br"
        String estadoEsperado = "São Paulo"
        String cepEsperado = "12345-123"
        String descricaoEsperada = "Oi, eu sou o João"
        ArrayList<Habilidades> competenciaEsperada = [Habilidades.ANGULAR, Habilidades.JAVA]
        String cpfEsperado = "123.123.123-12"
        int idadeEsperada = 23

        assertEquals(nomeEsperado, candidato.getNome())
        assertEquals(emailEsperado, candidato.getEmail())
        assertEquals(estadoEsperado, candidato.getEstado())
        assertEquals(cepEsperado, candidato.getCep())
        assertEquals(descricaoEsperada, candidato.getDescricao())
        assertEquals(competenciaEsperada, candidato.getCompetencias())
        assertEquals(cpfEsperado, candidato.getCpf())
        assertEquals(idadeEsperada, candidato.getIdade())
    }

    @Test
    void testDoToStringDeCandidato(){
        Candidato candidato = new Candidato("João", "joao_213@gmail.com.br", "São Paulo", "12345-123", "Oi, eu sou o João", [Habilidades.ANGULAR, Habilidades.JAVA], "123.123.123-12", 23)

        String toStringDeCandidatoEsperado = "candidato: João, skills: [Angular, Java], bio: Oi, eu sou o João, e-mail: joao_213@gmail.com.br, 23 anos, cpf: 123.123.123-12, estado: São Paulo, cep: 12345-123"

        assertEquals(toStringDeCandidatoEsperado, candidato.toString())
    }

    @Test
    void testGetESetCpfDeCandidato() {
        Candidato candidato = new Candidato("João", "joao_213@gmail.com.br", "São Paulo", "12345-123", "Oi, eu sou o João", [Habilidades.ANGULAR, Habilidades.JAVA], "123.123.123-12", 23)
        candidato.setCpf("321.321.321-21")

        String cpfEsperado = "321.321.321-21"

        assertEquals(cpfEsperado, candidato.getCpf())
    }

    @Test
    void testGetESetIdadeDeCandidato() {
        Candidato candidato = new Candidato("João", "joao_213@gmail.com.br", "São Paulo", "12345-123", "Oi, eu sou o João", [Habilidades.ANGULAR, Habilidades.JAVA], "123.123.123-12", 23)
        candidato.setIdade(35)

        int IdadeEsperada = 35

        assertEquals(IdadeEsperada, candidato.getIdade())
    }
}