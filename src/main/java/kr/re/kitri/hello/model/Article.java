package kr.re.kitri.hello.model;


public class Article {

    private String aid;
    private String title;
    private String author;
    private String content;
    //Spring --> Object / DB --> record

    @Override
    public String toString() {
        return "Article{" +
                "aid='" + aid + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
