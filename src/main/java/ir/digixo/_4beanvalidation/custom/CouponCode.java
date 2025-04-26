package ir.digixo._4beanvalidation.custom;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {CouponCodeValidator.class})
public @interface CouponCode {
    String message() default "{must start with OFF70}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    /**
     * @return value the element must be lower or equal to
     */
    String value() default "OFF70";


}
