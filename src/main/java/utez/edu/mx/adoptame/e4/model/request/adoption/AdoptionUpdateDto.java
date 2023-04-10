package utez.edu.mx.adoptame.e4.model.request.adoption;

import utez.edu.mx.adoptame.e4.annotation.ValueOfEnumAccepted;
import utez.edu.mx.adoptame.e4.enums.StateAdoptionApplication;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AdoptionUpdateDto {

    @NotNull(message = "Debe indicar un valor para este campo")
    private Long id;

    @ValueOfEnumAccepted(enumClass = StateAdoptionApplication.class, message = "Este valor no es aceptado para el estado de la adopción")
    @NotEmpty(message = "Debe de indicar un valor")
    private String state;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
