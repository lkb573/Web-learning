package kr.re.kitri.hello.model;


import java.util.Date;


public class Member {

    private int member_seq;
    private String userId;
    private String password;
    private String email;
    private int point;
    private Date join_date;

    public Member() {
    }

    public Member(int member_seq, String userId, String password, String email, int point, Date join_date) {
        this.member_seq = member_seq;
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.point = point;
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member_seq=" + member_seq +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", point=" + point +
                ", join_date=" + join_date +
                '}';
    }

    public int getMember_seq() {
        return member_seq;
    }

    public void setMember_seq(int member_seq) {
        this.member_seq = member_seq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }
}
