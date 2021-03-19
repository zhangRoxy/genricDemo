package com.example.demo;

public class MoneyProducer<T> {
    public <T> void produce(Money<T> money){
        System.out.println(money);
    }

    public void produce1(Money<? extends Number> money){
        System.out.println(money);
    }
    public <T extends Number> void produce2(Money<T> money){
        System.out.println(money);
    }
    //错误
    //public <T> void produce2(Money<T extends Number> money){
    //    System.out.println(money);
    //}

    public void produce3(Money<? super Integer> t){

    }
}
class Money<T>{

    public <T extends  Number> void setValue(T t){
        System.out.println(t);
    }


}