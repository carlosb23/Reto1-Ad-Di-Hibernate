package com.example.reto1addihibernate.domain;

import java.util.ArrayList;

public interface DAO<T> {

    public ArrayList<T> getAll();
    public T get(Long id);
    public T save(T data);
    public void delete(T data);

}
