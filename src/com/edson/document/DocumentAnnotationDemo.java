package com.edson.document;


// Programa Java para ilustrar anotaciones documentadas
// Sin usar la anotación @Documentada

// Crear una anotación personalizada de valor único
@interface CustomAnnotation {
    String value();
}
@CustomAnnotation("GFG")
public class DocumentAnnotationDemo {
    public static void main(String[] args) {
        System.out.println("Este es un metodo Main");
    }
}
