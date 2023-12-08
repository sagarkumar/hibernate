package com.sagarpr.manytomany;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        MappingDaoManyToMany mappingDaoManyToMany = new MappingDaoManyToMany();

        Actor akshay = new Actor();
        akshay.setName("Akshay khanna");
        akshay.setBudget(100000);

        mappingDaoManyToMany.saveActor(akshay);
        System.out.println("Just Printing akshay after save: " +akshay);

        Actor katrina = new Actor();
        katrina.setName("Katrina kaif");
        katrina.setBudget(50000);

        mappingDaoManyToMany.saveActor(katrina);
        System.out.println("Just Printing katrina after save: " + katrina);

        Movie singhisking = new Movie();
        singhisking.setName("Singh is King");
        singhisking.setType("Comedy");

        mappingDaoManyToMany.saveMovie(singhisking);
        System.out.println("Just printing singhisking after save: " + singhisking);

        Movie welcome = new Movie();
        welcome.setType("comedy");
        welcome.setName("Welcome");
        mappingDaoManyToMany.saveMovie(welcome);
        System.out.println("Just printing welcome after save: " + singhisking);

        singhisking.setActors(Arrays.asList(akshay,katrina));
        mappingDaoManyToMany.saveMovie(singhisking);
        System.out.println("Just Printing singhisking after adding actors: " + singhisking);

        welcome.setActors(Arrays.asList(akshay,katrina));
        mappingDaoManyToMany.saveMovie(welcome);
        System.out.println("Just printing welcome after save: " + singhisking);

        Actor actor = mappingDaoManyToMany.getActorByActorId(1);
        System.out.println("Actor after fetching from db: " + actor);

    }
}
