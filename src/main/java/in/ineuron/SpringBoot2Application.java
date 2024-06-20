package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.comp.Company1;
import in.ineuron.comp.Company2;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBoot2Application.class, args);
		Company1 company1=context.getBean("com1",Company1.class);
		System.out.println(company1);
		Company2 company2=context.getBean("com2",Company2.class);
		System.out.println(company2);
	}
}
