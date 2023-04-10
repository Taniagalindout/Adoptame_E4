package utez.edu.mx.adoptame.e4.annotation;


import utez.edu.mx.adoptame.e4.validation.ValueOfEnumAcceptedValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = ValueOfEnumAcceptedValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValueOfEnumAccepted {

    Class<? extends Enum<?>> enumClass();

    String message() default "{adoptame.constraints.enum.accepted.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload> [] payload() default {};

}
