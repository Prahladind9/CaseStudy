package edu.prahlad.patterns.creational.abstractFactory.dao;

public class DBDepDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Department to DB");
    }
}
