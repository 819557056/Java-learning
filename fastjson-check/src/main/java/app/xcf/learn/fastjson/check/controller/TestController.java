package app.xcf.learn.fastjson.check.controller;

import app.xcf.learn.fastjson.check.model.dos.BfeeTypeMappingDO;
import app.xcf.learn.fastjson.check.util.BeanCheckUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/18 下午8:43
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private Validator validator;

    @RequestMapping("/fastjson")
    public String test() {


        BfeeTypeMappingDO bfeeTypeMappingDO = new BfeeTypeMappingDO();
//        bfeeTypeMappingDO.setId(1);
//        bfeeTypeMappingDO.setItemClass("setItemClass");
        bfeeTypeMappingDO.setFeeTypeCode("setFeeTypeCode");
        bfeeTypeMappingDO.setFeeTypeName("setFeeTypeName");
        bfeeTypeMappingDO.setClassRange("setClassRange");

        String s1 = JSONObject.toJSONString(bfeeTypeMappingDO);
        Object o = JSONObject.parseObject(s1, Object.class);


        Set<ConstraintViolation<BfeeTypeMappingDO>> validate = validator.validate(bfeeTypeMappingDO);

//        if (!validate.isEmpty()) {
//            validate.stream().forEach(System.out::println);
//            validate.stream().forEach(val->{
//                System.out.println("val.getMessage()" + val.getMessage());
//                System.out.println("val.getMessageTemplate()" + val.getMessageTemplate());
//                System.out.println("val.getPropertyPath()" + val.getPropertyPath());
//                System.out.println("val.getInvalidValue()" + val.getInvalidValue());
//            });
//        }
        //BeanCheckUtil.validateFast(bfeeTypeMappingDO);
        BeanCheckUtil.validateFast(o);


        String s = JSONObject.toJSONString(bfeeTypeMappingDO);


        System.out.println(s);


        return "OK";
    }
}
