/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class ConversorDeNumeroRomano {

    public int converte(String numeroEmRomano) {
        int acumulador = 0;
        for(int i = 0; i < numeroEmRomano.length(); i++) {
        acumulador += tabela.get(numeroEmRomano.charAt(i));
            System.out.printf("%s, ",numeroEmRomano.charAt(i));
    }
    return acumulador;
    }
    
    private static Map<Character, Integer> tabela = 
            new HashMap<Character, Integer>(){{
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }};
    
    
            
    
    
    
    }
    
        
      
    
    
    

