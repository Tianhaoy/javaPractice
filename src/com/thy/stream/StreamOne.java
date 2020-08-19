package com.thy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author thy
 * @Date 2020/8/19 17:20
 * @Description:stream基础练习
 */
public class StreamOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        list.add("世界加油");
        long count = list.stream().distinct().count();
        System.out.println(count);

        String[] arr = new String[]{"武汉加油", "中国加油", "世界加油"};
        Stream<String> stream = Arrays.stream(arr);

        stream = Stream.of("武汉加油", "中国加油", "世界加油");

        List<String> list1 = new ArrayList<>();
        list1.add("武汉加油");
        list1.add("中国加油");
        list1.add("世界加油");
        stream = list.stream();

        List<String> list2 = new ArrayList<>();
        list2.add("周杰伦");
        list2.add("王力宏");
        list2.add("王喆");
        list2.add("林俊杰");
        Stream<String> stream2 = list2.stream().filter(x -> x.contains("王"));
        stream2.forEach(System.out::println);
    }
    }


