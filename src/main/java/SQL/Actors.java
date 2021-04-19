package SQL;

public class Actors {
    private int actor_id;
    private int movie_id;
    private String actor_name;

    @Override
    public String toString( ) {
        return "Actors{" +
                "actor_id=" + actor_id +
                ", movie_id=" + movie_id +
                ", actor_name='" + actor_name + '\'' +
                '}';
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public int getActor_id( ) {
        return actor_id;
    }

    public int getMovie_id( ) {
        return movie_id;
    }

    public String getActor_name( ) {
        return actor_name;
    }
}


