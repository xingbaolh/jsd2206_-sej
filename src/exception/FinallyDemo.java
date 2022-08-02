package exception;
/**
 * finally块
 * finally是异常处理机制的最后一块,它只能跟在try之后或者最后一个catch之后.
 * finally可以保证只要程序执行到try语句块中,无论try中的代码是否出现异常,finally都必
 * 定执行.
 * 通常我们使用finally去完成资源释放这类操作,比如IO中的关闭流操作.
 */
public class FinallyDemo {
    public static void main(String[] args) {

        System.out.println("开始！！！");
        try {
            String st = "null";
            System.out.println(st.length());
            return;
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally中的文件！！！");
        }
        System.out.println("最后");
    }
}
