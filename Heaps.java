public class Heaps extends Birds implements Face{
    int day;
    float height;
    float getHeight(float height){
        this.height = height;
        height = height*0.5F;
        return height;


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
