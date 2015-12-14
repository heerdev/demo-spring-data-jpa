package com.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class AppConfiguration {


	@Bean
	public BasicDataSource dataSource() throws URISyntaxException {
		/*BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://ec2-50-16-190-77.compute-1.amazonaws.com:5432/d9v2aol7oe1v51?ssl=true&amp;sslfactory=org.postgresql.ssl.NonValidatingFactory");
		dataSource.setUsername("pxdxyrsduewvbf");
		dataSource.setPassword("yk41xyT2RCfSkMxa_kDZnFUSQl");
		return dataSource; */
		
		//URI dbUri = new URI(System.getenv("DATABASE_URL"));

        //String username = dbUri.getUserInfo().split(":")[0];
        //String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://ec2-54-204-39-67.compute-1.amazonaws.com:5432/d7olntougckd1p?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername("felukcgfcwfpps");
        basicDataSource.setPassword("pFwbPiOIwJfsTaWNiYtyXEHbK8");
        return basicDataSource;


		/*URI dbUri = new URI(System.getenv("DB_URL"));
		 	//System.out.println(dbUri.toString());
	        String username = dbUri.getUserInfo().split(":")[0];
	        String password = dbUri.getUserInfo().split(":")[1];
	        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath()+"?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

	        BasicDataSource basicDataSource = new BasicDataSource();
	        basicDataSource.setUrl(dbUrl);
	        basicDataSource.setUsername(username);
	        basicDataSource.setPassword(password);

	     return basicDataSource;
		 */
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setPackagesToScan("com.test.entity");
		emf.setPersistenceProvider(new HibernatePersistenceProvider());
		Properties jpaProperties = new Properties();
		jpaProperties.setProperty("driverClassName", "org.postgresql.Driver");
		jpaProperties.setProperty("hibernate.hbm2ddl.auto", "create");
		jpaProperties.setProperty("hibernate.show_sql", "true");
		jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");	
		emf.setJpaProperties(jpaProperties);
		emf.setDataSource(dataSource);
		return emf;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
}