import com.linketinder.features.FeaturesManager
import com.linketinder.models.Habilidades
import com.linketinder.validators.*
import com.linketinder.features.HabilidadesManager

FeaturesManager feat = new FeaturesManager()

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
                print("#Cadastrar Empresa#\nNome da empresa: ")
                String nome = System.in.newReader().readLine()

                String email = StringValidators.regexStringValidator("E-mail corporativo: ", /[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})/)

                print("Descrição: ")
                String descricao = System.in.newReader().readLine()

                println("#Competências#")
                ArrayList<Habilidades> competencias = HabilidadesManager.cadastrarHabilidades("competência")

                String cnpj = StringValidators.regexStringValidator("CNPJ da empresa: ", /\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}/)

                print("País: ")
                String pais = System.in.newReader().readLine()

                print("Estado: ")
                String estado = System.in.newReader().readLine()

                print("CEP: ")
                String cep = System.in.newReader().readLine()

                feat.cadastrarEmpresas(nome, email, descricao, competencias, cnpj, pais, estado, cep)
                break


            case 4:
                print("#Cadastrar candidato#\nInforme seu nome: ")
                String nome = System.in.newReader().readLine()

                String email = StringValidators.regexStringValidator("Informe seu e-mail: ", /[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})/)

                print("Informe seu estado: ")
                String estado = System.in.newReader().readLine()

                print("Informe seu CEP: ")
                String cep = System.in.newReader().readLine()

                print("Crie sua bio: ")
                String descricao = System.in.newReader().readLine()

                println("#Habilidades#")
                ArrayList<Habilidades> habilidades = HabilidadesManager.cadastrarHabilidades("habilidade")

                String cpf = StringValidators.regexStringValidator("Informe seu CPF: ", /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/)

                int idade = IntValidators.isIntValidator("Informe sua idade: ")

                feat.cadastrarCandidatos(nome, email, estado, cep, descricao, habilidades, cpf, idade)
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
