import Dao.MoviesDao;
import SQL.Database;
import SQL.Movie;

public class Main {
        public static void main ( String[] args){
                Database myDB = Database.getInstance();
                
                Example();
                myDB.disconnect();
        }

        public static void Example()
        {
                Database myDB = Database.getInstance();
                MoviesDao dbMovies = new MoviesDao();
                Movie exampleMovie = movieValue();
                dbMovies.insert(exampleMovie);

                myDB.commit();
                System.out.println("Movie names after insertion");
                for ( Movie m :  myDB.getMovies())
                {
                        System.out.println(m);
                }
                dbMovies.delete( exampleMovie );
                myDB.commit();
                System.out.println("\nMovie names after delete");
                for ( Movie m : myDB.getMovies())
                {
                        System.out.println(m);
                }
        }
        public static Movie movieValue( )
        {
                Movie exampleMovie = new Movie();
                exampleMovie.setTitle( "IT 2" );
                exampleMovie.setScore( 2 );
                exampleMovie.setId( 5 );
                exampleMovie.setDuration( 100 );
                exampleMovie.setDate( "2000-01-01" );
                return exampleMovie;
        }




}
