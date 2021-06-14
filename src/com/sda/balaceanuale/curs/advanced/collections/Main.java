package com.sda.balaceanuale.curs.advanced.collections;

import java.util.*;

public class Main {
    public static void listExample() {
        List<String> nameList = new LinkedList<>();
        nameList.add("Ana");
        nameList.add("Bogdan");
        nameList.add("Marius");
        nameList.add("Edi");
        nameList.add("Bogdan");
        nameList.add("Edi");

        //enhanced for
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");
        //classic for (standard)
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println(nameList.get(index));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");
        //Iterable
        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    public static void setExample() {
//        Set<String> nameSet = new HashSet<>(); //nu e ordonat
//        Set<String> nameSet = new LinkedHashSet<>(); //asta e ordonat
        Set<String> nameSet = new TreeSet<>(Comparator.reverseOrder()); //asta e sortat
        nameSet.add("Ana");
        nameSet.add("Bogdan");
        nameSet.add("Marius");
        nameSet.add("Edi");
        nameSet.add("Bogdan");
        nameSet.add("Edi");

        //Iterable
        Iterator<String> iterator = nameSet.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    private static void mapExample() {
//        Map<String, Integer> employeesSalaries = new HashMap<>(); //nu e ordonat
//        Map<String, Integer> employeesSalaries = new LinkedHashMap<>(); //e ordonat
        Map<String, Integer> employeesSalaries = new TreeMap<>(); //e sortat

        employeesSalaries.put("Bogdan", 1234);
        employeesSalaries.put("Ana", 4312);
        employeesSalaries.put("Edi", 2211);
        employeesSalaries.put("Marius", 9999);

        employeesSalaries.put("Bogdan", 1111);
        employeesSalaries.put("Edi", 1111);

        for (Map.Entry<String, Integer> entry : employeesSalaries.entrySet()) {
            String name = entry.getKey();
            Integer salary = entry.getValue();
            System.out.println(name + " are salariu " + salary);
        }
    }

    public static void main(String[] args) {
//        listExample();
//        setExample();
        mapExample();
    }


}
