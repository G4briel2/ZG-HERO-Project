package com.linketinder.validators

class IntValidators{

    static int isIntValidator(String toValidate){
        try{
            print(toValidate)
            int response = System.in.newReader().readLine() as int
            response
        }
        catch (Exception ignored){
            println("Valor inválido")
            isIntValidator(toValidate)
        }
    }
}
