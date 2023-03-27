package converter;

import com.javamaster.spring_crud.dto.AplicationsDto;
import com.javamaster.spring_crud.entity.Aplications;
import org.springframework.stereotype.Component;

public class AplicationsConverter {


    public Aplications fromAplicationDtoToAplication(AplicationsDto aplicationsDto){
        Aplications aplication = new Aplications();
         aplication.setId(aplication.getId());
         aplication.setOwner(aplicationsDto.getOwner());
         aplication.setAddress(aplicationsDto.getAddress());
         aplication.setLocalDate(aplicationsDto.getLocalDate());
         aplication.setProblemType(aplication.getProblemType());
         aplication.setOperator(aplication.getOperator());
         aplication.setUserId(aplicationsDto.getUserId());
         aplication.setElectric(aplicationsDto.getElectric());

        return aplication;
    }

    public AplicationsDto fromAplicationsToAplicationsDTO(Aplications aplications){


        return AplicationsDto.builder()
                .id(aplications.getId())
                .owner(aplications.getOwner())
                .address(aplications.getAddress())
                .localDate(aplications.getLocalDate())
                .problemType(aplications.getProblemType())
                .operator(aplications.getOperator())
                .userId(aplications.getUserId())
                .electric(aplications.getElectric())
                .build();
    }
}
