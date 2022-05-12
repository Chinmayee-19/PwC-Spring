package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.entity.Account;

@Component
@ComponentScan("com")
public class ClientConfig {
	@Bean
	public Account rahulAccount() {
		return new Account("SB500","Rahul Prakash",8590.50);
	}
	
}
