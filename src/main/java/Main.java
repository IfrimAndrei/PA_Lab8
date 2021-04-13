import Dao.MoviesDao;
import SQL.Database;
import SQL.Movie;

public class Main {
        public static void main ( String[] args){
                Database myDB = Database.getInstance();
                
                secondExample();
                myDB.disconnect();
        }
        public static void firstExample()
        {
                Database myDB = Database.getInstance();
                MoviesDao dbMovies = new MoviesDao();
                Movie exampleMovie = movieValue();
                dbMovies.insert(exampleMovie);

                myDB.commit();
                System.out.println("Tables.Movie names after insertion");
                for ( Movie m : dbMovies.getAll())
                {
                        System.out.println(m.getTitle());
                }
                dbMovies.delete( exampleMovie );
                myDB.commit();
                System.out.println("\nTables.Movie names after delete");
                for ( Movie m : dbMovies.getAll())
                {
                        System.out.println(m);
                }
        }
        public static void secondExample()
        {
                Database myDB = Database.getInstance();
                MoviesDao dbMovies = new MoviesDao();
                Movie exampleMovie = movieValue();
                dbMovies.insert(exampleMovie);

                myDB.commit();
                System.out.println("Tables.Movie names after insertion");
                for ( Movie m :  myDB.getMovies())
                {
                        System.out.println(m);
                }
                dbMovies.delete( exampleMovie );
                myDB.commit();
                System.out.println("\nTables.Movie names after delete");
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
