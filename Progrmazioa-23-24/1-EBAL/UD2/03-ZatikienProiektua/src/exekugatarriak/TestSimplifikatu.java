package exekugatarriak;

import model.Zatikia;

public class TestSimplifikatu{
public static void main(String[] args) {
    Zatikia fraccion1 = new Zatikia(1, 2);
    Zatikia fraccion2 = new Zatikia(3, 4);

    Zatikia resultadoSuma = Zatikia.batu(fraccion1, fraccion2);
    resultadoSuma.sinplifikatu();

    Zatikia resultadoMultiplicacion = Zatikia.biderkatu(fraccion1, fraccion2);
    resultadoMultiplicacion.sinplifikatu();

    System.out.println("Resultado de la suma simplificado: " + resultadoSuma.num + "/" + resultadoSuma.den);
    System.out.println("Resultado de la multiplicación simplificado: " + bid + "/" + resultadoMultiplicacion.den);
}}