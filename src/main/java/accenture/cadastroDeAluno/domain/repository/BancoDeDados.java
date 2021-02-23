package accenture.cadastroDeAluno.domain.repository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

    public class BancoDeDados {
        private BancoDeDados (){throw new UnsupportedOperationException();}
        public static Connection getConnection() {
            Connection con = null;
            try (InputStream input = BancoDeDados .class.getClassLoader().getResourceAsStream("application.properties")) {
                Properties prop = new Properties();
                prop.load(input);
                String driver = prop.getProperty("jdbc.driver");
                String baseName = prop.getProperty("db.name");
                String address = prop.getProperty("db.address");
                String user = prop.getProperty("db.user.login");
                String pass = prop.getProperty("db.user.password");


//        String user="root";
//        String pass="";
//        String baseName="sitebuilder";
//        String address="localhost";
//        String driver="mysql";

                StringBuilder sb = new StringBuilder("jdbc:")
                        .append(driver)
                        .append("://")
                        .append(address)
                        .append("/")
                        .append(baseName);

                String connectURL = sb.toString();
                try {
                    con = DriverManager.getConnection(connectURL, user, pass);
                    System.out.println("Sucesso");
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Falhou");
                }
                return con;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return con;
        }
        public static void main(String[] args){
            try( Connection db = BancoDeDados.getConnection()){
                System.out.println("sucesso");
            }catch(SQLException e){
                e.printStackTrace();
            }

        }
    }
