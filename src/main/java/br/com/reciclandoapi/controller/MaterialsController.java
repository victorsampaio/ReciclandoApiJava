package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.Materials;
import br.com.reciclandoapi.repository.MaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MaterialsController {

    @Autowired
    MaterialsRepository repository;

    @RequestMapping(value = "/materials", method = RequestMethod.GET)
    public List<Materials> listMaterials() {
        return repository.findAll();
    }

    @RequestMapping(value = "/materials/{id}", method = RequestMethod.GET)
    public Optional<Materials> listVersionById(@PathVariable("id") String id) {
        System.out.println("id: " + id);
        return repository.findById(id);
    }

    @RequestMapping(value = "/materials", method = RequestMethod.POST)
    public Materials save(@RequestBody Materials materials) {
        return repository.save(materials);
    }

    @RequestMapping(value = "/materials", method = RequestMethod.PUT)
    public Materials edit(@RequestBody Materials materials) {
        return repository.save(materials);
    }
}