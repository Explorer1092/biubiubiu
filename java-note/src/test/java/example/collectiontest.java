package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shen on 2017/4/15.
 */
public class collectiontest {


    public static void listAction() {
        List<String> list = new ArrayList<String>();
        list.add("love");
        int len = list.size();
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        listAction();
    }
}
