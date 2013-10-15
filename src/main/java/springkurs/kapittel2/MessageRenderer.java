package springkurs.kapittel2;

/**
 * Created with IntelliJ IDEA.
 * User: rry
 * Date: 08.10.13
 * Time: 13:34
 * To change this template use File | Settings | File Templates.
 */
public interface MessageRenderer {
    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}
