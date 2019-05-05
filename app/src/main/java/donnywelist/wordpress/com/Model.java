package donnywelist.wordpress.com;

public class Model {

    private int img1;
    private String title;
    private String desc;

    public Model(int img1, String title, String desc) {
        this.img1 = img1;
        this.title = title;
        this.desc = desc;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
