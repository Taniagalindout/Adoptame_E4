package utez.edu.mx.adoptame.e4.validation;

import org.springframework.beans.factory.annotation.Autowired;
import utez.edu.mx.adoptame.e4.annotation.UsernameAccepted;
import utez.edu.mx.adoptame.e4.entity.UserAdoptame;
import utez.edu.mx.adoptame.e4.service.UserAdoptameServiceImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameAcceptedValidator implements ConstraintValidator<UsernameAccepted, String> {

    @Autowired
    private UserAdoptameServiceImpl userAdoptameService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        boolean flag = false;

        if (value != null ) {

            UserAdoptame user = userAdoptameService.findUserByUsername(value);

            if (user != null && user.getId() !=  0) {
                flag = true;
            }
        }

        return flag;
    }
}
