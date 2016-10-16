package com.xiao.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/16.
 * 参考：http://www.cnblogs.com/lwbqqyumidi/p/3837629.html
 */
public class GenericOverrideDemo {

    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>() ;

        List<Integer> list2 = new ArrayList<>() ;

        getData(list1);
        getData(list2);

    }

    public static void getData(List<? extends Number> list){
        System.out.println(list.size());

    }
}
