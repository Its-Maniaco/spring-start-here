package aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import models.Comment;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        // get name and params of intercepted method
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method: " + methodName);
        logger.info("Params: " + Arrays.asList(arguments));

        // Uncomment below lines and comment the lines 38-41 to see:
        // Aspects can change the parameters and also returned value

        /*
         * Comment comment = new Comment();
         * comment.setText("Not original text");
         * Object[] newArgs = { comment };
         * Object returnedByMethod = joinPoint.proceed(newArgs);
         * logger.info("NEW Method executed and returned " + returnedByMethod);
         * return "FAILED";
         */

        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedByMethod);

        return returnedByMethod;
    }
}
