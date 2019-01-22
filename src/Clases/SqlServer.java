package Clases;

import Interfaz.Interfaz_Conexion;

public class SqlServer implements Interfaz_Conexion {

    @Override
    public void Conectar() {
     System.out.println("Conectado a la BD Sql Server"); }

    @Override
    public void Desconectar() {
       System.out.println("Descoonectado de la BD Sql Server");}
    
}
