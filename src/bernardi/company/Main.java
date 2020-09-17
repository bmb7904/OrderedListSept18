package bernardi.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static class Person implements Comparable<Person>
    {
        private String fname;
        private String lname;

        public Person(String fname, String lname)
        {
            this.fname = fname;
            this.lname = lname;
        }

        public String toString()
        {
            return "(" + this.fname + " " + this.lname + ")";
        }

        @Override
        public int compareTo(Person o) {
            return (this.fname+this.lname).compareTo(o.fname + o.lname);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
/*

        File f = new File("/Users/brettbernardi/Desktop/CompSci221-JavaAdvanced/Homework4/src/bernardi/company/names.txt");
        Scanner sc = new Scanner(f);


        MyLinkedList<Person> list = new MyLinkedList<>();

        while(sc.hasNext())
        {
            list.add(new Person(sc.next(), sc.next()));
        }
*/



        MyLinkedList<Double> list = new MyLinkedList<>();
        list.insert(33.2);
        list.insert(323.2);
        list.insert(11.0);
        list.insert(88.99);
        list.insert(99.3);

        System.out.println(list);

        MyLinkedList<Double> list2 = list.kLargest(3);
        System.out.println(list2);








    }
}
