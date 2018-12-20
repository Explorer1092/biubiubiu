import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class  person{
    private final Date birthDate;

    public person(Date birthDate) {
        this.birthDate = birthDate;
    }


    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1945, Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1956,Calendar.JANUARY,1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }


    /**
     *
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<?> c = methodClass.class;
        Object obj = c.newInstance();
        Method method = c.getMethod("add", int.class, int.class);
        Object result = method.invoke(obj, 1, 1);
        System.out.println(result);

    }
}

class methodClass {
    public int add(int a, int b) {
        int num1 = a, num2 = b, temp;
        for (int i = 2; i < 30; i++) {
            num1 += num2;
            temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.format("%d个数是%d%n", i + 1, num2);
        }
        return num2;
    }
}
