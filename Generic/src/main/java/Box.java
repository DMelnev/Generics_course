import java.util.List;

public class Box<T extends Number & Comparable<T>> {
    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
    public double avg(){
        double res = 0;
        for (T element : array){
            res += ((Number) element).doubleValue();
        }
        return res/array.length;
    }
//    public static void method(List<Number> numbers){
//
//    }
    public static void method(List<? extends Number> numbers){

    }

    public int compare(Box<?> another){
//  public int compare(Box<? extends Integer> another){
        return (int)(avg() - another.avg());
    }
}
