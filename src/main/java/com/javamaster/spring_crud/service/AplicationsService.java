package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.AplicationsDto;
import com.javamaster.spring_crud.exception.ValidationException;

import java.util.List;

public interface AplicationsService {

    AplicationsDto saveAplication(AplicationsDto aplicationsDto) throws ValidationException;

    void deleteAplication(Integer aplicationsId);

//    Aplications getAplication(Integer aplicationId);

    List<AplicationsDto> findAllByUser(Integer userId);

    void updateAplication(AplicationsDto aplicationsDto, Integer userid);

    List<AplicationsDto> findAll();

}
