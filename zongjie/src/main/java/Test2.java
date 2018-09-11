/**
 * @author zhangchen
 * @date 2018-08-23
 */

/**
 * 饿汉式
 *
 * @author zhangchen
 */
class Test1 {


    // 初始化实例对象

    private static Test1 t = new Test1();

    // 私有构造方法

    private Test1() {

    }

    // 提供get方法

    public static Test1 getT() {
        return t;
    }
}

/**
 * 懒汉式
 * 有线程安全问题
 * 需要使用双重锁
 */
class Test3 {
    private static Test3 t = new Test3();


    private Test3() {

    }

    public static Test3 getT() {

        if (t == null) {
            synchronized (Test3.class) {

                if (t == null) {
                    t = new Test3();
                }
            }


        }
        return t;
    }
}


public class Test2 {
    public static void main(String[] args) {
        Test1 t1 = Test1.getT();
        Test1 t = Test1.getT();
        System.out.println(t1 == t);
    }
}

