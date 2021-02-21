package accenture.cadastroDeAluno.domain.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    public static Connection getConnection() {
        Connection con=null;
        String driver="mysql";
        String address="localhost";
        String nameDatabase="sitebuilder";
        String user="root";
        String pass="";

        StringBuilder sb = new StringBuilder("jdbc:")
            .append(driver)
            .append("://")
            .append(address)
            .append("/")
            .append(nameDatabase);

           String connectionURL  = sb.toString();
           try{
                con = DriverManager.getConnection(connectionURL,user,pass);
                System.out.println("Sucesso !!!");
           }catch (SQLException e){
                System.out.println("Falhou Banco");
                e.printStackTrace();
           }
           return con;
    }
}

