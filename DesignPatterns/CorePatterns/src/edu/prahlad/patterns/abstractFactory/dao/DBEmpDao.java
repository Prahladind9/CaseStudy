package edu.prahlad.patterns.abstractFactory.dao;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
}
