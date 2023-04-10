package utez.edu.mx.adoptame.e4.validation;

import org.springframework.beans.factory.annotation.Autowired;
import utez.edu.mx.adoptame.e4.annotation.PetAccepted;
import utez.edu.mx.adoptame.e4.entity.Pet;
import utez.edu.mx.adoptame.e4.service.PetServiceImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

public class PetAcceptedValidator implements ConstraintValidator<PetAccepted, Long> {

    @Autowired
    private PetServiceImpl petService;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {

        boolean flag = false;

        if ( value != 0) {

            Optional<Pet> pet = petService.findPetById(value);

            if (pet.isPresent()) {
                flag = true;
            }
        }

        return flag;
    }
}
