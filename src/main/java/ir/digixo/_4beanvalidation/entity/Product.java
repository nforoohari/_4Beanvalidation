package ir.digixo._4beanvalidation.entity;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class Product {

    private Long id;

    @NotNull(message = "Name can not be null. ")
    @Size(min = 2, max = 50, message = "Name of product must be entered. ")
    private String name;

    @NotNull(message = "Price can not be null. ")
    @Min(value = 0, message = "Price value must be greater than zero. ")
    @Max(value = 50000, message = "Price value must be lower than 50000. ")
    @Digits(integer = 5, fraction = 2, message = "Price value is not valid. ")
    private BigDecimal price;

    @Pattern(regexp = "^[a-zA-Z0-9]{10}", message = "Only 10 numbers or characters. ")
    private String regX;

    public Product() {
    }

    public String getRegX() {
        return regX;
    }

    public void setRegX(String regX) {
        this.regX = regX;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
