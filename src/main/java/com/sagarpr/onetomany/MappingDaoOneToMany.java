package com.sagarpr.onetomany;

import com.sagarpr.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MappingDaoOneToMany {

    public void saveProfessor(Professor professor){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(professor);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void saveDepartment(Department department){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(department);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Department getDepartmentById(int id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Department.class,id);
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }

    public Professor getProfessorById(int id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Professor.class,id);
        } catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }
    }
}
