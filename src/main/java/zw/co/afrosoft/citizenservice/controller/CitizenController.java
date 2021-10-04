package zw.co.afrosoft.citizenservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.citizenservice.domain.Citizen;
import zw.co.afrosoft.citizenservice.service.CitizenService;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @GetMapping("getAll")
    public ResponseEntity<List<Citizen>>  getAllCitizens(){
        List<Citizen> citizens = citizenService.getAllCitizens();
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable int id){
        List<Citizen> citizens = citizenService.getById(id);
        return new ResponseEntity<>(citizens,HttpStatus.OK);
    }
    @PostMapping("add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
        Citizen citizen = citizenService.add(newCitizen);
        return new ResponseEntity<>(citizen, HttpStatus.CREATED);
    }
}
