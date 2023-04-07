package utez.edu.mx.adoptame.e4.model.request.pet;

import utez.edu.mx.adoptame.e4.annotation.ColorAccepted;
import utez.edu.mx.adoptame.e4.annotation.PersonalityAccepted;
import utez.edu.mx.adoptame.e4.annotation.SizeAccepted;
import utez.edu.mx.adoptame.e4.annotation.ValueOfEnumAccepted;
import utez.edu.mx.adoptame.e4.entity.Color;
import utez.edu.mx.adoptame.e4.entity.Personality;
import utez.edu.mx.adoptame.e4.entity.Size;
import utez.edu.mx.adoptame.e4.enums.Sex;
import utez.edu.mx.adoptame.e4.enums.TypePet;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class PetInsertDto {

    @NotEmpty(message = "Debe de indicar el nombre de la mascota")
    @Pattern(regexp = "[a-zA-ZñÑáéíóúÁÉÍÓÚ ]{3,250}", message = "Valor no aceptado")
    private String name;

    @NotEmpty(message = "Debe indicar la edad de la mascota")
    @Pattern(regexp = "[a-zA-Z0-9ñÑ ]{1,40}", message = "Valor no aceptado")
    private String age;

    @ValueOfEnumAccepted(enumClass = Sex.class, message = "Este valor no es aceptado para el sexo")
    private String sex;

    @ValueOfEnumAccepted(enumClass = TypePet.class, message = "Este tipo de mascota no es aceptado")
    private String type;

    @SizeAccepted(message = "Este tamaño no es aceptado")
    @NotNull
    private Size size;

    @ColorAccepted(message = "Este color no es aceptado")
    @NotNull
    private Color color;

    @PersonalityAccepted(message = "Este caracter no es aceptado")
    @NotNull
    private Personality personality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Personality getPersonality() {
        return personality;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }
}
