package app.xcf.learn.fastjson.check.model.dos;

import lombok.Data;

import java.io.Serializable;

/**
 * (BIcMapping)实体类
 *
 * @author makejava
 * @since 2023-01-05 13:12:02
 */
@Data
public class BicMappingDO implements Serializable {
    private static final long serialVersionUID = 843997461827644476L;
    
    private String hCode;
    
    private String hName;
    
    private String pCode;
    
    private String pName;



}

