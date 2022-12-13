package com.edson.document;
import java.lang.annotation.Documented;


// Crear una anotación personalizada de valor único
// que se anota usando @Documented
// anotación
@Documented @interface CustomAnnotations { String value(); }

// Esta anotación será documentada
@CustomAnnotations("GFG")

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        /// Imprime y muestra la declaración en la consola
        System.out.println("Esta es la funcion main");
    }
}