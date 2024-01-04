package exekutagarriak;

import java.util.Scanner;

import model.MyTable;

public class HiruSeguidan {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        MyTable partida1 = new MyTable();

        int fila, columna;
        boolean posValida, correcto;

        // No salimos hasta que uno gane o no haya mas posibilidades
        while (!partida1.finPartida()) {

            do {

                // mostramos el jugador al que le toca
                partida1.mostrarTurnoActual();

                // muestro el tablero
                partida1.mostrarTablero();

                correcto = false;
                fila = pedirInteger("Dame la fila");
                columna = pedirInteger("Dame la columna");

                // Validamos la posicion
                posValida = partida1.validarPosicion(fila, columna);

                // Si es valido, comprobamos que no haya ninguna marca
                if (posValida) {

                    // Si no hay marca, significa que es correcto
                    if (!partida1.hayValorPosicion(fila, columna)) {
                        correcto = true;
                    } else {
                        System.out.println("Ya hay una marca en esa posicion");
                    }
                } else {
                    System.out.println("La posicion no es valida");
                }

                // Mientras no sea correcto, no salgo
            } while (!correcto);

            // depende del turno, inserta un simbolo u otro
            partida1.insertarEn(fila, columna);

            partida1.cambiaTurno();
        }

        // Muestra el tablero
        partida1.mostrarTablero();

        // Mostramos el ganador
        partida1.mostrarGanador();

    }

    /**
     * Pedimos un numero y lo devolvemos
     *
     * @param mensaje
     * @return
     */
    public static int pedirInteger(String mensaje) {

        System.out.println(mensaje);
        int numero = teclado.nextInt();

        return numero;

    }

}