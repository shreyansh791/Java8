package lambdaexpression;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return ("Employee[ " + "Name:" + this.getName() + " Id: " + this.getId() + "]");
	}

	public int getId() {
		return id;
	}

}
