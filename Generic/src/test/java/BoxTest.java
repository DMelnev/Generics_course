import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test() {
//        Box<Integer> box = new Box<>(1, 2, 3, 4);
//        Box<Float> box2 = new Box<>(1f, 2f, 3f, 4f);
//        assertEquals(0, box.compare(box2),0.001, "equals ");
//        List<Integer> numbers = new ArrayList<>();
//        Box.method(numbers);
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            num.add(i);
        }
        List<Number> num2 = new ArrayList<>();
        Box.transfer(num, num2);

        assertEquals(0, num.size(), "size test after clear");
        assertEquals(100, num2.size(), "size test after transfer");
    }
}