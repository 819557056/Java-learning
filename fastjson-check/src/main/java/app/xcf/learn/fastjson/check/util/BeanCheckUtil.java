package app.xcf.learn.fastjson.check.util;

import org.hibernate.validator.HibernateValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

/**
 * json反序列化验证字段,  基于org.hibernate.validator.HibernateValidator进行验证
 * 依赖：
 *         <dependency>
 *             <groupId>org.springframework.boot</groupId>
 *             <artifactId>spring-boot-starter-validation</artifactId>
 *         </dependency>
 * 注解：
 * hibernate的验证字段验证
 * @ClassName JsonCheckUtil
 * @Description json反序列化验证字段
 * @Author xcf
 * @Date 2023/1/18 下午8:58
 * @Version 1.0.0
 **/
public class BeanCheckUtil {
    private static javax.validation.Validator validatorFast = Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();
    private static Validator validatorAll = Validation.byProvider(HibernateValidator.class).configure().failFast(false).buildValidatorFactory().getValidator();



    /**
     * 校验遇到第一个不合法的字段直接返回不合法字段，后续字段不再校验
     * @author xcf
     * @date 2023/1/25 上午10:56
     * @param domain
     * @return java.util.Set<javax.validation.ConstraintViolation<T>>
     * @Version 1.0.0
     */
    public static <T> Set<ConstraintViolation<T>> validateFast(T domain) {

        try {
            Set<ConstraintViolation<T>> validateResult = validatorFast.validate(domain);
            if(validateResult.size()>0) {
                String path = validateResult.iterator().next().getPropertyPath().toString();
                String message = validateResult.iterator().next().getMessage();
                throw new RuntimeException(path + ":" + message);
            }
            return validateResult;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    /**
     * 校验所有字段并返回不合法字段
     * @author xcf
     * @date 2023/1/18 下午10:22
     * @param domain
     * @return java.util.Set<javax.validation.ConstraintViolation<T>>
     * @Version 1.0.0
     */
    public static <T> Set<ConstraintViolation<T>> validateAll(T domain) throws Exception {
        Set<ConstraintViolation<T>> validateResult = validatorAll.validate(domain);
        if(validateResult.size()>0) {
            Iterator<ConstraintViolation<T>> it = validateResult.iterator();
            while(it.hasNext()) {
                ConstraintViolation<T> cv = it.next();
                System.out.println(cv.getPropertyPath()+"："+cv.getMessage());
            }
        }
        return validateResult;
    }

}
