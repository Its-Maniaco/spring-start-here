package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// enable annotation to be intercepted at runtime
@Retention(RetentionPolicy.RUNTIME)
// Restrict this annotation to be used with methods
@Target(ElementType.METHOD)
public @interface ToLog {
}
