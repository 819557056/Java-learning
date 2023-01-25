package app.xcf.learn.fastjson.check.model.dos;

import lombok.Data;

import java.io.Serializable;

/**
 * (BGenderMapping)实体类
 *
 * @author makejava
 * @since 2023-01-05 13:12:25
 */
@Data
public class BgenderMappingDO implements Serializable {
    private static final long serialVersionUID = -43728803155077691L;
    
    private String pCode;
    
    private String pName;
    
    private String hCode;
    
    private String hName;


}

