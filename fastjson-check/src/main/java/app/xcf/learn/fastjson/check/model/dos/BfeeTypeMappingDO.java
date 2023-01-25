package app.xcf.learn.fastjson.check.model.dos;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * (BFeeTypeMapping)实体类
 *
 * @author makejava
 * @since 2023-01-05 11:44:57
 */
@Data
public class BfeeTypeMappingDO implements Serializable {
    private static final long serialVersionUID = 982031288648921031L;

    @NotNull(message = "不能为空")
    private Integer id;

    @NotBlank(message = "itemClass不能为空")
    private String itemClass;
    
    private String feeTypeCode;
    
    private String feeTypeName;

    private String classRange;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}

