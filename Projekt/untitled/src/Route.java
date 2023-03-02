public class Route {

    public Route(String title, String info, Boolean isActive, double lenght) {
        this.title = title;
        this.info = info;
        this.isActive = isActive;
        this.lenght = lenght;
    }

    private String title;
    private String info;
    private Boolean isActive;
    private double lenght;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


}
