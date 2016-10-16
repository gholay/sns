package com.xiao.generic;

/**
 * Created by Administrator on 2016/10/16.
 */

class GenericInterfaceDemoImpl<T> implements GenericInterfaceDemo<T>{
    private T t ;

    @Override
    public T getVal() {
        return t;
    }

    @Override
    public void setVal(T t) {
        this.t = t ;
    }
}

class GenericInterfaceDemoImpl2 implements GenericInterfaceDemo<String>{
    private String t ;

    @Override
    public String getVal() {
        return t;
    }

    @Override
    public void setVal(String t) {
        this.t = t ;
    }
}


public class GenericInterfaceDemoTest {
    public static void main(String[] args) {
        GenericInterfaceDemo<Integer> demo1 = new GenericInterfaceDemoImpl<>();
        demo1.setVal(100);
        System.out.println(demo1.getVal());

        GenericInterfaceDemo<String> demo2 = new GenericInterfaceDemoImpl2();
        demo2.setVal("gaolei");
        System.out.println(demo2.getVal());


    }

}
