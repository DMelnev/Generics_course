import java.util.ArrayList;
import java.util.Iterator;

public class Basket<F extends Fruit> implements Iterable<F> {
    private ArrayList<F> list = new ArrayList<>();
    private static int size = 0;


    public void add(F fruit) {
        list.add(fruit);
        size++;
    }

    public float getWeight() {
        float sum = 0;
        for (F element : list) {
            sum += element.getWeight();
        }
        return sum;
    }

    public int compare(Basket<?> basket2) {
        if (getWeight() > basket2.getWeight()) return 1;
        else if (getWeight() < basket2.getWeight()) return -1;
        else return 0;
    }

    public static  void transfer(Basket<F> dest, Basket<F> source) {
        for (Fruit fruit : source){
            dest.add(fruit);
        }
    }

    public void clear() {
        list = new ArrayList<>();
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public F next() {
                return list.get(index++);
            }
        };
    }
}
