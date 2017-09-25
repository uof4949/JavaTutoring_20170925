
public class Car {

	protected int speed = 0;
	protected int weight = 0;
	protected int maxspeed = 0;
	protected static int count = 0;
	
	public Car(int speed, int weight, int maxspeed) {
		this.speed = speed;
		this.weight = weight;
		this.maxspeed = maxspeed;
		this.count++;
	}
	
	public void Accel() {
		if(this.speed <= this.maxspeed - 10) {
			this.speed += 10;
		}
	}
	
	public void Brake() {
		if(this.speed >= 10) {
			this.speed -= 10;
		}
	}
	
	public void Print(Car obj, String name) {
		System.out.println("현재 차 이름 : " + name);
		System.out.println("현재 차의 속력 : " + obj.speed);
		System.out.println("현재 차의 무게 : " + obj.weight);
		System.out.println("현재 차의 최대 속력 : " + obj.maxspeed);
		System.out.println("차의 총 개수 : " + obj.count + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car(0, 3000, 240);
		Truck porter = new Truck(0, 5000, 180);
		Audi a8 = new Audi(0, 2000, 300);
		
		System.out.println("초기화");
		sonata.Print(sonata, "sonata");
		porter.Print(porter, "porter");
		a8.Print(a8, "a8");
		
		for(int i = 0; i < 20; i++) {
			System.out.println(i+1 + "번째 가속");
			sonata.Accel();
			porter.Accel();
			a8.Accel();
		}
		
		sonata.Print(sonata, "sonata");
		porter.Print(porter, "porter");
		a8.Print(a8, "a8");
		
		for(int i = 0; i < 30; i++) {
			System.out.println(i+1 + "번째 제동");
			sonata.Brake();
			porter.Brake();
			a8.Brake();
		}
		
		sonata.Print(sonata, "sonata");
		porter.Print(porter, "porter");
		a8.Print(a8, "a8");
	}

}
