package springkurs.kapittel2;

/**
 * Created with IntelliJ IDEA.
 * User: rry
 * Date: 08.10.13
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!!";
    }
}
