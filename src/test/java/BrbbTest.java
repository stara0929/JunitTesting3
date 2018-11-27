import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class BrbbTest {

    private Brbb brbb;

    @Before
    public void setUp() throws Exception {
        brbb = new Brbb();
    }


    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void printCombinations_1() {
        int target  = 40;
        int from = 0;
        int index = 0;
        int cnt = 0;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_2() {
        int target  = 5;
        int from = 2;
        int index = 0;
        int cnt = 1;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_3() {
        int target  = 5;
        int from = 3;
        int index = 2;
        int cnt = 3;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_4() {
        int target  = 5;
        int from = 3;
        int index = 0;
        int cnt = 0;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_5() {
        int target  = -1;
        int from = 2;
        int index = 0;
        int cnt = 2;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_6() {
        int target  = 10;
        int from = -1;
        int index = 0;
        int cnt = 3;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_7() {
        int target  = 10;
        int from = 3;
        int index = -1;
        int cnt = 3;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_8() {
        int target  = 10;
        int from = 3;
        int index = 0;
        int cnt = -1;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_9() {
        int target  = 10;
        int from = -1;
        int index = -1;
        int cnt = 0;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_10() {
        int target  = -1;
        int from = -1;
        int index = -1;
        int cnt = -1;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_11() {
        int target  = 5;
        int from = 0;
        int index = 0;
        int cnt = 3;
        brbb.printCombinations(target, from, index, cnt);
    }

    @Test
    public void printCombinations_12() {
        String argsArray[] = new String[]{};
        ByteArrayInputStream in = new ByteArrayInputStream("12".getBytes());
        System.setIn(in);
        Brbb.main(argsArray);
    }
}