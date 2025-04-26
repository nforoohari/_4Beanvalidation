package ir.digixo._4beanvalidation.custom;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CouponCodeValidator implements ConstraintValidator<CouponCode, String> {

    //todo: logic validation
    String couponCodePrefix;//OFF70

    @Override
    public void initialize(CouponCode constraintAnnotation) {
        couponCodePrefix=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result;
        if(value!=null)
        {
            result = value.startsWith(couponCodePrefix);
        }
        else
            result = false;
        return result;
    }
}
