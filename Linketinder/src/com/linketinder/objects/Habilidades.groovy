package com.linketinder.objects

enum Habilidades{
    PHYTON("Phyton"),
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

