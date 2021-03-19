package com.example.demo;

public class BeautyProducer<T> {

    //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
    @SafeVarargs
    public static  <T> void produce(T... t){
        for(T e:t){
            System.out.println(e);
        }
    }
    //错误
    //public  void getBeauty(T t){
    //
    //}
    //正确
    public <T> void getBeauty(T t){

    }

}
class Beauty{
    private String name;
    private Integer type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Integer getType() {
        return type;
    }

    public Beauty(String name, Integer type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Beauty{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}