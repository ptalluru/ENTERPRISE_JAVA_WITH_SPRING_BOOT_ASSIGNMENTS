package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component(value="comp1")
@ConfigurationProperties(prefix = "org.ineuron")
public class Company1 {

	@Value("${name}")
	private String name;
	
	@Value("${type}")
	private String type;
	
	@Value("${location}")
	private String location;

	static {
		System.out.println("Company1.class file is loading...");
	}

	public Company1() {
		System.out.println("Company1 Object is instantiated...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Company.setName()");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		System.out.println("Company.setType()");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
		System.out.println("Company.setLocation()");
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", type=" + type + ", location=" + location + "]";
	}

}
