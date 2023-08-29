package com.linketinder.unittests

import com.linketinder.models.Empresa;
import com.linketinder.models.Habilidades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void testDoConstrutorDeEmpresa(){
        Empresa empresa = new Empresa("BestPay", "bestpay_pay@bestpay.com", "BestPay é o melhor lugar para pagar suas contas", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK], "12.123.123/1234-12", "Brasil", "Santa Catarina", "51295-581")

        String nomeEsperado = "BestPay"
        String emailEsperado = "bestpay_pay@bestpay.com"
        String descricaoEsperada = "BestPay é o melhor lugar para pagar suas contas"
        ArrayList<Habilidades> competenciaEsperada = [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK]
        String cnpjEsperado = "12.123.123/1234-12"
        String paisEsperado = "Brasil"
        String estadoEsperado = "Santa Catarina"
        String cepEsperado = "51295-581"

        assertEquals(nomeEsperado, empresa.getNome())
        assertEquals(emailEsperado, empresa.getEmail())
        assertEquals(descricaoEsperada, empresa.getDescricao())
        assertEquals(competenciaEsperada, empresa.getCompetencias())
        assertEquals(cnpjEsperado, empresa.getCnpj())
        assertEquals(paisEsperado, empresa.getPais())
        assertEquals(estadoEsperado, empresa.getEstado())
        assertEquals(cepEsperado, empresa.getCep())
    }

    @Test
    void testDoToStringDeEmpresa(){
        Empresa empresa = new Empresa("BestPay", "bestpay_pay@bestpay.com", "BestPay é o melhor lugar para pagar suas contas", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK], "12.123.123/1234-12", "Brasil", "Santa Catarina", "51295-581")

        String toStringDeEmpresaEsperado = "empresa: BestPay, requisitos: [Python, Spring Framework], descrição: BestPay é o melhor lugar para pagar suas contas, contato: bestpay_pay@bestpay.com, cnpj: 12.123.123/1234-12, país: Brasil, estado: Santa Catarina, cep: 51295-581"

        assertEquals(toStringDeEmpresaEsperado, empresa.toString())
    }

    @Test
    void testGetESetCnpjDeEmpresa() {
        Empresa empresa = new Empresa("BestPay", "bestpay_pay@bestpay.com", "BestPay é o melhor lugar para pagar suas contas", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK], "12.123.123/1234-12", "Brasil", "Santa Catarina", "51295-581")
        empresa.setCnpj("21.321.321/4321-21")

        String cnpjEsperado = "21.321.321/4321-21"

        assertEquals(cnpjEsperado, empresa.getCnpj())
    }

    @Test
    void testGetESetPaisDeEmpresa() {
        Empresa empresa = new Empresa("BestPay", "bestpay_pay@bestpay.com", "BestPay é o melhor lugar para pagar suas contas", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK], "12.123.123/1234-12", "Brasil", "Santa Catarina", "51295-581")
        empresa.setPais("Argentina")

        String paisEsperado = "Argentina"

        assertEquals(paisEsperado, empresa.getPais())
    }
}