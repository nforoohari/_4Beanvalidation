package ir.digixo._4beanvalidation.entity;

import ir.digixo._4beanvalidation.custom.CouponCode;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class Product {

    private Long id;


    @NotNull
    @Size(min = 1, max = 50,message = "is required!!")
    private String name;



    @NotNull
    @Min(value = 0,message = "must be greater than zero")
    @Max(value = 1000,message = "must be lower than 1000")
    private BigDecimal price;

    @Pattern(regexp = "^[a-zA-Z0-9]{10}",message = "only 10 number or char")
    private String regX;

    //custom validation
    @CouponCode(value = "takhfif70",message = "start with takhfif70")
    private String couponCode;

    public Product() {
    }

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
