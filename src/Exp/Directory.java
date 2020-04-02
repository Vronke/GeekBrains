package Exp;

import java.util.ArrayList;

public class Directory {
    ArrayList<PhoneInfo> directory = new ArrayList<>();

    public void get(String lastName) {
        for (PhoneInfo p :
                directory) {
            if (p.getLastName().equals(lastName))
                System.out.println(p.getPhone());
        }
    }

    public void add(String lastName, String phone){
        directory.add(new PhoneInfo(lastName, phone));
    }
}
