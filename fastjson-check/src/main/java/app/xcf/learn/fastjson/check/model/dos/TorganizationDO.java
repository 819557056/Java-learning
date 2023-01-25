package app.xcf.learn.fastjson.check.model.dos;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (TOrganization)实体类
 *
 * @author makejava
 * @since 2023-01-05 13:53:21
 */
@Data
public class TorganizationDO implements Serializable {
    private static final long serialVersionUID = 346648850783686032L;
    
    private String orgCode;
    
    private String orgName;
    
    private String loweredOrgName;
    
    private Date createdTime;
    
    private String createUser;
    
    private Date lastModifiedTime;
    
    private String lastModifyUser;
    
    private String description;


}

