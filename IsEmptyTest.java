
import lombok.Data;
import org.springframework.util.StringUtils;

public class IsEmptyTest {
    public static void main(String args[]) {
        String a = "";
        String b = null;
        Hoge hoge = new Hoge();
        hoge.h = "";
        hoge.o = "hoge";

        if (a == null) {
            System.out.println("a is null");
        }

        if (b == null) {
            System.out.println("b is null");
        }
        if (hoge.getH() == null) {
            System.out.println("h is null");
        }
        if (hoge.getO() == null) {
            System.out.println("o is null");
        }
        if (hoge.getG() == null) {
            System.out.println("g is null");
        }

        if (StringUtils.isEmpty(a)) {
            System.out.println("a is empty");
        }
        if (StringUtils.isEmpty(b)) {
            System.out.println("b is empty");
        }
        if (StringUtils.isEmpty(hoge.getH())) {
            System.out.println("h is empty");
        }
        if (StringUtils.isEmpty(hoge.getO())) {
            System.out.println("o is empty");
        }
        if (StringUtils.isEmpty(hoge.getG())) {
            System.out.println("g is empty");
        }

    }

    @Data
    static class Hoge {
        String h;
        String o;
        String g;
    }
}
