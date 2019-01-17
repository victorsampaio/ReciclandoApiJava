package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.CollectPoint;
import br.com.reciclandoapi.repository.CollectPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CollectPointController {

    @Autowired
    CollectPointRepository repository;

    @RequestMapping(value = "/collectpoint", method = RequestMethod.GET)
    public List<CollectPoint> listCollectPoint() {
        return repository.findAll();
    }

    @RequestMapping(value = "/collectpoint/{id}", method = RequestMethod.GET)
    public Optional<CollectPoint> listVersionById(@PathVariable("id") String id) {
        System.out.println("id: " + id);
        return repository.findById(id);
    }

    @RequestMapping(value = "/collectpoint", method = RequestMethod.POST)
    public CollectPoint save(@RequestBody CollectPoint collectPoint) {
        return repository.save(collectPoint);
    }

    @RequestMapping(value = "/collectpoint", method = RequestMethod.PUT)
    public CollectPoint edit(@RequestBody CollectPoint collectPoint) {
        return repository.save(collectPoint);
    }

    @DeleteMapping("/collectpoint/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }

    @RequestMapping(value = "/collectpoint", method = RequestMethod.DELETE)
    public void delete(@RequestBody CollectPoint collectPoint) {
        repository.delete(collectPoint);
    }
}
