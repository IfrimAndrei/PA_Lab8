package SQL;

public class Directors {
    private int director_id;
    private int movie_id;
    private String director_name;

    @Override
    public String toString( ) {
        return "Directors{" +
                "director_id=" + director_id +
                ", movie_id=" + movie_id +
                ", director_name='" + director_name + '\'' +
                '}';
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public int getDirector_id( ) {
        return director_id;
    }

    public int getMovie_id( ) {
        return movie_id;
    }

    public String getDirector_name( ) {
        return director_name;
    }
}
