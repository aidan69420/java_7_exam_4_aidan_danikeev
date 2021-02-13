package com.company;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;
import java.util.Random;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        makeFeed();
        chooseAction();
    }
    static void makeFeed(){

        Random r = new Random();


        Cat ct = new Cat("Леопольд", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct1 = new Cat("Том", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct2 = new Cat("Гав", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct3 = new Cat("Мурка", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));


        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List <Cat> list= new ArrayList<>();
        list.add(ct);
        list.add(ct1);
        list.add(ct2);


        Comparator cmp = Comparator. comparingInt(Cat :: getMean );
        list.sort(cmp.reversed());
        System.out.println(gson.toJson(list));
        addCat();
    }

    static void addCat(){
        while(true) {
            System.out.println("Если хотите создать кота, то введите \"Ъ\"");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("ъ") || str.equals("Ъ")) {
                break;
            }
        }
        Random r = new Random();

        Cat ct = new Cat("Леопольд", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct1 = new Cat("Том", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct2 = new Cat("Гав", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct3 = new Cat("Мурка", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Gson gson = new GsonBuilder().setPrettyPrinting(). create();

        List <Cat> list= new ArrayList<>();
        list.add(ct);
        list.add(ct1);
        list.add(ct2);
        list.add(ct3);


        Comparator cmp = Comparator. comparingInt(Cat :: getMean);
        list.sort(cmp.reversed());
        System.out.println(gson.toJson(list));
    }
    public static void chooseAction(){

        Random r = new Random();

        Cat ct = new Cat("Леопольд", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct1 = new Cat("Том", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct2 = new Cat("Гав", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Cat ct3 = new Cat("Мурка", r.nextInt(18)+1, r.nextInt(100),
                r.nextInt(100), r.nextInt(100));

        Gson gson = new GsonBuilder().setPrettyPrinting(). create();

        List <Cat> list= new ArrayList<>();
        list.add(ct);
        list.add(ct1);
        list.add(ct2);
        list.add(ct3);

        Comparator cmp = Comparator. comparingInt(Cat :: getMean );
        list.sort(cmp.reversed());
        System.out.println(gson.toJson(list));


        System.out.println("Введите \"1\", если хотите покормить кошку, \n\"2\" если хотите поиграть с ней, \n\"3\" если хотите ее полечить");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Выберите кота: \nЛеопольд, Том, Гав, Мурка" );
        String i = sc.nextLine();

        switch(num){
            case 1:
                System.out.println("Вы покормили кота :) " + i );
                break;
            case 2:
                System.out.println("Вы поиграли с котом " + i );
                break;
            case 3:
                System.out.println("Вы вылечили кота " + i );
                break;
        }

    }
}

