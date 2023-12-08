package com.sagarpr.simplesave;

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

        Organizer organizer = new Organizer();
        organizer.setOrganizerName("MAruti");
        organizer.setOrganizerAddress("140 China");

        event.setOrganizer(organizer);
        eventDao.saveStudent(event);

        List< Event > events = eventDao.getStudents();
        events.forEach(System.out::println);

        Event event1 = eventDao.getEventById();
        System.out.println(event1);

    }
}
