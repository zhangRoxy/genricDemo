package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cglib.beans.BeanMap;

import java.util.*;

public class DemoApplication {

    public static void main(String[] args) {
        //ArrayList arrayList=new ArrayList();
        //arrayList.add(1);
        //arrayList.add("a");
        //
        //ArrayList<String> arrayList1= new ArrayList<>();
        //arrayList1.add("1");
        //arrayList1.add("2");
        //ArrayList arrayList2=new ArrayList<String>();
        //CarProducer<Integer> carProducer=new CarProducer<>();
        //CarProducer<Number> carProducer1=new CarProducer<>();

        //carProducer.show(carProducer);
        //carProducer1.show(carProducer1);
        //carProducer.set("2");

        //Beauty beauty=new Beauty("z",1);
        //Beauty beauty1=new Beauty("x",2);
        //BeautyProducer.produce(beauty,beauty1);

        Money<Integer> money=new Money<>();
        money.setValue(1);
        MoneyProducer<String> moneyProducer1=new MoneyProducer();//Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        //moneyProducer.produce(1);
        MoneyProducer<Integer> moneyProducer=new MoneyProducer<>();
        moneyProducer.produce(money);
        Money<String> money1=new Money<>();
        moneyProducer.produce1(money);
        //moneyProducer.produce1(money1);

        //List < String > [ ] list = new ArrayList < String > [ 10 ];//错误
        List < ? > [ ] list = new ArrayList < ? > [ 10 ];
        List<?> [] array=new ArrayList<?>[10];
        List < String > [ ] ls=new ArrayList [ 10 ];
        List<String> list1=new ArrayList<>();
        list1.add("1");

        List<String> list2=new ArrayList<>();
        list2.add("2");

        array[0]=list1;
        array[1]=list2;

        List<String> list3= (List<String>) array[1];
        String i=list3.get(0);
        System.out.println(i);

    }

}
