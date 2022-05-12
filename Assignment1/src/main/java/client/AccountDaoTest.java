/**
 * 
 */
package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Account;

public class AccountDaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(ClientConfig.class);
	  
	  Account rahulAcc = 
			  context.getBean("rahulAccount", Account.class);
	 System.out.println(rahulAcc.getAccountNumber() 
			 		+"," + rahulAcc.getAccountOwner() 
			 		+"," + rahulAcc.getBalance());
	}

}
