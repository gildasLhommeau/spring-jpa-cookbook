package org.cookbook.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@Configuration
@EnableTransactionManagement
public class H2PersistenceContext {

    @Bean(name = "dataSource")
    @Profile("h2-local")
    public static DataSource localDataSource(){
        return h2Datasource();
    }


    @Bean(name = "dataSource")
    @Profile("test")
    public DataSource testDataSource(){
        return h2Datasource();
    }

    private static EmbeddedDatabase h2Datasource() {
        return new EmbeddedDatabaseBuilder()
                .setType(H2)
                .build();
    }

}
