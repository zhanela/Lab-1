public class Birds implements Face{
    int day;
    int weight;
    int getWeight(int weight){
        this.weight =  weight;
        weight = weight*100;

        return weight;
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
