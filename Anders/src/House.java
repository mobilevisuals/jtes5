
public class House {
	private static int number;
	
	private int floors;
	private int windows;
	private String name;
	private boolean complete;
	
	public House(int floors, int windows, String name, boolean complete) {
		this.floors = floors;
		this.windows = windows;
		this.name = name;
		this.complete = complete;
		number++;
	}
	
	@Override
	public String toString() {
		return "House [floors=" + floors + ", windows=" + windows + ", name=" + name + ", complete=" + complete + "]";
	}

	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		House.number = number;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
}
