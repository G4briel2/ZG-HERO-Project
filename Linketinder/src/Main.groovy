import com.linketinder.features.FeaturesManager

FeaturesManager feat = new FeaturesManager()
feat.onLoad()


boolean repeat = true

do{
    println ("-LinkeTinder-\nEscolha uma opção:\n1 - Listar candidatos\n2 - Listar empresas\n3 - Cadastrar sua empresa\n4 - Cadastre-se\n5 - Sair")
    try{
        int opcao = System.in.newReader().readLine() as int

        switch (opcao){
            case 1:
                feat.listarCandidatos()
                break
            case 2:
                feat.listarEmpresas()
                break
            case 3:
                feat.cadastrarEmpresas()
                break
            case 4:
                feat.cadastrarCandidatos()
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
