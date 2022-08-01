package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="刘桑";
        int age=55;
        String gender="男";
        String[] otherInfo={"技术好","拍片一流","大家的启蒙老师"} ;
        Person person = new Person(name, age, gender, otherInfo);
        FileOutputStream ou=new FileOutputStream("person.obj");
        ObjectOutputStream oou=new ObjectOutputStream(ou);
        oou.writeObject(person);
        System.out.println("ok");
        oou.close();

    }
}
