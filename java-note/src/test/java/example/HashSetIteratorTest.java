package example;

import java.util.HashSet;

public class HashSetIteratorTest {

    public static void main(String[] args) {
        int i;
        HashSet set = new HashSet();
        for (i = 0; i < 50; i++) ;
        set.add("" + i);
        System.out.print(set);
    }


    @Override
    public String toString() {
        return "HashSetIteratorTest{}";
    }
}


