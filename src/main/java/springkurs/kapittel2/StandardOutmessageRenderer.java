package springkurs.kapittel2;

/**
 * Created with IntelliJ IDEA.
 * User: rry
 * Date: 08.10.13
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class StandardOutmessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider = null;
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class: " + StandardOutmessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
