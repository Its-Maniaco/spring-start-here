package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(annotations.ToLog)") // packageName.annotation or it wont be able to locate
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method logged");
    }
}
