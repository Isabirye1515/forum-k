package com.lynda.owner.dao;

import java.util.List;

import com.lynda.owner.placehoder.Owner;

public interface OwnerDao {
    public void addOwner(Owner owner);
    public void updateOwner(Owner owner);
    public void deleteOwner(Owner owner);
    public Owner getOwnerById(int id);
    public List<Owner> getAllOwners();
    public Owner getOwnerByName(String name);
}
