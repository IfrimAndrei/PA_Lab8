package Dao;

import SQL.Actors;
import SQL.Database;
import java.util.LinkedList;
import java.util.List;

class ActorsDao implements Dao<Actors>{
    List<Actors> actors;
    private final Database db;
    public ActorsDao(){
        db = Database.getInstance();
        actors = db.getActors();
    }
    @Override
    public List<Actors> findById(int id){
        List<Actors> pickedActors = new LinkedList<>();
        for( Actors a : actors){
            if( a.getId() == id )
                pickedActors.add(a);
        }
        return pickedActors;
    }

    @Override
    public List<Actors> findByName(String name){
        List<Actors> pickedActors = new LinkedList<>();
        for( Actors a : actors){
            if( a.getName().equals( name ) )
                pickedActors.add(a);
        }
        return pickedActors;
    }

    @Override
    public List<Actors> getAll( ) {
        return actors;
    }

    @Override
    public void insert(Actors actor) {
        actors.add(actor);
        String command = " INSERT INTO `lab8`.`actors` (`ID`, `name`) VALUES ( "
                + "'" + actor.getId() + "',"
                + "'" + actor.getName() + "')"
                ;
    }

    @Override
    public void delete(Actors actor) {
        actors.remove(actor);
        String command = " DELETE FROM actors WHERE id='" + actor.getId() +"'";
        db.executeCommand(command);
    }
}