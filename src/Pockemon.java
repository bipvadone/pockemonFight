
public class Pockemon {
	
	private String Name;
	private int Life;
	private int Power;
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLife() {
		return Life;
	}
	public void setLife(int life) {
		Life = life;
	}
	
	
	@Override
	public String toString() {
		return "Pockemon [Name=" + Name + ", Life=" + Life + "]";
	}
	
	

}
