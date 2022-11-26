public class Flying extends Heaps implements Face {

   int day;
    int height;
    int getHeight(int height){
        this.height =height;

        height = height*60;

        return  height;

    }

    @Override
    public void sleep() {
        System.out.println(day * 10 + "day sleeping");
    }

    @Override
    public void fly() {
        System.out.println(day * 365 + "day living");
    }
}
