package com.edson.retention;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Aquí crearemos 3 anotaciones con
// RetentionPolicy
// Annotation 1
@Retention(RetentionPolicy.SOURCE)

// Interface
@interface SourceRetention
{
    String value() default "Source Retention";
}

// Retention Annotation 2
@Retention(RetentionPolicy.CLASS)

// Interface
@interface ClassRetention
{
    String value() default "Class Retention";
}

// Retention Annotation 3
@Retention(RetentionPolicy.RUNTIME)

// Interface
@interface RuntimeRetention
{
    String value() default "Runtime Retention";
}

// Anotando las clases A, B y C
// con nuestras anotaciones personalizadas
@SourceRetention
class A {
}

@ClassRetention
class B {
}

@RuntimeRetention
class C {
};
public class RetentionPolicyDemo {
    // Main driver method
    public static void main(String[] args)
    {

        // Obteniendo el arreglo de anotaciones usado para
        // anotar las clases A, B y C. Los arreglos a y b serán
        // vacío ya que su anotación se adjunta antes
        // tiempo de ejecución mientras que la matriz c contendrá el
        // Anotación de RuntimeRetention como se marcó con
        // política de retención RUNTIME
        Annotation a[] = new A().getClass().getAnnotations();
        Annotation b[] = new B().getClass().getAnnotations();
        Annotation c[] = new C().getClass().getAnnotations();

        // Imprimiendo el número de anotaciones retenidas de
        // cada clase en tiempo de ejecución
        System.out.println(
                "Número de anotaciones adjuntas a"
                        + "class A en tiempo de ejecución: " + a.length);

        System.out.println(
                "Número de anotaciones adjuntas a"
                        + "class B en tiempo de ejecución: " + b.length);

        System.out.println(
                "Número de anotaciones adjuntas a"
                        + "class C en tiempo de ejecución: " + c.length);

        // Dado que la clase C se anota con una anotación
        // que tiene una política de retención como tiempo de ejecución, por lo que
        // se puede acceder durante el tiempo de ejecución mientras se realizan anotaciones
        // de otras dos clases se descartan antes del tiempo de ejecución
        // para que no se pueda acceder a ellos
        System.out.println(
                "Anotación adjunta a class C: " + c[0]);
    }
}
