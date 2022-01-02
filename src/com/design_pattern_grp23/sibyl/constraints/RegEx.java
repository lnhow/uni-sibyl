package com.design_pattern_grp23.sibyl.constraints;

import com.design_pattern_grp23.sibyl.ValidationConstraint;
import com.design_pattern_grp23.sibyl.rules.RegExRule;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
@ValidationConstraint(validatedBy = RegExRule.class)
public @interface RegEx {
    String message() default "Field must pass regex validation";
    String regexp();
}
