package lk.ijse.repository;

import lk.ijse.Config.SessionFactoryConfiguration;
import lk.ijse.Entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentRepository {

    public Integer saveStudent(Student student){
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(student);
            transaction.commit();
            return id;
        }catch (Exception e){
            transaction.rollback();
            return -1;
        }

    }
}
