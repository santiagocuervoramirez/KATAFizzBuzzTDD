import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    /*
    * Problema
    * Escribir un programa que retorne los numeros del 1 al 100
    * Pero para los multiplos de 3 debe devolver 'Fizz' en ves del número
    * Y para los multimos de 5 devolver 'Buzz'.
    * Para los numeros que son multiplos de ambos (3 y 5) se debe devolver FizzBuzz
    * Ejemplo
    * 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 etc*/

    @Test
    public void cuando_el_numero_es_1_retorno_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("1", result);
    }

    @Test
    public void cuando_el_numero_es_2_retorno_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 2;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("2", result);
    }

    @Test
    public void cuando_el_numero_es_4_retorno_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 4;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("4", result);
    }

    @Test
    public void cuando_el_numero_es_3_retorno_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void cuando_el_numero_es_6_retorno_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void cuando_el_numero_es_9_retorno_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void cuando_el_numero_es_5_retorno_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void cuando_el_numero_es_10_retorno_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void cuando_el_numero_es_20_retorno_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 20;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void cuando_el_numero_es_15_retorno_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void cuando_el_numero_es_30_retorno_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 30;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void cuando_el_numero_es_45_retorno_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 45;

        String result = fizzBuzz.values()[number - 1];

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void obtener_100_valores() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] values = fizzBuzz.values();

        Assertions.assertEquals(100, values.length);
    }

}

