import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String, String>();

    IDandPasswords() {

        logininfo.put("Felix", "Pizza");
        logininfo.put("Bro", "PASSWORD");
        logininfo.put("Brocode", "abc123");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
