
package patron.de.diseño.factory;

import Factory.Factory;
import java.util.Scanner;

public class PatronDeDiseñoFactory {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Con que Base de Datos desea conectarse?");
        String respuesta1= scan.next();
        Factory fact= new Factory();
        fact.Factory(respuesta1);
    }
    
}
