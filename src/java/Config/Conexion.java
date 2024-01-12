
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conexion {
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bd-sifac");
        dataSource.setUsername("root");
        dataSource.setPassword("Alsibar01985");
        return dataSource;
    }
    
}
