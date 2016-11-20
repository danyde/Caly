package be.caly.conf;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * Root configuration of Caly Application
 * @author delphine.ngendahayo
 *
 */
@Configuration
@PropertySource("application-${spring.profiles.active}.properties")
public class AppConfiguration {
	
	
	/*@Bean 
	public static PropertyPlaceholderConfigurer properties() {

	    PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
	    ClassPathResource[] resources = new ClassPathResource[ ] {
	        new ClassPathResource("application.properties")
	    };
	    ppc.setLocations( resources );
	    ppc.setIgnoreUnresolvablePlaceholders( true );
	    ppc.setSearchSystemEnvironment(true);
	    return ppc;
	}*/
	

	@Bean
	@Primary
	public DataSource dataSource(){	   
	   return DataSourceBuilder.create()
				.url("jdbc:hsqldb:mem:testdb")
				.driverClassName("org.hsqldb.jdbcDriver")
				.username("sa")
				.password("sa")
				.build();		   
	}
	
	
}
