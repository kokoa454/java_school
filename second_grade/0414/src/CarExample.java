class Car{
    // private int speed; エラー
    public int speed;

    public void speedUp(){
        if(speed < 80){
            speed++;
        }
    }

    public void speedDown(){
        if(speed > 0){
            speed--;
        }
    }
}

public class CarExample {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.speedUp();
        car.speedUp();
        car.speedDown();
        System.out.println(car.speed);
    }
}
