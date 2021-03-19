package com.example.demo;

public class CarProducer<T> implements Producer<T>{
    private T key;

    //虽然在方法中使用了泛型，但是这并不是一个泛型方法。
// 这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
//所以在这个方法中才可以继续使用 T 这个泛型。
    public T getKey() {
        return key;
    }

    //不是泛型方法
    public void setKey(T key) {
        this.key = key;
    }

    public CarProducer() {
    }

    //不是泛型方法
    public CarProducer(T key) {
        this.key = key;
    }

    //不是泛型方法
    @Override
    public void produce(T t) {
       System.out.print(t);
    }

    //不是泛型方法
    @Override
    public T destroy() {
        return null;
    }

    //不是泛型方法
    public void show(CarProducer<?> carProducer){
        System.out.print(carProducer);
    }
    //这是一个泛型方法。
    // 首先在public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T
    // 这个T可以出现在这个泛型方法的任意位置.
    // 泛型的数量也可以为任意多个
    public <T,K> void destroy(T t){

    }

    //不正确的方法，只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
    //public <T> T get(E t){
    //
    //}

    //这个方法也是有问题的，编译器会为我们提示错误信息："UnKnown class 'U' "
    //对于编译器来说U这个类型并未项目中声明过，因此编译也不知道该如何编译这个类。
    //所以这也不是一个正确的泛型方法声明。
    //public void set(U u){
    //    System.out.print(u);
    //}

    //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
    public <E> void getType(E e){

    }
}
