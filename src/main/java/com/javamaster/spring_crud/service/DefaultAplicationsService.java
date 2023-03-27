package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.AplicationsDto;
import com.javamaster.spring_crud.entity.Aplications;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.repository.AplicationsRepository;
import converter.AplicationsConverter;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DefaultAplicationsService implements AplicationsService {

    private final AplicationsRepository aplicationsRepository;

    private final AplicationsConverter aplicationsConverter;




    @Override
    public AplicationsDto saveAplication(AplicationsDto aplicationsDto) throws ValidationException {
        Aplications savedAplication = aplicationsRepository.save(aplicationsConverter.fromAplicationDtoToAplication(aplicationsDto));

        return aplicationsConverter.fromAplicationsToAplicationsDTO(savedAplication);
    }

    @Override
    public void deleteAplication(Integer aplicationsId) {
        aplicationsRepository.deleteById(aplicationsId);
    }
//
//    @Override
//    public Aplications getAplication(Integer aplicationId) {
//        Optional<Aplications> byId = aplicationsRepository.findById(aplicationId);
//        return null;
//    }

    @Override
    public List<AplicationsDto> findAllByUser(Integer userId) {
        return aplicationsRepository.findAplicationsByUserId(userId).stream()
                .map(aplicationsConverter::fromAplicationsToAplicationsDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void updateAplication(AplicationsDto aplicationsDto, Integer userid) {
           aplicationsRepository.findById(userid);
    }

    @Override
    public List<AplicationsDto> findAll() {
        return aplicationsRepository.findAll().stream()
                .map(aplicationsConverter::fromAplicationsToAplicationsDTO)
                .collect(Collectors.toList());
    }
}
