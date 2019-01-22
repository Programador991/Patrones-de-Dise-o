package Clases;

import Interfaz.Interfaz_Conexion;

public class MySql implements Interfaz_Conexion{

    @Override
    public void Conectar() {
     System.out.println("Conectado a la BD MySql");
    }

    @Override
    public void Desconectar() {
       System.out.println("Desconectado de la BD MySql"); }
    
}
