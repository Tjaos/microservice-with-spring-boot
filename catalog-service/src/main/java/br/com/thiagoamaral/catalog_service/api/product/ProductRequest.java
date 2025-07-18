package br.com.thiagoamaral.catalog_service.api.product;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import br.com.thiagoamaral.catalog_service.model.product.Product;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

    @NotBlank(message = "O Nome não pode estar em branco")
    private String name;

    @Size(max = 500, message = "A Descrição deve ter no máximo {value} caracteres")
    @NotBlank(message = "A Descrição não pode estar em branco")
    private String description;

    @NotNull(message = "O Preço é de preenchimento obrigatório")
    @Min(value = 0, message = "O Preço deve ser pelo menos {value} unidade monetária")
    private Double price;

    public Product build() {
        return Product.builder()
                .name(name)
                .description(description)
                .price(price)
                .build();
    }
}
