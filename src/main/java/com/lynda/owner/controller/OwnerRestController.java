package com.lynda.owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.owner.placehoder.Owner;
import com.lynda.owner.service.OwnerService;

@RestController
@RequestMapping(value = "/rest")
public class OwnerRestController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping(value = "/owner")
    public ResponseEntity<List<Owner>> getAll(){
        List<Owner> owners = ownerService.getAllOwners();
        return ResponseEntity.ok(owners);
    }
    @GetMapping(value = "/owner/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable int id){
        Owner owner = ownerService.getOwnerById(id);
        return ResponseEntity.ok(owner);
    }
    @GetMapping(value = "/owner/")
    public ResponseEntity<Owner> getOwnerByName(@RequestParam String name){
        Owner owner = ownerService.getOwnerByName(name);
        return ResponseEntity.ok(owner);
    }
    @PostMapping(value = "/addOwner")
    public ResponseEntity<?> addOwner(@RequestBody Owner owner){
        ownerService.addOwner(owner);
        return ResponseEntity.ok("Owner Added successfull");
    }
    
}
