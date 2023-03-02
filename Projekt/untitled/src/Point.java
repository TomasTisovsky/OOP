public class Point {

    private String title;
    private String info;
    private double distanceToPrevious;
    private double distanceToNext;

    public Point(String title, String info, double distanceToPrevious, double distanceToNext) {
        this.title = title;
        this.info = info;
        this.distanceToPrevious = distanceToPrevious;
        this.distanceToNext = distanceToNext;
    }

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

    public double getDistanceToPrevious() {
        return distanceToPrevious;
    }

    public void setDistanceToPrevious(double distanceToPrevious) {
        this.distanceToPrevious = distanceToPrevious;
    }

    public double getDistanceToNext() {
        return distanceToNext;
    }

    public void setDistanceToNext(double distanceToNext) {
        this.distanceToNext = distanceToNext;
    }
}
