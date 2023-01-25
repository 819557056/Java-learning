package app.xcf.learn.fastjson.check.model.dos;

import lombok.Data;

import java.io.Serializable;

/**
 * (BIdMapping)实体类
 *
 * @author makejava
 * @since 2023-01-05 13:11:13
 */
@Data
public class BidMappingDO implements Serializable {
    private static final long serialVersionUID = -49974999418377917L;
    
    private String pCode;
    
    private String hCode;
    
    private String pName;
    
    private String hName;


}

