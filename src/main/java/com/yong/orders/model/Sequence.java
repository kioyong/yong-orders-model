package com.yong.orders.model;

import com.yong.orders.model.base.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by LiangYong on 2017/7/26.
 */
@Document(collection = "sequenceConfig")
public class Sequence extends BaseEntity{

    @Id
    private String id;

    @Field
    private Long sequenceNo;

    public Sequence(){}

    public Sequence(String id,Long sequenceNo){
        this.id=id;
        this.sequenceNo=sequenceNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }


}
