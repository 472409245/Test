/**
 * @author zhangchen
 * @date 2018-08-18
 */
class HelloA {
    public HelloA() {
        System.out.println("helloA");
    }

    {
        System.out.println("a class");
    }

    static {
        System.out.println("static a");
    }
}

public class HelloB extends HelloA {
    public HelloB() {
        System.out.println("helloB");
    }

    {
        System.out.println("b class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        System.out.println("start       ");

        new HelloA();
        new HelloB();
        System.out.println("end        ");
    }
}
