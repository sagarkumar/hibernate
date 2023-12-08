package com.sagarpr.manytomany;

import com.sagarpr.HibernateUtil;
import com.sagarpr.onetomany.Department;
import com.sagarpr.onetomany.Professor;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MappingDaoManyToMany {

    public void saveMovie(Movie movie){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(movie);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void saveActor(Actor actor){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(actor);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Movie getMovieByMovieId(int id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Movie.class,id);
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }

    public Actor getActorByActorId(int id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Actor.class,id);
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }
}
