package Dao;

import java.util.List;

interface Dao<T> {

    List<T> findById(int id);
    List<T> findByName(String name);
    List<T> getAll();
    void insert(T t);
    void delete(T t);

}