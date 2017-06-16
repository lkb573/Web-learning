package kr.re.kitri.hello.model;


import java.util.Date;

public class Post {

    private int post_seq;
    private String title;
    private String content;
    private Date write_date;
    private int memberId;

    public Post() {
    }

    public Post(int post_seq, String title, String content, Date write_date, int memberId) {
        this.post_seq = post_seq;
        this.title = title;
        this.content = content;
        this.write_date = write_date;
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_seq=" + post_seq +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", write_date=" + write_date +
                ", memberId=" + memberId +
                '}';
    }

    public int getPost_seq() {
        return post_seq;
    }

    public void setPost_seq(int post_seq) {
        this.post_seq = post_seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getWrite_date() {
        return write_date;
    }

    public void setWrite_date(Date write_date) {
        this.write_date = write_date;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}