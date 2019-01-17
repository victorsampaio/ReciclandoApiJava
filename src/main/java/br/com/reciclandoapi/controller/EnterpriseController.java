package br.com.reciclandoapi.controller;

import br.com.reciclandoapi.model.Enterprise;
import br.com.reciclandoapi.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseController {

   @Autowired
    EnterpriseRepository repository;

   @RequestMapping (value = "/enterprise", method = RequestMethod.GET)
    public List<Enterprise> listEnterprises(){
       return repository.findAll();
   }

   @RequestMapping( value = "/enterprise", method = RequestMethod.POST)
   public Enterprise save(@RequestBody Enterprise enterprise){
       return repository.save(enterprise);
   }

    @RequestMapping(value = "/enterprise", method = RequestMethod.PUT)
    public Enterprise edit(@RequestBody Enterprise enterprise) {
        return repository.save(enterprise);
    }

}
