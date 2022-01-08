import java.util.ArrayList;

public class Basket<F extends Fruit> {
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
    public int compare(F basket2){
        if (getWeight() > basket2.getWeight()) return 1;
        else if (getWeight() < basket2.getWeight()) return -1;
        else return 0;
    }
    public void transfer(F basket2){

    }
}
