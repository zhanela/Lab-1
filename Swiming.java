public class Swiming extends Birds implements Face{
    int day;
    int isUnserwater;
    int getIsUnserwater(int isUnserwater){
        this.isUnserwater = isUnserwater;
        isUnserwater = isUnserwater+0;
        return isUnserwater;
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
