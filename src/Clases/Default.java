
package Clases;

import Interfaz.Interfaz_Conexion;

public class Default implements Interfaz_Conexion{

    @Override
    public void Conectar() {
       System.out.println("Ingrese una palabra clave valida");
    }

    @Override
    public void Desconectar() {
      System.out.println("Ingrese una palabra clave valida");
    }

    
}
