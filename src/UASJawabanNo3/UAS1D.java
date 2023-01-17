package UASJawabanNo3;

import javax.naming.Context;
import java.util.ArrayList;

public class UAS1D {
    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    private String MessageID;
    private String MessageName;

    public void setContext(ArrayList<Context> context) {
        this.context = context;
    }

    private ArrayList<Context> context;

    public String FindWords(ArrayList<String> context, String cari) {
        return cari;
    }
}
