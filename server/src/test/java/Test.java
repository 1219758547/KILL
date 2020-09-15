import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(-1L ^ (-1L << 12));
        System.out.println(Long.toHexString(-1L));
        System.out.println(Long.toHexString((-1L << 12)));
        System.out.println(Long.toHexString(System.currentTimeMillis()));
    }
}
