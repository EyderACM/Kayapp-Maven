package net.codejava;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class KayappManager {

    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("kayappUnit");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Fisherman newFisherman = new Fisherman();
        newFisherman.setCity("Sisal");
        newFisherman.setEmail("fisherman@fisherman.com");
        newFisherman.setFirstName("Fisher");
        newFisherman.setLastName("Man");
        newFisherman.setPhoneNumber("9999999999");
        newFisherman.setPassword("Fisherprice99");

        entityManager.persist(newFisherman);

        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
