package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream in=new FileInputStream("person.obj");
        ObjectInputStream oin=new ObjectInputStream(in);
        Person p =(Person) oin.readObject();
        System.out.println(p);
        oin.close();
    }
}
