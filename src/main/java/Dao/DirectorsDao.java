package Dao;

import SQL.Database;
import SQL.Directors;

import java.util.LinkedList;
import java.util.List;

public class DirectorsDao implements Dao<Directors> {
    List<Directors> directors;
    private final Database db;
    public DirectorsDao(){
        db = Database.getInstance();
        directors = db.getDirectors();
    }
    @Override
    public List<Directors> findById(int id){
        List<Directors> pickedDirectors = new LinkedList<>();
        for( Directors d : directors){
            if( d.getId() == id )
                pickedDirectors.add(d);
        }
        return pickedDirectors;
    }

    @Override
    public List<Directors> findByName(String name){
        List<Directors> pickedActors = new LinkedList<>();
        for( Directors d : directors){
            if( d.getName().equals( name ) )
                pickedActors.add(d);
        }
        return pickedActors;
    }

    @Override
    public List<Directors> getAll( ) {
        return directors;
    }

    @Override
    public void insert(Directors director) {
        directors.add(director);
        String command = " INSERT INTO `lab8`.`directors` (`ID`, `name`) VALUES ( "
                + "'" + director.getId() + "',"
                + "'" + director.getName() + "')"
                ;
    }

    @Override
    public void delete(Directors director) {
        directors.remove(director);
        String command = " DELETE FROM directors WHERE id='" + director.getId() +"'";
        db.executeCommand(command);
    }
}