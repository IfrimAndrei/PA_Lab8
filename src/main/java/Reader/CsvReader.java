package Reader;

import java.io.*;
import SQL.Movie;
public class CsvReader {

    public static void main (String[] args){
        Movie myMovie = new Movie();
        String path = "D:\\IMDb movies.csv";
        String line="";
        int id=0;
        try{
            BufferedReader br = new BufferedReader( new FileReader( path ) );
            line=br.readLine();
            while((line = br.readLine())!=null){
                String[] values = line.split( "," );


                myMovie.setId( id );
                id++;
                myMovie.setTitle( values[1] );

                myMovie.setDuration( Integer.parseInt(values[6]) );
                myMovie.setDate(values[4] );
                myMovie.setActors( values[12] );
                myMovie.setDirectors( values[9] );
                if( values[14].contains( "." ) )
                    values[14]=values[14].substring( 0,values[14].indexOf( "." ) );
                myMovie.setScore( Integer.parseInt( values[14] ) );
                System.out.println(myMovie );
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
