

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cap3.ConversorDeNumeroRomano;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ConversorDeNumeroRomanoTest {
    
    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        System.out.println("Simbolo 'I'");
        assertEquals(1, numero);
    }
    
    @Test
    public void deveEntenderOSimboloV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("V");
        System.out.println("Simbolo 'V'");
        assertEquals(5, numero);
    }
    
    @Test
    public void deveEntenderOSimboloII() {
        ConversorDeNumeroRomano romano =  new ConversorDeNumeroRomano();
        int numero = romano.converte("II");
        System.out.println("Simbolo 'II'"); 
        assertEquals(2, numero);
    }
}
