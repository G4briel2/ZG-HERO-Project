package com.linketinder.unittests

import com.linketinder.features.EmpresaFeatures
import com.linketinder.models.Empresa
import com.linketinder.models.Habilidades
import org.junit.jupiter.api.Test
import static org.mockito.Mockito.*

import static org.junit.jupiter.api.Assertions.*

class EmpresaFeaturesTest {

    @Test
    void testMetodoDeListarEmpresas() {
        EmpresaFeatures mockEmpresaFeatures = mock(EmpresaFeatures.class)

        mockEmpresaFeatures.listar()
        mockEmpresaFeatures.listar()

        verify(mockEmpresaFeatures, times(2)).listar()
    }

    @Test
    void testCadastrarNovaEmpresaNoArrayDeEmpresas() {
        EmpresaFeatures empresaFeatures = new EmpresaFeatures()
        empresaFeatures.cadastrar("BestPay", "bestpay_pay@bestpay.com", "BestPay é o melhor lugar para pagar suas contas", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK], "12.123.123/1234-12", "Brasil", "Santa Catarina", "51295-581")

        String toStringEsperadoDeEmpresa = "empresa: BestPay, requisitos: [Python, Spring Framework], descrição: BestPay é o melhor lugar para pagar suas contas, contato: bestpay_pay@bestpay.com, cnpj: 12.123.123/1234-12, país: Brasil, estado: Santa Catarina, cep: 51295-581"

        int index = empresaFeatures.empresas.size()-1
        assertEquals(toStringEsperadoDeEmpresa, empresaFeatures.empresas.get(index).toString())
    }

    @Test
    void testTamanhoArrayDeEmpresasAoCadastrarNovaEmpresa(){
        EmpresaFeatures empresaFeatures = new EmpresaFeatures()
        int tamanhoEsperadoAposCadastroDeEmpresa = empresaFeatures.empresas.size()+1

        empresaFeatures.cadastrar("BestPay", "bestpay_pay@bestpay.com", "BestPay é o melhor lugar para pagar suas contas", [Habilidades.PYTHON, Habilidades.SPRING_FRAMEWORK], "12.123.123/1234-12", "Brasil", "Santa Catarina", "51295-581")

        assertEquals(tamanhoEsperadoAposCadastroDeEmpresa, empresaFeatures.empresas.size())
    }

    @Test
    void testGetESetDeEmpresas() {
        EmpresaFeatures empresaFeatures = new EmpresaFeatures()

        Empresa mockEmpresa = mock(Empresa.class)
        empresaFeatures.setEmpresas([mockEmpresa])

        ArrayList<Empresa> getEmpresasEsperado = [mockEmpresa]

        assertEquals(getEmpresasEsperado, empresaFeatures.getEmpresas())
    }
}

