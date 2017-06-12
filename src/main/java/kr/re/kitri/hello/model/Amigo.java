package kr.re.kitri.hello.model;


public class Amigo {

    private String name;
    private String phoneNum;
    private String eMail;

    @Override
    public String toString() {
        return "Amigo{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
