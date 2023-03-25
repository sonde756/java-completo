package Exercicio_list;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Edson");
        list.add("Juvenal");
        list.add("Eroldo");
        list.add(2, "Maicon");

        System.out.println(list.size() + ":");
        for (String x :
                list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); //predicado

        for (String x :
                list) {
            System.out.println(x);
        }
        System.out.println("-------------------");
        System.out.println("Index of Edson: " + list.indexOf("Edson"));
        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').toList();
        for (String x :
                result) {
            System.out.println(x);
        }
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
        System.out.println(name);


    }
}
