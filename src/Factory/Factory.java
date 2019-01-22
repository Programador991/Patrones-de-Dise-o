package Factory;

import Clases.Default;
import Clases.MySql;
import Clases.SqlServer;

public class Factory {

    String key_word;

    public void Factory(String palabra_clave) {
        this.key_word = palabra_clave.toUpperCase();
        switch (key_word) {
            case "MYSQL":
                MySql conexionMySql = new MySql();
                conexionMySql.Conectar();
                conexionMySql.Desconectar();
                break;
            case "SQL":
                SqlServer conexionSql = new SqlServer();
                conexionSql.Conectar();
                conexionSql.Desconectar();
                break;
            default:
                Default defaul = new Default();
                defaul.Conectar();
                defaul.Desconectar();
                break;
        }
    }
}
