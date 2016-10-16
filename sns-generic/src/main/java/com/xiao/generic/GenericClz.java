package com.xiao.generic;

import com.xiao.generic.bean.Book;
import sun.misc.BASE64Decoder;

import java.io.IOException;

/**
 * Created by Administrator on 2016/10/16.
 * 在使用泛型类时，虽然传入了不同的泛型实参，但并没有真正意义上生成不同的类型，
 * 传入不同泛型实参的泛型类在内存上只有一个，即还是原来的最基本的类型
 *（本实例中），当然，在逻辑上我们可以理解成多个不同的泛型类型。
 * 参考：http://www.cnblogs.com/lwbqqyumidi/p/3837629.html
 */

public class GenericClz {

    public static void main(String[] args) throws IOException {
        Book<String> book1 = new Book<>("java");
        Book<Integer> book2 = new Book<>(12) ;

        System.out.println(book1.getData());
        System.out.println(book2.getData());

        String serverName = new String((new BASE64Decoder()).decodeBuffer("MTE1LjI4LjIzOC4xNzU="));
        System.out.println(serverName);
    }
}
