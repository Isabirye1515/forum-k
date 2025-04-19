package com.lynda.owner.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lynda.owner.placehoder.Owner;
@Repository
@Transactional
public class OwnerDaoImpl  implements OwnerDao {
    @PersistenceContext
    private EntityManager entityManager;

   

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional
    public void addOwner(Owner owner) {
        entityManager.persist(owner);
        entityManager.flush();
    }



    @Override
    @Transactional
    public void updateOwner(Owner owner) {
    String sql = "update Owner o set o.name = :name, o.email = :email, o.phone = :phone where o.id = :id";
    Owner ownerToUpdate = entityManager.createQuery(sql, Owner.class)
            .setParameter("name", owner.getName())
            .setParameter("email", owner.getEmail())
            .setParameter("phone", owner.getPhone())
            .setParameter("id", owner.getId())
            .getSingleResult();
            entityManager.merge(ownerToUpdate);
    }



    @Override
    @Transactional
    public void deleteOwner(Owner owner) {
        entityManager.remove(owner);
    }



    @Override
    @Transactional
    public Owner getOwnerById(int id) {
        String sql = "select o from Owner o where o.id = :id";
        Owner owner = entityManager.createQuery(sql, Owner.class)
                .setParameter("id", id)
                .getSingleResult();
        return owner;
    }



    @Override
    @Transactional
    public List<Owner> getAllOwners() {
        String sql = "SELECT DISTINCT o FROM Owner o LEFT JOIN FETCH o.contact";
        List<Owner> owners = entityManager.createQuery(sql, Owner.class).getResultList();
        
        return owners;
    }



    @Override
    @Transactional
    public Owner getOwnerByName(String name) {
        String sql = "select o from Owner o where o.name = :name";
        Owner owner = entityManager.createQuery(sql, Owner.class)
                .setParameter("name", name)
                .getSingleResult();
        return owner;
        
    }

    
}