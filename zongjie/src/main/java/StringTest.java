/**
 * @author zhangchen
 * @date 2018-08-23
 */
public class StringTest {
    public static void main(String[] args) {
        String[] str ={"abcx","absxsdasd","abcqwef"};
        int max;

            String s1 = str[0];
            String s2 = str[1];
            String s3 = str[2];
            int second = s1.length() > s2.length() ? s1.length() : s2.length();
            max = second > s3.length() ? second : s3.length();
        String st = "";
        for (int i = 0; i < max; i++) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            char[] c3 = s3.toCharArray();


            if (c1[i] == c2[i] && c1[i] == c3[i]) {
                st += c1[i];
            } else {
                break;
            }
        }
        System.out.println(st);
    }
}
