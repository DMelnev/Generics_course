import java.util.ArrayList;

public class Basket<F extends Fruit>{
    private ArrayList<F> list = new ArrayList<>();

    public void add(F fruit) {
        list.add(fruit);
    }

    public float getWeight() {
        float sum = 0;

        for (F element : list) {
            sum += element.getWeight();
        }
        return sum;
    }

    public int compare(Basket<?> basket2) {
        return Float.compare(getWeight(), basket2.getWeight());
    }

    public static <T extends Fruit> void transfer(Basket<? extends T> src, Basket<? super T> dst) {
        dst.list.addAll(src.list);
        src.list.clear();
    }

}
