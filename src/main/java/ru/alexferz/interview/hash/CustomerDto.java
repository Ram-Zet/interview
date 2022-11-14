package ru.alexferz.interview.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDto {
    private String inn;
    private String name;
    private List<Double> payments = new ArrayList<>(); //Суммы платежей

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getInn() {return inn;}
    public void setInn(String inn) {this.inn = inn;}

    public List<Double> getPayments() {return payments;}
    public void setPayments(List<Double> payments) {this.payments = payments;}
}

class CustomerServiceImpl {
    public void doSmth() {
        Map<CustomerDto, String> map = new HashMap<>();
        CustomerDto c1 = new CustomerDto();
        c1.setInn("3444....");
        map.put(c1, "Наш первый клиент");
        //.....
        c1.setName("ООО Ромашка");
        //.....
        String s = map.get(c1);
        System.out.println(s);
        //Some useful code
    }
}

class Smth2 {
    public void doSmth() {
        Map<CustomerDto, String> map = new HashMap<>();
        CustomerDto c1 = new CustomerDto();
        c1.setInn("3444....");
        map.put(c1, "Наш первый клиент");
        //.....
        c1.setName("ООО Ромашка");
        //.....
        String s = map.get(c1);
        System.out.println(s);
    }
}

// можем ли мы использовать этот класс в качестве ключа в HashMap?
// Если добавить equals и hashCode - можно ли его использовать тогда?
// Как сделать класс иммутабельным?
// Что еще не так с этим классом? -- Double
