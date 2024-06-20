package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component(value="com1")
@ConfigurationProperties(prefix="in.telusko")
public class Company1 {

	private String name;
	
	private String owner;
	
	private String worth;
	
	public Company1() {
		System.out.println("Zero arg Company1 constuctor");
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
		return "Company1 [name=" + name + ", owner=" + owner + ", worth=" + worth + "]";
	}
	
}
