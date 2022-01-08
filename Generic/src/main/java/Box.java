public class Box<K, V, F> {
    private K key;
    private V value;
    private F digit;

    public Box(K key, V value, F digit) {
        this.key = key;
        this.value = value;
        this.digit = digit;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public F getDigit() {
        return digit;
    }

    public void setDigit(F digit) {
        this.digit = digit;
    }
}
