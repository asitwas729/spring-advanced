//package org.example.expert;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//
//@Aspect
//public class AspectPractice {
//    @Pointcut("@annotation(org.example.expert.annotation.AccessLog)")
//    private void AccessLogAnnotation(){}
//
//    @Around("trackTimeAnnotation()")    // 포인트컷 지정
//    public Object adviceAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        try {
//            // 메서드 실행 전
//            Object result = joinPoint.proceed();    // 메서드 실행 중
//            // 메서드 실행 후
//            return result;
//        } finally {
//            // 측정 완료
//            Authentication
//            log.info("::: ExecutionTime: {}ms", executionTime);
//        }
//    }
//}
