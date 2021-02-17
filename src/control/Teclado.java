
package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
    
    public  String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }  
     
        // Funcion para capturar un entero desde el teclado
        public  int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }  

    
}
