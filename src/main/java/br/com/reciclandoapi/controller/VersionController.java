package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.Version;
import br.com.reciclandoapi.repository.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VersionController {

    @Autowired
    VersionRepository repository;

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public List<Version> listVersion() {
        return repository.findAll();
    }

    @RequestMapping(value = "/version/{id}", method = RequestMethod.GET)
    public Optional<Version> listVersionById(@PathVariable("id") String id ) {
        System.out.println("id: " +id);
        return repository.findById(id);
    }

    @RequestMapping(value = "/version", method = RequestMethod.POST)
    public Version save(@RequestBody Version version) {
        return repository.save(version);
    }

    @RequestMapping(value = "/version", method = RequestMethod.PUT)
    public Version edit(@RequestBody Version version) {
        return repository.save(version);
    }
}