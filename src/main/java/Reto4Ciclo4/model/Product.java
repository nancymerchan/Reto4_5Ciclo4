package Reto4Ciclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "peripherals")
public class Product {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String description;
    private double price;
    private boolean availability;
    private Integer quantity;
    private String photography;

}
