package lecture02;

import java.util.Scanner;

public class Human {

    String name;
    int age;
    Human(String name,int age) {
        this.name = name;
        this.age = age;
    }





        void print(){
            if(age <= 18){
                System.out.println("生徒：" + name + "は" + age + "さいです");
            }else if(age <= 22){
                System.out.println("学生：" + name + "は" + age + "さいです");
            }
        }



}
