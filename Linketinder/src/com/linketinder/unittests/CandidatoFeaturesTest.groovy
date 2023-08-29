package com.linketinder.unittests

import com.linketinder.features.CandidatoFeatures
import com.linketinder.models.Candidato
import com.linketinder.models.Habilidades
import org.junit.jupiter.api.Test
import static org.mockito.Mockito.*

import static org.junit.jupiter.api.Assertions.*

class CandidatoFeaturesTest {

    @Test
    void testMetodoDeListarCandidatos() {
        CandidatoFeatures mockCandidatoFeatures = mock(CandidatoFeatures.class)

        mockCandidatoFeatures.listar()
        mockCandidatoFeatures.listar()

        verify(mockCandidatoFeatures, times(2)).listar()
    }

    @Test
    void testCadastrarNovoCandidatoNoArrayDeCandidatos() {
        CandidatoFeatures candidatoFeatures = new CandidatoFeatures()
        candidatoFeatures.cadastrar("João", "joao_213@gmail.com.br", "São Paulo", "12345-123", "Oi, eu sou o João", [Habilidades.ANGULAR, Habilidades.JAVA], "123.123.123-12", 23)

        String toStringEsperadoDeCandidato = "candidato: João, skills: [Angular, Java], bio: Oi, eu sou o João, e-mail: joao_213@gmail.com.br, 23 anos, cpf: 123.123.123-12, estado: São Paulo, cep: 12345-123"

        int index = candidatoFeatures.candidatos.size()-1
        assertEquals(toStringEsperadoDeCandidato, candidatoFeatures.candidatos.get(index).toString())
    }

    @Test
    void testTamanhoArrayDeCandidatosAoCadastrarNovoCandidato(){
        CandidatoFeatures candidatoFeatures = new CandidatoFeatures()

        int tamanhoEsperadoAposCadastroDeCandidato = candidatoFeatures.candidatos.size()+1

        candidatoFeatures.cadastrar("João", "joao_213@gmail.com.br", "São Paulo", "12345-123", "Oi, eu sou o João", [Habilidades.ANGULAR, Habilidades.JAVA], "123.123.123-12", 23)

        assertEquals(tamanhoEsperadoAposCadastroDeCandidato, candidatoFeatures.candidatos.size())
    }

    @Test
    void testGetESetDeCandidatos() {
        CandidatoFeatures candidatoFeatures = new CandidatoFeatures()

        Candidato mockCandidato = mock(Candidato.class)
        candidatoFeatures.setCandidatos([mockCandidato])

        ArrayList<Candidato> getCandidatosEsperado = [mockCandidato]

        assertEquals(getCandidatosEsperado, candidatoFeatures.getCandidatos())
    }
}