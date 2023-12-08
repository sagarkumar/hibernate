package com.sagarpr.simplesave;

import com.sagarpr.HibernateUtil;
import com.sagarpr.simplesave.Event;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EventDao {

    public void saveStudent(Event event) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(event);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Event getEventById(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Event.class,1);
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }

    public List< Event > getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Event", Event.class).list();
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }
}
