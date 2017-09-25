
public class Truck extends Car {
	
	public Truck(int speed, int weight, int maxSpeed) {
		super(speed, weight, maxSpeed);
	}
	public void Accel() {
		if(this.speed <= this.maxspeed - 5) {
			this.speed += 5;
		}
	}
	
	public void Brake() {
		if(this.speed >= 5) {
			this.speed -= 5;
		}
	}
}
