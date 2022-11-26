public class Main {

    public static void main(String[] args) {
        Birds br = new Birds();
        System.out.println(br.getWeight(25) + "C");

        Heaps hp = new Heaps();
        System.out.println(hp.getHeight(100)+"cm");

        Runnig ru = new Runnig();
        System.out.println(ru.getSpeed(2)+"m/s");

        Swiming sw = new Swiming();
        System.out.println(sw.getIsUnserwater(0)+"se");

        Flying fl = new Flying();
          System.out.println(fl.getHeight(2)+"min");


    }
}