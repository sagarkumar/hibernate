package com.sagarpr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EventDao eventDao = new EventDao();
        Event event = new Event();
        event.setEventName("Marathon");
        event.setEventLocation("Surat");
        eventDao.saveStudent(event);

        List< Event > events = eventDao.getStudents();
        events.forEach(System.out::println);

    }
}
