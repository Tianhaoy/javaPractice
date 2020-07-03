package com.thy.lambda.test;

import com.thy.lambda.IUserCredential;
import com.thy.lambda.impl.UserCredentialImpl;

import java.util.UUID;
import java.util.function.*;

/**
 * @Author 皓宇QAQ
 * @Date 2020/7/3 22:39
 * @Description:
 */
public class App {
    public static void main(String[] args) {
       /* IUserCredential iUserCredential = new UserCredentialImpl();
        System.out.println(iUserCredential.verifyUser("admin"));*/

        Predicate<String> predicate = (String username) -> {
            return "admin".equals(username);
        };
        System.out.println(predicate.test("admin"));
        System.out.println(predicate.test("manager"));

        Consumer<String> consumer = (String message) -> {
          System.out.println("要发送的消息"+message);
          System.out.println("消息发送成功！");
        };
        consumer.accept("hello,lambda staring..");
        consumer.accept("lambda is very cool！");

        Function<String,Integer> function = (String gender) -> {
            return "man".equals(gender)?0:1;
        };
        System.out.println(function.apply("man"));
        System.out.println(function.apply("woman"));

        Supplier<String> supplier = () -> {
          return UUID.randomUUID().toString();
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        UnaryOperator<String> unaryOperator = (String img)->{
            img += "[100*200]";
            return img;
        };
        System.out.println(unaryOperator.apply("高清美图"));

        BinaryOperator<String> binaryOperator =(String country,String city)->{
          return country + city;
        };
        System.out.println(binaryOperator.apply("中国","杭州"));

        // 1. lambda表达式的基本语法
        /*
        1)声明：就是和lambda表达式绑定的接口类型
        2)参数：包含在一对圆括号中，和绑定的接口中的抽象方法中的参数个数及顺序一致。
        3)操作符：->
        4)执行代码块：包含在一对大括号中，出现在操作符号的右侧

        [接口声明] = (参数) -> {执行代码块};
         */
        ILambda1 i1 = () -> {
            System.out.println("hello imooc!");
            System.out.println("welcome to imooc!");
        };
        i1.test();

        ILambda1 i2 = () -> System.out.println("hello imooc");
        i2.test();

        ILambda2 i21 = (String n, int a) -> {
            System.out.println(n + "say: my year's old is " + a);
        };
        i21.test("jerry", 18);

        ILambda2 i22 = (n, a) -> {
            System.out.println(n + " 说：我今年" + a + "岁了.");
        };
        i22.test("tom", 22);

        ILambda3 i3 = (x, y) -> {
            int z = x + y;
            return z;
        };
        System.out.println(i3.test(11, 22));

        ILambda3 i31 = (x, y) -> x + y;
        System.out.println(i31.test(100, 200));

        /*
        1. lambda表达式，必须和接口进行绑定。
        2. lambda表达式的参数，可以附带0个到n个参数，括号中的参数类型可以不用指定，jvm在运行时，会自动根据绑定的抽象方法中电参数进行推导。
        3. lambda表达式的返回值，如果代码块只有一行，并且没有大括号，不用写return关键字，单行代码的执行结果，会自动返回。
            如果添加了大括号，或者有多行代码，必须通过return关键字返回执行结果。
         */

    }

    // 没有参数，没有返回值的lambda表达式绑定的接口
    interface ILambda1 {
        void test();
    }

    // 带有参数，没有返回值的lambda表达式
    interface ILambda2 {
        void test(String name, int age);
    }

    // 带有参数，带有返回值的lambda表达式
    interface ILambda3 {
        int test(int x, int y);
    }

}
