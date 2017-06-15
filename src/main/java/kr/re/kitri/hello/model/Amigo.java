package kr.re.kitri.hello.model;


public class Amigo {

    private int amigoId;
    private String name;
    private String phoneNum;
    private String eMail;

    public Amigo() {
    }

    public Amigo(int amigoId, String name, String phoneNum, String eMail) {
        this.amigoId = amigoId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoId=" + amigoId +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    public int getAmigoId() {
        return amigoId;
    }

    public void setAmigoId(int amigoId) {
        this.amigoId = amigoId;
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
