package example; /**
 * Created by Shen on 2017/7/5.
 */


//public class TestGenerics {
//     //这种是在方法定义上的泛型
//    public <T> T test(T t) {
//        if (t instanceof Integer) {
//            return (T) ((Integer) ((Integer) t + 1));
//        } else {
//            return (T) ((String) t + "sup");
//        }
//    }
//
//    public static void main(String[] args) {
//        TestGenerics t = new TestGenerics();
//        Integer r = t.test(3);
//        String s = t.test("hello");
//        System.out.println(r);
//        System.out.println(s);
//    }
//}




/**
 * 在类上定义泛型，T表示这是一个泛型类
 * @param <T>
 */
public class TestGenerics<T>{
    public T test(T t) {
        if (t instanceof Integer) {
            return (T) ((Integer) ((Integer) t + 1));
        } else {
            return (T) ((String) t + 1);
        }
    }

    public static void main(String[] args) {
        //指定泛型类型是String
        TestGenerics<String> t = new TestGenerics<String>();
        String s = t.test("hello java");
        System.out.println(s);
        // 泛型指定类型Integer
        TestGenerics<Integer> t1 = new TestGenerics<Integer>();
        //返回值类型会自动转换
        Integer r = t1.test(10);
        System.out.println(r);
        Integer p = t1.test(1);

    }




}
// 泛型的使用场景，其实每天都在用，比如List<String> list = new ArrayList<String>(),这个就是泛型应用，对于测试人员而言。
// 结合builder模式，给出一个MapBuilder示例：
