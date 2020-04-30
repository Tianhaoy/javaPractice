package com.thy.nowCoder;

/**
 * @Author 皓宇QAQ
 * @email 2469653218@qq.com
 * @Date 2020/4/28 18:57
 * @link https://github.com/Tianhaoy
 * @Description:
 */
public class javaTest {
    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }

        void test() {
            System.out.println("Sub.test()flag=" + flag);
        }
    }

    public static void main(String[] args) {
        new javaTest().new Sub(5);
    }
}
