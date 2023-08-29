package com.linketinder.validators

class StringValidators{

    static String regexStringValidator(String toValidate, String pattern){

        print(toValidate)
        String response = System.in.newReader().readLine()

        if(validator(pattern, response)){
            response
        }
        else {
            println("Valor inválido")
            regexStringValidator(toValidate, pattern)
        }
    }

    static boolean validator(String pattern, String toValidate){
        toValidate ==~ pattern
    }
}

