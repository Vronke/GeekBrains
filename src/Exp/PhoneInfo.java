package Exp;

public class PhoneInfo {
    String lastName;
    String phone;

    public String getLastName() {
        return lastName;
    }

    public PhoneInfo(String lastName, String phone) {
        this.lastName = lastName;
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
