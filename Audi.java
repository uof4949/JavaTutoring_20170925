
public class Audi extends Car {

	public Audi(int speed, int weight, int maxspeed) {
		super(speed, weight, maxspeed);
		// TODO Auto-generated constructor stub
	}
	public void Accel() {
		if(this.speed <= this.maxspeed - 20) {
			this.speed += 20;
		}
	}
	
	public void Brake() {
		if(this.speed >= 20) {
			this.speed -= 20;
		}
	}
}
