package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// tells Spring that it is aspect but does not create bean
@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // which methods to intercept
    @Around("execution(* services.*.*(..))")

    // ProceedingJoinPoint represents the intercepted method.
    // this parameter tells aspect when it should delegate to the actual method.
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute");

        // delegate to actual intercepted method
        joinPoint.proceed();

        logger.info("Method executed");
    }
}
