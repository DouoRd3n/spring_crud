package com.javamaster.spring_crud.controller;

import com.javamaster.spring_crud.dto.AplicationsDto;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.service.AplicationsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aplications")
@AllArgsConstructor
@Log
@CrossOrigin
public class AplicationsController {

    private final AplicationsService aplicationsServis;

    @PostMapping("/save")
    public AplicationsDto saveAplivation(@RequestBody AplicationsDto aplicationsDto) throws ValidationException{
        log.info("HandLing save aplication" + aplicationsDto);
        return aplicationsServis.saveAplication(aplicationsDto);
    }

    @GetMapping("/findAllByUserId/{userId}")
    public List<AplicationsDto> findAllByUserId(@PathVariable Integer userId){
        log.info("Handing find all by userId request" + userId );
        return aplicationsServis.findAllByUser(userId);
    }

    @GetMapping("/findAll")
    public List<AplicationsDto> findAll(){
        log.info("Handling find all aplications request");
        return aplicationsServis.findAll();
    }

    @DeleteMapping("/delete/{aplicationId}")
    public ResponseEntity<Void> deleteAplication(@PathVariable Integer aplicationId){
        log.info("Handling delete aplication request: " + aplicationId);
        aplicationsServis.deleteAplication(aplicationId);
        return ResponseEntity.ok().build();
    }
}
