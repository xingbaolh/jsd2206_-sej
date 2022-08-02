package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(200);
        System.out.println("此人年龄"+person.getAge()+"岁");
    }
}
