package UASJawabanNo3;

import java.util.ArrayList;

public class UAS1D {


    private String MessageID;
    private String MessageName;
    private ArrayList<String> Context;

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public void setContext(ArrayList<String> context) {
        Context = context;
    }

    public UAS1D(){}
    public UAS1D (String messageID, String messageName, ArrayList<String> context){
        this.MessageID = messageID;
        this.MessageName = messageName;
        this.Context = context;
    }

    public String FindWords(ArrayList<String> context,String cari) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(int i = 0; i < context.size(); i++) {
            if(context.get(i).equals(cari)) {
                indexes.add(i);
            }
        }
        if(indexes.size() == 0) {
            return "Kata '" + cari + "' tidak ada didalam ArrayList Context.";
        }
        else {
            String result = "Kata '" + cari + "' ada di index: ";
            for(int i = 0; i < indexes.size(); i++) {
                result += " " + indexes.get(i);
            }
            return result;
        }
    }
}
