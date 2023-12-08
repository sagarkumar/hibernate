package com.sagarpr.lifecycle;

import com.sagarpr.HibernateUtil;
import com.sagarpr.manytomany.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ComputerMappingDao {

    public void saveComputer(Computer computer){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(computer);

            computer.setComputerPrice("500");

            // commit transaction
            transaction.commit();

           // session.detach(computer);
            computer.setComputerPrice("900");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
