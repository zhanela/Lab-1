public class Runnig extends Birds implements Face{

    int day;
    float speed;
    float getSpeed(float speed){
        this.speed = speed;
        speed = speed*5.3F;
        return speed;

    }

    @Override
    public void sleep() {
        System.out.printf(day * 14 +"time fly");
    }

    @Override
    public void fly() {
        System.out.println(day * 365 + "day living");
    }
}
