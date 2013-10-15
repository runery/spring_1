package springkurs.kapittel2;

/**
 * Created with IntelliJ IDEA.
 * User: rry
 * Date: 08.10.13
 * Time: 14:16
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
