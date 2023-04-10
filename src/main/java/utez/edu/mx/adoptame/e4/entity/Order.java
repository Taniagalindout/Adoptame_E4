package utez.edu.mx.adoptame.e4.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private Long id;
    private double price;
    private String currency;
    private String method;
    private String intent;
    private String description;

}
