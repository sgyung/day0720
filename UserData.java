package day0720;

import java.io.Serializable;

/**
 * 직렬화 가능 클래스
 * @author USER
 */
public class UserData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3691619400185001598L;
	
	// transient가 선언되면 직렬화를 방지할 수 있다.
	private /*transient*/ String name;
	private double height;
	private /*transient*/ double weight;
	
	public UserData() {
		
	}

	public UserData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "UserData [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
	
}
