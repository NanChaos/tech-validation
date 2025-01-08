package com.nanchaos.tech.config.aop.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 09:53
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AppInterfaceLog {

    /**
     * 是否将入参和返回 打印为 json 建议仅调试时使用
     */
    boolean printJSON() default false;

    /**
     * 接口告警阈值
     * 该大于该值时，more than limit:{}打印为 true
     */
    long alarmThreshold() default 300L;

    /**
     * 当接口异常时，，若为 true，返回默认结构的 error response, 为 false 返回为 null
     */
    boolean useDefaultErrorResp() default true;
}
