import com.linketinder.features.PessoaFisicaFeatures
import com.linketinder.features.PessoaJuridicaFeatures

PessoaFisicaFeatures candidato = new PessoaFisicaFeatures()
PessoaJuridicaFeatures empresa = new PessoaJuridicaFeatures()

candidato.onLoad()
empresa.onLoad()

boolean repeat = true

do{
    println ("-LinkeTinder-\nEscolha uma opção:\n1 - Listar candidatos\n2 - Listar empresas\n3 - Cadastrar sua empresa\n4 - Cadastre-se\n5 - Sair")
    try{
        int opcao = System.in.newReader().readLine() as int

        switch (opcao){
            case 1:
                candidato.listar()
                break
            case 2:
                empresa.listar()
                break
            case 3:
                //empresa.cadastrarEmpresas()
                break
            case 4:
                candidato.cadastrar()
                break
            case 5:
                repeat = false
                break
            default:
                println("OPÇÃO INVÁLIDA")
                break
        }

    } catch (Exception ignored){
        println("OPÇÃO INVÁLIDA")
    }
}while (repeat)
