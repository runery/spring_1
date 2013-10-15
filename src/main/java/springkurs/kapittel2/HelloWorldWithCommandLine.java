package springkurs.kapittel2;

/**
 * Created with IntelliJ IDEA.
 * User: rry
 * Date: 08.10.13
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        else {
            System.out.println("Hello World!!");
        }
    }
}
