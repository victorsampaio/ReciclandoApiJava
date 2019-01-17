package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.User;
import br.com.reciclandoapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> listCollectPoint(){
        return repository.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Optional<User> listVersionById(@PathVariable("id") String id) {
        System.out.println("id: " + id);
        return repository.findById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return repository.save(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public User edit(@RequestBody User user) {
        return repository.save(user);
    }


}
