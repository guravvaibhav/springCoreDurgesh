package read_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource("classpath:dbConnection.properties")
public class Config {
	@Autowired
	Environment env;
	
	@Bean("con")
	public Connections getConnection() {
		return new Connections(env.getProperty("url"), env.getProperty("user"), env.getProperty("password"));
	}

}
