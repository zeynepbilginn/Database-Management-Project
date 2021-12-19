package database.project.api.controllers;

import database.project.business.abstracts.DiseaseService;
import database.project.business.abstracts.WorkingTimeService;
import database.project.core.utilites.results.Result;
import database.project.entites.concretes.Disease;
import database.project.entites.concretes.WorkingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/working")
public class WorkingTimeController {

    @Autowired
    public WorkingTimeController(WorkingTimeService workingTimeService) {
        this.workingTimeService = workingTimeService;
    }

    private WorkingTimeService workingTimeService;


    @PostMapping("/add")
    public Result add(@RequestBody WorkingTime workingTime){
        return this.workingTimeService.add(workingTime);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody WorkingTime workingTime){
        return this.workingTimeService.delete(workingTime);
    }

}
