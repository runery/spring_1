package springkurs.kapittel2;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: rry
 * Date: 08.10.13
 * Time: 13:49
 * To change this template use File | Settings | File Templates.
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance = null;
    private Properties props = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    private MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream("src/main/resources/msf.properties"));
            // Hente implementasjonsklassene
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer)Class.forName(rendererClass).newInstance();
            provider = (MessageProvider)Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
