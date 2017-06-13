package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class Bslol {

    private String bsnum;
    private String bstitle;
    private String bscontent;
    private String bswirter;
    private String bsclick;


    @Override
    public String toString() {
        return "Bslol{" +
                "bsnum='" + bsnum + '\'' +
                ", bstitle='" + bstitle + '\'' +
                ", bscontent='" + bscontent + '\'' +
                ", bswirter='" + bswirter + '\'' +
                ", bsclick='" + bsclick + '\'' +
                '}';
    }

    public String getBsnum() {
        return bsnum;
    }

    public void setBsnum(String bsnum) {
        this.bsnum = bsnum;
    }

    public String getBstitle() {
        return bstitle;
    }

    public void setBstitle(String bstitle) {
        this.bstitle = bstitle;
    }

    public String getBscontent() {
        return bscontent;
    }

    public void setBscontent(String bscontent) {
        this.bscontent = bscontent;
    }

    public String getBswirter() {
        return bswirter;
    }

    public void setBswirter(String bswirter) {
        this.bswirter = bswirter;
    }

    public String getBsclick() {
        return bsclick;
    }

    public void setBsclick(String bsclick) {
        this.bsclick = bsclick;
    }
}
