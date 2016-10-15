package com.xiao.pattern.chain;

/**
 *
 * 责任链模式：将能够处理同一类请求的对象连成一条链所提交的请求沿着链传递，
 * 链上的对象逐个判断是否有能力处理该请求，

 如果能则处理，如果不能则传递给链上的下一个对象。
 优点：将请求者和发送者解耦
 简化对象的处理过程
 可以通过改变链中的成员或成员的顺序来动态的新增或则删除责任。

 缺点：不能保证请求一定会执行，可能或落到责任链之外。

 不容易观察运行时的特征，处理请求的方法比较分散。
 实现方式：链表和非链表两种实现，但是使用集合和数组等非链表实现在实际开发中更方便更常用。

 应用：

 窗口事件的处理。
 Java中的异常机制就是一种责任链模式，catch链就是一种责任链。
 JavaScript中的时间冒泡和捕获机制。
 Servlet中的过滤器的链式处理。
 Structs2中拦截器的调用。


 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handRequest();

    }
}
