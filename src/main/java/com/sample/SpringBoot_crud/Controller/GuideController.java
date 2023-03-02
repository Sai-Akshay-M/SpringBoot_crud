package com.sample.SpringBoot_crud.Controller;

import com.sample.SpringBoot_crud.Model.Guide;
import com.sample.SpringBoot_crud.Repository.GuideRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



//Annotations
@RestController
public class GuideController {

    @Autowired
    private GuideRepo repo;

    @PostMapping("/addGuide")
    public String saveGuide (@RequestBody Guide guide) {
        repo.save(guide);

        return "Added Successfully";
    }

    @GetMapping("/findAllGuides")
    public List<Guide> getGuides(){
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGuide (@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }
}
