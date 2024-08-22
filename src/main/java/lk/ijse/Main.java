package lk.ijse;

import lk.ijse.Config.SessionFactoryConfiguration;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Session session = SessionFactoryConfiguration.getInstance().getSession();
    }
}