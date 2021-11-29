package me.hyeonho;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@Inherited
public @interface MyAnnotation {

    public String name() default "hyeonho";

    int number() default 100;

}
