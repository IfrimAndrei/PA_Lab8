package SQL;

public class Movie {
    private int id;
    private String title;
    private String date;
    private int score;
    private int duration;
    private String actors;
    private String directors;

    @Override
    public String toString( ) {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", score=" + score +
                ", duration=" + duration +
                ", actors='" + actors + '\'' +
                ", directors='" + directors + '\'' +
                '}';
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getActors( ) {
        return actors;
    }

    public String getDirectors( ) {
        return directors;
    }

    public int getId( ) {
        return id;
    }

    public String getTitle( ) {
        return title;
    }

    public String getDate( ) {
        return date;
    }

    public int getScore( ) {
        return score;
    }

    public int getDuration( ) {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
