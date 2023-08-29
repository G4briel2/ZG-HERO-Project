package com.linketinder.models

enum Habilidades{
    PYTHON("Python"),
    JAVA("Java"),
    SPRING_FRAMEWORK("Spring Framework"),
    ANGULAR("Angular")

    String displayName

    Habilidades(String format) {
        this.displayName = format
    }

    @Override
    String toString(){ displayName }
}

