import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test() {
        Box<String, Integer, Float> box1 = new Box<>("satring", 20, 1f);
        Box<String, Integer, Float> box2 = new Box<>("satring", 10, 1.2f);
        float expected = 32.2f;
        float result = box1.getValue() + box2.getValue() + box1.getDigit() + box2.getDigit();
        assertEquals(expected, result,0.001, "equals ");
    }
}