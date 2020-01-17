package uebung6.uebung6_3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {

    public enum GenerationType {CamelCase, lowerCase, SnakeCase}

    GenerationType generationType() default GenerationType.lowerCase;
}