package com.ensat.controllers;

import com.ensat.entities.Status;
import com.ensat.services.StatusService;
import com.ensat.services.StatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.Map;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class StatusController {

    private StatusService statusService;

    @Autowired
    public void setStatusService(StatusService statusService){
         this.statusService = statusService;
    }

    @GetMapping(value = "/getStatus")
    public Iterable<Status> getStatus(){
        return statusService.listAllStatus();
    }

    @GetMapping(value = "/view")
    public Status view(@RequestParam("id") Integer id){
        return statusService.getStatusById(id);
    }

    @PostMapping(value = "/edit")
    public Status edit(@RequestBody Status status){
        return statusService.saveStatus(status);
    }

    @PostMapping(value = "/delete")
    public String delete(@RequestParam("id") Integer id) {
         statusService.deleteStatus(id);
         return "deleted";
    }

}
