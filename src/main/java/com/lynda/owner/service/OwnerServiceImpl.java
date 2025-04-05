package com.lynda.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lynda.owner.dao.OwnerDao;
import com.lynda.owner.placehoder.Owner;

@Service("ownerService")
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    @Qualifier("ownerService")
    private OwnerService ownerService;


    @Autowired
    private OwnerDao ownerDao;

    @Override
    public void addOwner(Owner owner) {
     
    }

    @Override
    public void updateOwner(Owner owner) {
     ownerDao.updateOwner(owner);
    }

    @Override
    public void deleteOwner(Owner owner) {
        ownerDao.deleteOwner(owner);
    }

    @Override
    public Owner getOwnerById(int id) {
        return ownerDao.getOwnerById(id);
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerDao.getAllOwners();
    }

    @Override
    public Owner getOwnerByName(String name) {
        return ownerDao.getOwnerByName(name);
    }
     
}
