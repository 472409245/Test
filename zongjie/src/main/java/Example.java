import java.util.HashMap;

public class Example {
    String str = "good";
    char[] ch = {'a', 'b', 'c'};



    public static void main(String args[]) {

        Example ex = new Example();
        HashMap<Object, Object> map = new HashMap<Object, Object>();

        ex.change(ex.str, ex.ch,ex);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[],Example ex) {
        ex.str = "test";
        str = "test ok";
        ch[0] = 'g';
    }
}
