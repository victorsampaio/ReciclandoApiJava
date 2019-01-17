package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.Enterprise;
import br.com.reciclandoapi.model.Profile;
import br.com.reciclandoapi.repository.EnterpriseRepository;
import br.com.reciclandoapi.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository repository;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public List<Profile> listProfile() {
        return repository.findAll();
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Profile save(@RequestBody Profile profile) {
        return repository.save(profile);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.PUT)
    public Profile edit(@RequestBody Profile profile) {
        return repository.save(profile);
    }
}