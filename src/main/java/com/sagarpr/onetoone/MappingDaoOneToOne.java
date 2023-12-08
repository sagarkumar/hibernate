package com.sagarpr.onetoone;

import com.sagarpr.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MappingDaoOneToOne {

    public void saveLaptop(Laptop laptop){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(laptop);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void saveStudent(Student student){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Student getStudentById(int id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Student.class,id);
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }
}
