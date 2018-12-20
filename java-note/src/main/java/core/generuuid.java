import java.util.UUID;

/**
 * @author shenwandong
 * @date 2018-12-14 17:11
 */


public class generuuid {
    public void testUid() {
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid.toString());
        }
    }

    public static void main(String[] args) {
        generuuid uu = new generuuid();
        uu.testUid();
    }
}

