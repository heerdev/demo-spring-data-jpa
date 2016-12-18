package config;

import javax.sql.DataSource;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource({"classpath:application.dev.properties","classpath:application.properties"})

@EnableTransactionManagement
public class ApplicationConfig {
	@Autowired
	Environment env;
	
	private static final Logger log= org.slf4j.LoggerFactory.getLogger(ApplicationConfig.class);
	
	@Bean(name="dataSoruce")
	@Profile("prod")
	DataSource dataSourceProd(){
		log.info("HSQL DB IS GETTING INIT");
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db= builder
				.setType(EmbeddedDatabaseType.HSQL)
				.build();
		return db;
	}
	
	@Bean(name="dataSoruce")
	@Profile("dev")
	DataSource dataSoruceDev(){
		log.info("Postgress DB IS GETTING INIT");

		return DataSourceBuilder
				.create()
				.driverClassName(env.getProperty("driverClassName"))
				.url(env.getProperty("url"))
				.username(env.getProperty("username"))
				.password(env.getProperty("password"))
				.build();
		
		
	}
	@Bean(name="dataSoruce")
	@Profile("test")
	DataSource dataSoruceTest(){
		log.info("TEST DB IS GETTING INIT");

		return DataSourceBuilder
				.create()
				.driverClassName(env.getProperty("driverClassName"))
				.url(env.getProperty("url"))
				.username(env.getProperty("username"))
				.password(env.getProperty("password"))
				.build();
		
		
	}
	
	
}
