package training;

public class Olive {

    public String oliveName = "Kalamata";
    public long color = 0x000000;

    public Olive() {
    }

    public Olive(String oliveName) {
        this.oliveName = oliveName;
    }

    public Olive(String oliveName, long color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    public String getOliveName() {
        return oliveName;
    }

    public void setOliveName(String oliveName) {
        this.oliveName = oliveName;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Olive{" +
                "oliveName='" + oliveName + '\'' +
                ", color=" + color +
                '}';
    }
}
