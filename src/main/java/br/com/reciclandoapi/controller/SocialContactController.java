package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.SocialContact;
import br.com.reciclandoapi.repository.SocialContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SocialContactController {

    @Autowired
    SocialContactRepository repository;

    @RequestMapping(value = "/socialContact", method = RequestMethod.GET)
    public List<SocialContact> listCollectPoint(){
        return repository.findAll();
    }

    @RequestMapping(value = "/socialContact/{id}", method = RequestMethod.GET)
    public Optional<SocialContact> listVersionById(@PathVariable("id") String id) {
        System.out.println("id: " + id);
        return repository.findById(id);
    }

    @RequestMapping(value = "/socialContact", method = RequestMethod.POST)
    public SocialContact save(@RequestBody SocialContact socialContact) {
        return repository.save(socialContact);
    }

    @RequestMapping(value = "/socialContact", method = RequestMethod.PUT)
    public SocialContact edit(@RequestBody SocialContact socialContact) {
        return repository.save(socialContact);
    }





}
