package sample;

import java.util.HashMap;

public class IDandPasswords {

    //hash map to store password and username
    HashMap<String, String> LoginInfo = new HashMap<>();

    // put in key and value in the HashMap
    IDandPasswords(){
        LoginInfo.put("12345","1234");
        LoginInfo.put("11111","1111");
    }

    //getter to get LogIN info
    protected  HashMap getLoginINfo(){
        return LoginInfo;
    }

}
