package be.david.recycle;

/**
 * Created by David on 19/10/2016.
 */

public class Movie {

    private String title;
    private String description;
    private int poster;

    public Movie() {
    }

    public Movie(String title, String description, int poster) {
        this.title = title;
        this.description = description;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
