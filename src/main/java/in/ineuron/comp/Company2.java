package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component(value="com2")
@ConfigurationProperties(prefix="org.pwskill")
public class Company2 {

	@Value("${org.pwskill.name}")
	private String name;
	
	@Value("${org.pwskill.owner}")
	private String owner;
	
	@Value("${org.pwskill.worth}")
	private String worth;
	
	public Company2() {
		System.out.println("Zero arg Company2 constuctor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getWorth() {
		return worth;
	}

	public void setWorth(String worth) {
		this.worth = worth;
	}

	@Override
	public String toString() {
		return "Company2 [name=" + name + ", owner=" + owner + ", worth=" + worth + "]";
	}

}
