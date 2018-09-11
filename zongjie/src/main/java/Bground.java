/**
 * @author zhangchen
 * @date 2018-09-03
 */
public class Bground {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {

                System.out.println("pong");
            }
        };
        t.run();
        System.out.println("ping");

    }

}
