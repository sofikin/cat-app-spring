package com.randomcat.app.rest.Controller;

import com.randomcat.app.rest.Models.Breeds;
import com.randomcat.app.rest.Models.Images;
import com.randomcat.app.rest.Models.Favourites;
import com.randomcat.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/search")
    public List<Images> getCats() {
        return userRepo.findRandom12Cats();
    }

    /* display favourites
     @GetMapping(value = "/favourites")
     public List<Favourites> getFavourites() {
         return userRepo.findAll();
     }

      @PostMapping(value = "/favourites/save/{id}")
     save cat to favourites

     public String saveCat(@RequestBody Favourites favourites) {
         userRepo.save(favourites);
         return "Saved...";
    }  */

    @DeleteMapping(value = "/favourites/delete/{id}")
    public String deleteCat(@PathVariable long id) {
        Images deleteCat = userRepo.findById(id).get();
        userRepo.delete(deleteCat);
        return "Delete cat with the id: "+id;
    }
}
