
public class Game {
	
	private int id;
	private String name;
	private int pay;
	
	public Game() {
		
	}

	public Game(int id, String name, int pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
