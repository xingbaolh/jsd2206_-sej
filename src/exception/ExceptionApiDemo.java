package exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            String str="abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("错误！！！");
            System.out.println(e.getMessage());//打印错误信息
            e.printStackTrace();

        }
        System.out.println("end");
    }
}
