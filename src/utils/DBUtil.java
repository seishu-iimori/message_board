package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil{
    private static final String PERSISTENCE_UNIT_NAME = "message_board";
    //PERSISTENCE_UNIT_NAME = "persistence.xmlの一般タブにある名前のところ"
    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }

        return emf;
        }
    }
